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
		return photoMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(PhotoExample example) {
		// TODO Auto-generated method stub
		return photoMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer pid) {
		
		return photoMapper.deleteByPrimaryKey(pid);
	}

	@Override
	public int insert(Photo record) {
		int result = photoMapper.insert(record);
		return result;
	}

	@Override
	public int insertSelective(Photo record) {
		// TODO Auto-generated method stub
		return photoMapper.insertSelective(record);
	}

	@Override
	public List<Photo> selectByExample(PhotoExample example) {
		// TODO Auto-generated method stub
		return photoMapper.selectByExample(example);
	}

	@Override
	public Photo selectByPrimaryKey(Integer pid) {
		// TODO Auto-generated method stub
		return photoMapper.selectByPrimaryKey(pid);
	}
	@Override
	public int updateByExampleSelective(Photo record, PhotoExample example) {
		// TODO Auto-generated method stub
		return photoMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Photo record, PhotoExample example) {
		// TODO Auto-generated method stub
		return photoMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Photo record) {
		// TODO Auto-generated method stub
		return photoMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Photo record) {
		// TODO Auto-generated method stub
		return photoMapper.updateByPrimaryKey(record);
	}

	@Override
	public Photo selectByPrimaryKey2(String photourl) {
		// TODO Auto-generated method stub
		return photoMapper.selectByPrimaryKey2(photourl);
	}



}
