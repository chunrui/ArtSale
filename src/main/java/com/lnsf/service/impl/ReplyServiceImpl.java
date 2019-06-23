package com.lnsf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnsf.dao.ReplyMapper;
import com.lnsf.entities.Reply;
import com.lnsf.entities.ReplyExample;
import com.lnsf.service.ReplyService;
@Service
public class ReplyServiceImpl implements ReplyService {
    
	@Autowired
	private ReplyMapper replyMapper;
	@Override
	public int countByExample(ReplyExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(ReplyExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Integer reid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Reply record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Reply record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Reply> selectByExample(ReplyExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reply selectByPrimaryKey(Integer reid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(Reply record, ReplyExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(Reply record, ReplyExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(Reply record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Reply record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
