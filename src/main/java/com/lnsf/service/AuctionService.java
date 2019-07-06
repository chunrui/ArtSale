package com.lnsf.service;

import com.lnsf.entities.Auction;
import com.lnsf.entities.AuctionExample;
import com.lnsf.entities.Comment;
import com.lnsf.util.PageUtil;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuctionService {
    int countByExample(AuctionExample example);

    int deleteByExample(AuctionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Auction record);

    int insertSelective(Auction record);

    List<Auction> selectByExample(AuctionExample example);

    Auction selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Auction record, @Param("example") AuctionExample example);

    int updateByExample(@Param("record") Auction record, @Param("example") AuctionExample example);

    int updateByPrimaryKeySelective(Auction record);

    int updateByPrimaryKey(Auction record);
    
    PageUtil<Auction> findByPage(int currentPage);
}