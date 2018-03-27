package com.lovehelp.mapper;

import com.lovehelp.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer userNum);

    int insert(UserInfo record);

    UserInfo selectByPrimaryKey(Integer userNum);

    List<UserInfo> selectAll();

    int updateByPrimaryKey(UserInfo record);
}