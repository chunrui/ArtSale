package com.lnsf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnsf.dao.ResourcesMapper;
import com.lnsf.entities.Resources;
import com.lnsf.entities.ResourcesExample;
@Service
public class ResourcesServiceImpl implements com.lnsf.service.ResourcesService {
	
	@Autowired
	private ResourcesMapper resourcesMapper;
	@Override
	public int countByExample(ResourcesExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(ResourcesExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Integer rid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Resources record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Resources record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Resources> selectByExample(ResourcesExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resources selectByPrimaryKey(Integer rid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(Resources record, ResourcesExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(Resources record, ResourcesExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(Resources record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Resources record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
