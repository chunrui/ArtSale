package com.lnsf.service;

import com.lnsf.entities.Announcement;
import com.lnsf.entities.AnnouncementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnnouncementService {
    int countByExample(AnnouncementExample example);

    int deleteByExample(AnnouncementExample example);

    int deleteByPrimaryKey(Integer anid);

    int insert(Announcement record);

    int insertSelective(Announcement record);

    List<Announcement> selectByExample(AnnouncementExample example);

    Announcement selectByPrimaryKey(Integer anid);

    int updateByExampleSelective(@Param("record") Announcement record, @Param("example") AnnouncementExample example);

    int updateByExample(@Param("record") Announcement record, @Param("example") AnnouncementExample example);

    int updateByPrimaryKeySelective(Announcement record);

    int updateByPrimaryKey(Announcement record);
}