package com.lovehelp.service;

import com.lovehelp.mapper.UserInfoMapper;
import com.lovehelp.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xiangbo on 2018/3/27.
 */
@Service
public class UserService {

    @Resource
    private UserInfoMapper userInfoMapper;

    public List<UserInfo> findAll(){
        return this.userInfoMapper.selectAll();
    }
    public UserInfo findUserById(int id){
        return this.userInfoMapper.selectByPrimaryKey(id);
    }

    public int addUserInfo(UserInfo userInfo){
        return this.userInfoMapper.insert(userInfo);
    }

    public int delete(int id){
        return this.userInfoMapper.deleteByPrimaryKey(id);
    }
    public int update(UserInfo userInfo){
        return this.userInfoMapper.updateByPrimaryKey(userInfo);
    }

}
