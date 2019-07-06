package com.lnsf.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnsf.dao.AuctionMapper;
import com.lnsf.entities.Auction;
import com.lnsf.entities.AuctionExample;
import com.lnsf.entities.Comment;
import com.lnsf.entities.CommentExample;
import com.lnsf.service.AuctionService;
import com.lnsf.util.PageUtil;
@Service
public class AuctionServiceImpl implements AuctionService {

	 @Autowired
	 private AuctionMapper auctionMapper;
	@Override
	public int countByExample(AuctionExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(AuctionExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		Integer result=auctionMapper.deleteByPrimaryKey(id);
		return result;
	}

	@Override
	public int insert(Auction record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Auction record) {
		// TODO Auto-generated method stub
		int result = auctionMapper.insertSelective(record);
		return result;
	}

	@Override
	public List<Auction> selectByExample(AuctionExample example) {
		// TODO Auto-generated method stub
		return auctionMapper.selectByExample(null);
	}

	@Override
	public Auction selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return auctionMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(Auction record, AuctionExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(Auction record, AuctionExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(Auction record) {
		// TODO Auto-generated method stub
		Integer result=auctionMapper.updateByPrimaryKeySelective(record);
		return result;
	}

	@Override
	public int updateByPrimaryKey(Auction record) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public PageUtil<Auction> findByPage(int currPage) {
		// TODO Auto-generated method stub
        HashMap<String, Object> map=new HashMap<String,Object>();
        AuctionExample example =new AuctionExample();
        PageUtil<Auction> pageUtil = new PageUtil<Auction>();
		//封装当前页数
		pageUtil.setCurrPage(currPage);
		//每行显示的数据
		int pageSize=5;
		pageUtil.setPageSize(pageSize);
		//封装总记录数
		int totalCount=auctionMapper.countByExample(example);
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
		    List<Auction> list =null;
		    //查询剩余最大记录数
		   int maxSize = totalCount-(currPage-1)*pageSize;
		   maxSize =   maxSize<pageSize?maxSize:pageSize;	   
		   int start =    (currPage-1)*pageSize;
		   //分页查询
		   list =  auctionMapper.findByPage(start,pageSize);
		    pageUtil.setList(list);
		return pageUtil;
	}

}
