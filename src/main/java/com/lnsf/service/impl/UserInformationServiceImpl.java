package com.lnsf.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnsf.dao.UserInformationMapper;
import com.lnsf.entities.UserInformation;
import com.lnsf.entities.UserInformationExample;
import com.lnsf.service.UserInformationService;
import com.lnsf.util.PageUtil;
@Service
public class UserInformationServiceImpl implements UserInformationService {
	
	@Autowired
	private UserInformationMapper userInformationMapper;
	@Override
	public int countByExample(UserInformationExample example) {
		// TODO Auto-generated method stub
		return userInformationMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(UserInformationExample example) {
		// TODO Auto-generated method stub
		return userInformationMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer uid) {
		// TODO Auto-generated method stub
		return userInformationMapper.deleteByPrimaryKey(uid);
	}

	@Override
	public int insert(UserInformation record) {
		// TODO Auto-generated method stub
		return userInformationMapper.insert(record);
	}

	@Override
	public int insertSelective(UserInformation record) {
		// TODO Auto-generated method stub
		return userInformationMapper.insertSelective(record);
	}

	@Override
	public List<UserInformation> selectByExample(UserInformationExample example) {
		// TODO Auto-generated method stub
		return userInformationMapper.selectByExample(example);
	}

	@Override
	public UserInformation selectByPrimaryKey(Integer uid) {
		// TODO Auto-generated method stub
		return userInformationMapper.selectByPrimaryKey(uid);
	}

	@Override
	public int updateByExampleSelective(UserInformation record, UserInformationExample example) {
		// TODO Auto-generated method stub
		return userInformationMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(UserInformation record, UserInformationExample example) {
		// TODO Auto-generated method stub
		return userInformationMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(UserInformation record) {
		// TODO Auto-generated method stub
		return userInformationMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(UserInformation record) {
		// TODO Auto-generated method stub
		return userInformationMapper.updateByPrimaryKey(record);
	}
	@Override
	 /**
    * 分页
    */
	public PageUtil<UserInformation> findByPage(int currPage) {
		// TODO Auto-generated method stub
       HashMap<String, Object> map=new HashMap<String,Object>();
       UserInformationExample example =new UserInformationExample();
       PageUtil<UserInformation> pageUtil = new PageUtil<UserInformation>();
		//封装当前页数
		pageUtil.setCurrPage(currPage);
		//每行显示的数据
		int pageSize=5;
		pageUtil.setPageSize(pageSize);
		//封装总记录数
		int totalCount=userInformationMapper.countByExample(example);
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
		    List<UserInformation> list =null;
		    //查询剩余最大记录数
		   int maxSize = totalCount-(currPage-1)*pageSize;
		   maxSize =   maxSize<pageSize?maxSize:pageSize;	   
		   int start =    (currPage-1)*pageSize;
		   //分页查询
		   list =  userInformationMapper.findByPage(start,pageSize);
		    pageUtil.setList(list);
		return pageUtil;
		
	}


}
