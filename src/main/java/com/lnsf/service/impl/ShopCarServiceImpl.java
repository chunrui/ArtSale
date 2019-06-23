package com.lnsf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnsf.dao.ShopCarMapper;
import com.lnsf.entities.ShopCar;
import com.lnsf.entities.ShopCarExample;
import com.lnsf.service.ShopCarService;
@Service
public class ShopCarServiceImpl implements ShopCarService {
	
	@Autowired
	private ShopCarMapper carMapper;
	@Override
	public int countByExample(ShopCarExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(ShopCarExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Integer sid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(ShopCar record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(ShopCar record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ShopCar> selectByExample(ShopCarExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShopCar selectByPrimaryKey(Integer sid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(ShopCar record, ShopCarExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(ShopCar record, ShopCarExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(ShopCar record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(ShopCar record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
