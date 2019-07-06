
package com.lnsf.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnsf.dao.SellingArtMapper;
import com.lnsf.entities.SellingArt;
import com.lnsf.entities.SellingArtExample;
import com.lnsf.service.SellingArtService;
import com.lnsf.util.PageUtil;

@Service
public class SellingArtServiceImpl implements SellingArtService {

	@Autowired
	private SellingArtMapper sellingArtMapper;

	@Override 
	public int countByExample(SellingArtExample example) { // TODO

    return sellingArtMapper.countByExample(example); }

	@Override 
	public int deleteByExample(SellingArtExample example) { // TODO
      return sellingArtMapper.deleteByExample(example); 
   }

	@Override 
	public int deleteByPrimaryKey(Integer aid) { // TODO Auto-generated
   return sellingArtMapper.deleteByPrimaryKey(aid); }

	@Override 
	public int insert(SellingArt record) { // TODO Auto-generated
      return sellingArtMapper.insert(record); 
      }

	@Override
	public int insertSelective(SellingArt record) { // TODO
       return sellingArtMapper.insertSelective(record);
  }

	@Override
	public List<SellingArt> selectByExample(SellingArtExample example) { // TODO Auto-generated method stub 
		return sellingArtMapper.selectByExample(example);
	}

	@Override 
	public SellingArt selectByPrimaryKey(Integer aid) { // TODO
   return sellingArtMapper.selectByPrimaryKey(aid); }

	@Override 
	public int updateByExampleSelective(SellingArt record,SellingArtExample example) { // TODO Auto-generated method stub
		return sellingArtMapper.updateByExampleSelective(record, example); 
	}

	@Override 
	public int updateByExample(SellingArt record, SellingArtExample example) { // TODO Auto-generated method stub 
		return sellingArtMapper.updateByExample(record, example);
		}

	@Override 
	public int updateByPrimaryKeySelective(SellingArt record) { // TODO
  return sellingArtMapper.updateByPrimaryKeySelective(record); }

	@Override 
	public int updateByPrimaryKey(SellingArt record) { 
		
      return sellingArtMapper.updateByPrimaryKey(record); }
	@Override
	 /**
   * 分页
   */
	public PageUtil<SellingArt> findByPage(int currPage) {
		// TODO Auto-generated method stub
      HashMap<String, Object> map=new HashMap<String,Object>();
      SellingArtExample example =new SellingArtExample();
      PageUtil<SellingArt> pageUtil = new PageUtil<SellingArt>();
		//封装当前页数
		pageUtil.setCurrPage(currPage);
		//每行显示的数据
		int pageSize=6;
		pageUtil.setPageSize(pageSize);
		//封装总记录数
		int totalCount=sellingArtMapper.countByExample(example);
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
		    List<SellingArt> list =null;
		    //查询剩余最大记录数
		   int maxSize = totalCount-(currPage-1)*pageSize;
		   maxSize =   maxSize<pageSize?maxSize:pageSize;	   
		   int start =    (currPage-1)*pageSize;
		   //分页查询
		   list =  sellingArtMapper.findByPage(start,pageSize);
		    pageUtil.setList(list);
		return pageUtil;
		
	}

}
