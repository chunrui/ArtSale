package com.lnsf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnsf.dao.AuctionMapper;
import com.lnsf.entities.Auction;
import com.lnsf.entities.AuctionExample;
import com.lnsf.service.AuctionService;
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
		return 0;
	}

	@Override
	public int insert(Auction record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Auction record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Auction> selectByExample(AuctionExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Auction selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
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
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Auction record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
