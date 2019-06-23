package com.lnsf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnsf.dao.SellingArtMapper;
import com.lnsf.entities.SellingArt;
import com.lnsf.entities.SellingArtExample;
import com.lnsf.service.SellingArtService;
@Service
public class SellingArtServiceImpl implements SellingArtService {
	
	@Autowired
	private SellingArtMapper sellingArtMapper;
	@Override
	public int countByExample(SellingArtExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(SellingArtExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Integer aid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(SellingArt record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(SellingArt record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<SellingArt> selectByExample(SellingArtExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SellingArt selectByPrimaryKey(Integer aid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(SellingArt record, SellingArtExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(SellingArt record, SellingArtExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(SellingArt record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(SellingArt record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
