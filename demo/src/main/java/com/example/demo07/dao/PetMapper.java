package com.example.demo07.dao;

import com.example.demo07.models.Pet;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
public interface PetMapper{
    @Select("select * from pet where petid=#{petid}")
    Pet getPetById(int petid);
    //useGeneratedKeys="true" keyProperty="主键id号" 自动增长  mysql的自动增长
    @Insert("insert into pet(petName,petBreed,petSex,birthday,description) values(#{petName},#{petBreed},#{petSex},#{birthday},#{description})")
    @Options(useGeneratedKeys = true,keyProperty ="petid",keyColumn = "petid")
    int insert(Pet pet);
}
