package com.lnsf.service;

import com.lnsf.entities.Photo;
import com.lnsf.entities.PhotoExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PhotoService {
    int countByExample(PhotoExample example);

    int deleteByExample(PhotoExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Photo record);

    int insertSelective(Photo record);

    List<Photo> selectByExample(PhotoExample example);

    Photo selectByPrimaryKey(Integer pid);
    
    Photo selectByPrimaryKey2(String photourl);

    int updateByExampleSelective(@Param("record") Photo record, @Param("example") PhotoExample example);

    int updateByExample(@Param("record") Photo record, @Param("example") PhotoExample example);

    int updateByPrimaryKeySelective(Photo record);

    int updateByPrimaryKey(Photo record);
}