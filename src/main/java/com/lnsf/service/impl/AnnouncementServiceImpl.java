package com.lnsf.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnsf.dao.AnnouncementMapper;
import com.lnsf.entities.Announcement;
import com.lnsf.entities.AnnouncementExample;
import com.lnsf.service.AnnouncementService;
import com.lnsf.util.PageUtil;
@Service
public class AnnouncementServiceImpl implements AnnouncementService {
	 @Autowired	
	private AnnouncementMapper announMapper;
	@Override
	public int countByExample(AnnouncementExample example) {
		// TODO Auto-generated method stub
		return announMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(AnnouncementExample example) {
		// TODO Auto-generated method stub
		return announMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer anid) {
		// TODO Auto-generated method stub
		return announMapper.deleteByPrimaryKey(anid);
	}

	@Override
	public int insert(Announcement record) {
		// TODO Auto-generated method stub
		return announMapper.insert(record);
	}

	@Override
	public int insertSelective(Announcement record) {
		// TODO Auto-generated method stub
		return announMapper.insertSelective(record);
	}

	@Override
	public List<Announcement> selectByExample(AnnouncementExample example) {
		// TODO Auto-generated method stub
		return announMapper.selectByExample(example);
	}

	@Override
	public Announcement selectByPrimaryKey(Integer anid) {
		// TODO Auto-generated method stub
		return announMapper.selectByPrimaryKey(anid);
	}

	@Override
	public int updateByExampleSelective(Announcement record, AnnouncementExample example) {
		// TODO Auto-generated method stub
		return announMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Announcement record, AnnouncementExample example) {
		// TODO Auto-generated method stub
		return announMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Announcement record) {
		// TODO Auto-generated method stub
		return announMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Announcement record) {
		// TODO Auto-generated method stub
		return announMapper.updateByPrimaryKey(record);
	}

	@Override
	public PageUtil<Announcement> findByPage(int currPage) {

		// TODO Auto-generated method stub
      HashMap<String, Object> map=new HashMap<String,Object>();
      AnnouncementExample example =new AnnouncementExample();
      PageUtil<Announcement> pageUtil = new PageUtil<Announcement>();
		//封装当前页数
		pageUtil.setCurrPage(currPage);
		//每行显示的数据
		int pageSize=6;
		pageUtil.setPageSize(pageSize);
		//封装总记录数
		int totalCount=announMapper.countByExample(example);
		pageUtil.setTotalCount(totalCount);
		//封装总页数总记录数除以页面尺寸不为0就加一
		   int div=(totalCount/pageSize);
		   int mod=totalCount%pageSize;
		   if (mod!=0) {
			   div=div+1;
			   pageUtil.setTotal(div);
		}else {
			  pageUtil.setTotal(div);
		}
		    List<Announcement> list =null;
		    //查询剩余最大记录数
		   int maxSize = totalCount-(currPage-1)*pageSize;
		   maxSize =   maxSize<pageSize?maxSize:pageSize;	   
		   int start =    (currPage-1)*pageSize;
		   //分页查询
		   list =  announMapper.findByPage(start,pageSize);
		    pageUtil.setList(list);
		return pageUtil;
		
	
	}

}
