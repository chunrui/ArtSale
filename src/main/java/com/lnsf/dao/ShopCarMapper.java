package com.lnsf.dao;

import com.lnsf.entities.ShopCar;
import com.lnsf.entities.ShopCarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopCarMapper {
    int countByExample(ShopCarExample example);

    int deleteByExample(ShopCarExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(ShopCar record);

    int insertSelective(ShopCar record);

    List<ShopCar> selectByExample(ShopCarExample example);

    ShopCar selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") ShopCar record, @Param("example") ShopCarExample example);

    int updateByExample(@Param("record") ShopCar record, @Param("example") ShopCarExample example);

    int updateByPrimaryKeySelective(ShopCar record);

    int updateByPrimaryKey(ShopCar record);
}