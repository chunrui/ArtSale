package com.lnsf.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnsf.dao.CommentMapper;
import com.lnsf.entities.Comment;
import com.lnsf.entities.CommentExample;
import com.lnsf.service.CommentService;
import com.lnsf.util.PageUtil;
@Service
public class CommentServiceImpl implements CommentService{
	
	@Autowired
	private CommentMapper commentMapper;
	@Override
	public int countByExample(CommentExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(CommentExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Integer cid) {
		// TODO Auto-generated method stub
		Integer result=commentMapper.deleteByPrimaryKey(cid);
		return result;
		//return 0;
	}

	@Override
	public int insert(Comment record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Comment record) {
		// TODO Auto-generated method stub
		//姓名判断，id判断
		int result=-1;
		try {
			result = commentMapper.insertSelective(record);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result>0){
			return result;
		}else{
			return result;
		}
	}

	@Override
	public List<Comment> selectByExample(CommentExample example) {
		// TODO Auto-generated method stub
		return commentMapper.selectByExample(example);
		//return null;
	}

	@Override
	public Comment selectByPrimaryKey(Integer cid) {
		// TODO Auto-generated method stub
		return commentMapper.selectByPrimaryKey(cid);
	}

	@Override
	public int updateByExampleSelective(Comment record, CommentExample example) {
		// TODO Auto-generated method stub
		Integer result=commentMapper.updateByExample(record,example);
		return result;
	}

	@Override
	public int updateByExample(Comment record, CommentExample example) {
		// TODO Auto-generated method stub

		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(Comment record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Comment record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PageUtil<Comment> findByPage(int currPage) {
		// TODO Auto-generated method stub
        HashMap<String, Object> map=new HashMap<String,Object>();
        CommentExample example =new CommentExample();
        PageUtil<Comment> pageUtil = new PageUtil<Comment>();
		//封装当前页数
		pageUtil.setCurrPage(currPage);
		//每行显示的数据
		int pageSize=5;
		pageUtil.setPageSize(pageSize);
		//封装总记录数
		int totalCount=commentMapper.countByExample(example);
		pageUtil.setTotalCount(totalCount);
		//封装总页数总记录数除以页面尺寸不为0就加一
		   int div=(totalCount/pageSize);
		   int mod=totalCount%pageSize;
		   if (mod!=0) {
			   div=div+1;
			   pageUtil.setTotal(div);
		}else {
			  pageUtil.setTotal(div);
		}
		    List<Comment> list =null;
		    //查询剩余最大记录数
		   int maxSize = totalCount-(currPage-1)*pageSize;
		   maxSize =   maxSize<pageSize?maxSize:pageSize;	   
		   int start =    (currPage-1)*pageSize;
		   //分页查询
		   list =  commentMapper.findByPage(start,pageSize);
		    pageUtil.setList(list);
		return pageUtil;
	}

}
