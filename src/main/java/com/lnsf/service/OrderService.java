package com.lnsf.service;

import com.lnsf.entities.Order;
import com.lnsf.entities.OrderExample;
import com.lnsf.util.PageUtil;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderService {
    int countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    int deleteByPrimaryKey(Integer oid);

    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

    Order selectByPrimaryKey(Integer oid);

    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
    
    //分页查询
	PageUtil<Order> findByPage(int currPage);
	
	//模糊查询
	List<Order> selectByselectInfo(String selectInfo);
}