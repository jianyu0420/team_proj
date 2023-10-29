package com.example.competitiondemo2.mapper;

import com.example.competitiondemo2.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
    @Autowired
    List<User> queryAll();

    User selectByName(String uname,String password);
}