package com.lnsf.service;

import com.lnsf.entities.UserInformation;
import com.lnsf.entities.UserInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInformationService {
    int countByExample(UserInformationExample example);

    int deleteByExample(UserInformationExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(UserInformation record);

    int insertSelective(UserInformation record);

    List<UserInformation> selectByExample(UserInformationExample example);

    UserInformation selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") UserInformation record, @Param("example") UserInformationExample example);

    int updateByExample(@Param("record") UserInformation record, @Param("example") UserInformationExample example);

    int updateByPrimaryKeySelective(UserInformation record);

    int updateByPrimaryKey(UserInformation record);
}