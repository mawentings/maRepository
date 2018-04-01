package com.example.demo07.dao;

import com.example.demo07.models.User;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
  //@Select("select * from user")
  List<User> getAllUser();
  //实现多条件查询  使用没有mybatis插件分页
  public List<User> getUserByPage(User user);
}
