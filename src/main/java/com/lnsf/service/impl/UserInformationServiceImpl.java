package com.lnsf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnsf.dao.UserInformationMapper;
import com.lnsf.entities.UserInformation;
import com.lnsf.entities.UserInformationExample;
import com.lnsf.service.UserInformationService;
@Service
public class UserInformationServiceImpl implements UserInformationService {
	
	@Autowired
	private UserInformationMapper userInformationMapper;
	@Override
	public int countByExample(UserInformationExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(UserInformationExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Integer uid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(UserInformation record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(UserInformation record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<UserInformation> selectByExample(UserInformationExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserInformation selectByPrimaryKey(Integer uid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(UserInformation record, UserInformationExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(UserInformation record, UserInformationExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(UserInformation record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(UserInformation record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
