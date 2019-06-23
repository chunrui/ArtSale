package com.lnsf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnsf.dao.AnnouncementMapper;
import com.lnsf.entities.Announcement;
import com.lnsf.entities.AnnouncementExample;
import com.lnsf.service.AnnouncementService;
@Service
public class AnnouncementServiceImpl implements AnnouncementService {
	 @Autowired	
	private AnnouncementMapper announcementMapper;
	@Override
	public int countByExample(AnnouncementExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(AnnouncementExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Integer anid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Announcement record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Announcement record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Announcement> selectByExample(AnnouncementExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Announcement selectByPrimaryKey(Integer anid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(Announcement record, AnnouncementExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(Announcement record, AnnouncementExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(Announcement record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Announcement record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
