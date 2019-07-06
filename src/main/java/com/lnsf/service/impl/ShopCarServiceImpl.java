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
		int result = carMapper.deleteByPrimaryKey(sid);
		return result;
	}

	@Override
	public int insert(ShopCar record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(ShopCar record) {
		// TODO Auto-generated method stub
		int result = carMapper.insertSelective(record);
		return result;
	}

	@Override
	public List<ShopCar> selectByExample(ShopCarExample example) {
		// TODO Auto-generated method stub
		List<ShopCar> list = carMapper.selectByExample(example);
		return list;
	}

	@Override
	public ShopCar selectByPrimaryKey(Integer sid) {
		// TODO Auto-generated method stub
		ShopCar shopCar = carMapper.selectByPrimaryKey(sid);
		return shopCar;
	}

	@Override
	public int updateByExampleSelective(ShopCar record, ShopCarExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(ShopCar record, ShopCarExample example) {
		// TODO Auto-generated method stub
		int result = carMapper.updateByExample(record, example);
		return result;
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

	@Override
	public int updateByUidAndAid(Integer uid, Integer aid) {
		// TODO Auto-generated method stub
		int result = carMapper.updateByUidAndAid(uid, aid);
		return result;
	}

	@Override
	public ShopCar selectBysidAnduid(Integer uid, Integer sid) {
		// TODO Auto-generated method stub
		ShopCar shopCar = carMapper.selectBysidAnduid(uid, sid);
		System.out.println(shopCar);
		return shopCar;
	}

}
