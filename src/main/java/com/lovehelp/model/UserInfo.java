package com.lovehelp.model;

import com.fasterxml.jackson.annotation.JsonFilter;

import java.io.Serializable;

public class UserInfo implements Serializable {
    private Integer userNum;

    private String userName;

    private Integer userAge;

    private String userSex;

    private String remarks;

    private static final long serialVersionUID = 1L;

    public Integer getUserNum() {
        return userNum;
    }

    public void setUserNum(Integer userNum) {
        this.userNum = userNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}