package com.lnsf.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnsf.dao.OrderMapper;
import com.lnsf.entities.Order;
import com.lnsf.entities.OrderExample;
import com.lnsf.entities.OrderExample.Criteria;
import com.lnsf.entities.UserExample;
import com.lnsf.service.OrderService;
import com.lnsf.util.NumberUtil;
import com.lnsf.util.PageUtil;
@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderMapper orderMapper;
	@Override
	public int countByExample(OrderExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(OrderExample example) {
		// TODO Auto-generated method stub
		int result = orderMapper.deleteByExample(example);
		return result;
	}

	@Override
	public int deleteByPrimaryKey(Integer oid) {
		// TODO Auto-generated method stub
		int result = orderMapper.deleteByPrimaryKey(oid);
		return result;
	}

	@Override
	public int insert(Order record) {
		// TODO Auto-generated method stub
		int result = orderMapper.insert(record);
		return result;
	}

	@Override
	public int insertSelective(Order record) {
		// TODO Auto-generated method stub
		int result = orderMapper.insertSelective(record);
		return result;
	}

	@Override
	public List<Order> selectByExample(OrderExample example) {
		// TODO Auto-generated method stub
		List<Order> orders = orderMapper.selectByExample(example);
		return orders;
	}

	@Override
	public Order selectByPrimaryKey(Integer oid) {
		// TODO Auto-generated method stub
		Order order = orderMapper.selectByPrimaryKey(oid);
		return order;
	}

	@Override
	public int updateByExampleSelective(Order record, OrderExample example) {
		// TODO Auto-generated method stub
		int result = orderMapper.updateByExampleSelective(record, example);
		return result;
	}

	@Override
	public int updateByExample(Order record, OrderExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(Order record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Order record) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
    /**
     * 分页
     */
	public PageUtil<Order> findByPage(int currPage) {
		// TODO Auto-generated method stub
        HashMap<String, Object> map=new HashMap<String,Object>();
        OrderExample example =new OrderExample();
        PageUtil<Order> pageUtil = new PageUtil<Order>();
		//封装当前页数
		pageUtil.setCurrPage(currPage);
		//每行显示的数据
		int pageSize=5;
		pageUtil.setPageSize(pageSize);
		//封装总记录数
		int totalCount=orderMapper.countByExample(example);
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
		    List<Order> list =null;
		    //查询剩余最大记录数
		   int maxSize = totalCount-(currPage-1)*pageSize;
		   maxSize =   maxSize<pageSize?maxSize:pageSize;	   
		   int start =    (currPage-1)*pageSize;
		   //分页查询
		   list =  orderMapper.findByPage(start,pageSize);
		    pageUtil.setList(list);
		return pageUtil;
	}
	
	//模糊查询
	public List<Order> selectByselectInfo(String selectInfo){
		OrderExample example = new OrderExample();
		NumberUtil numberUtil = new NumberUtil();
		if(numberUtil.isNumber(selectInfo)) {
			System.out.println("selectInfo为数字");
			int Info = Integer.parseInt(selectInfo);
			//oid
			Criteria coid = example.createCriteria();
			coid.andOidLessThan(Info);
			//uid
			Criteria cuid = example.createCriteria();
			cuid.andUidLessThan(Info);
			//aid
			Criteria caid = example.createCriteria();
			caid.andAidLessThan(Info);
			//anum
			Criteria canum = example.createCriteria();
			canum.andAnumLessThan(Info);
			example.or(coid);
			example.or(cuid);
			example.or(caid);
			example.or(canum);
		}else {
			System.out.println("selectInfo为地址");
			//adress
			selectInfo = "%" +selectInfo+ "%";
			Criteria cadress = example.createCriteria();
			cadress.andAdressLike(selectInfo);
		}
		//查询
		List<Order> orders = orderMapper.selectByExample(example);
		return orders;
	}

}
