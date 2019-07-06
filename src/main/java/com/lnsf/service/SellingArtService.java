package com.lnsf.service;

import com.lnsf.entities.SellingArt;
import com.lnsf.entities.SellingArtExample;
import com.lnsf.util.PageUtil;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SellingArtService {
    int countByExample(SellingArtExample example);

    int deleteByExample(SellingArtExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(SellingArt record);

    int insertSelective(SellingArt record);

    List<SellingArt> selectByExample(SellingArtExample example);

    SellingArt selectByPrimaryKey(Integer aid);

    int updateByExampleSelective(@Param("record") SellingArt record, @Param("example") SellingArtExample example);

    int updateByExample(@Param("record") SellingArt record, @Param("example") SellingArtExample example);

    int updateByPrimaryKeySelective(SellingArt record);

    int updateByPrimaryKey(SellingArt record);

	PageUtil<SellingArt> findByPage(int currPage);
}