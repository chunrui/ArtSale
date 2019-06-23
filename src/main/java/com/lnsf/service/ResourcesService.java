package com.lnsf.service;

import com.lnsf.entities.Resources;
import com.lnsf.entities.ResourcesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResourcesService {
    int countByExample(ResourcesExample example);

    int deleteByExample(ResourcesExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(Resources record);

    int insertSelective(Resources record);

    List<Resources> selectByExample(ResourcesExample example);

    Resources selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") Resources record, @Param("example") ResourcesExample example);

    int updateByExample(@Param("record") Resources record, @Param("example") ResourcesExample example);

    int updateByPrimaryKeySelective(Resources record);

    int updateByPrimaryKey(Resources record);
}