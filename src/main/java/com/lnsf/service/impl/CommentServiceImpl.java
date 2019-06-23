package com.lnsf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnsf.dao.CommentMapper;
import com.lnsf.entities.Comment;
import com.lnsf.entities.CommentExample;
import com.lnsf.service.CommentService;
@Service
public class CommentServiceImpl implements CommentService{
	
	@Autowired
	private CommentMapper commentMapper;
	@Override
	public int countByExample(CommentExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(CommentExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Integer cid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Comment record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Comment record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Comment> selectByExample(CommentExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment selectByPrimaryKey(Integer cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(Comment record, CommentExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(Comment record, CommentExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(Comment record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Comment record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
