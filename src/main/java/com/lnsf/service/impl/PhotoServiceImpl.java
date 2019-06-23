package com.lnsf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnsf.dao.PhotoMapper;
import com.lnsf.entities.Photo;
import com.lnsf.entities.PhotoExample;
import com.lnsf.service.PhotoService;
@Service
public class PhotoServiceImpl implements PhotoService {
	
	@Autowired
	private PhotoMapper photoMapper;
	@Override
	public int countByExample(PhotoExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(PhotoExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Integer pid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Photo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Photo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Photo> selectByExample(PhotoExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Photo selectByPrimaryKey(Integer pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(Photo record, PhotoExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(Photo record, PhotoExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(Photo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Photo record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
