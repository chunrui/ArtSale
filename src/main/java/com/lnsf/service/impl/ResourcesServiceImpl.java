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
		return resourcesMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(ResourcesExample example) {
		// TODO Auto-generated method stub
		return resourcesMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer rid) {
		// TODO Auto-generated method stub
		return resourcesMapper.deleteByPrimaryKey(rid);
	}

	@Override
	public int insert(Resources record) {
		int result = resourcesMapper.insert(record);
		
		return result;
	}

	@Override
	public int insertSelective(Resources record) {
		// TODO Auto-generated method stub
		return resourcesMapper.insertSelective(record);
	}
	/**
	 * 查询所有资源
	 */
	@Override
	public List<Resources> selectByExample(ResourcesExample example) {
		List<Resources> res = resourcesMapper.selectByExample(example);
		return res;
	}
	/**
	 * 查询单个资源
	 */
	@Override
	public Resources selectByPrimaryKey(Integer rid) {
		Resources res = resourcesMapper.selectByPrimaryKey(rid);
		return res;
	}

	@Override
	public int updateByExampleSelective(Resources record, ResourcesExample example) {
		// TODO Auto-generated method stub
		return resourcesMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Resources record, ResourcesExample example) {
		// TODO Auto-generated method stub
		return resourcesMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Resources record) {
		// TODO Auto-generated method stub
		return resourcesMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Resources record) {
		// TODO Auto-generated method stub
		return resourcesMapper.updateByPrimaryKey(record);
	}

}
