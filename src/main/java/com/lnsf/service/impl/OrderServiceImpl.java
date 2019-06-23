package com.lnsf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnsf.dao.OrderMapper;
import com.lnsf.entities.Order;
import com.lnsf.entities.OrderExample;
import com.lnsf.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderMapper orderMapper;
	@Override
	public int countByExample(OrderExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(OrderExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Integer oid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Order record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Order record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Order> selectByExample(OrderExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order selectByPrimaryKey(Integer oid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(Order record, OrderExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(Order record, OrderExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(Order record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Order record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
