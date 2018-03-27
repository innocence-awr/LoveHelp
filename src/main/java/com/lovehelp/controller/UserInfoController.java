package com.lovehelp.controller;

import com.lovehelp.model.UserInfo;
import com.lovehelp.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by xiangbo on 2018/3/26.
 */
@Controller
@RequestMapping("/user")
public class UserInfoController {
    private static Logger logger = LoggerFactory.getLogger(UserInfoController.class);

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public String findAll(Model model){
        logger.info("---查询全部");
        List<UserInfo> list = this.userService.findAll();
        logger.info("list:"+list.size());
        if(null != list && list.size() > 0)
        {
            model.addAttribute("list",list);
            return "user/index";
        }
        return "error";
    }

    @GetMapping("/findUser")
    public String findUserById(@RequestParam int id,Model model){
        UserInfo userInfo = userService.findUserById(id);
        if(userInfo != null){
            model.addAttribute("userInfo",userInfo);
            return "user/findUser";
        }
        return "error";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id,Model model)
    {
        logger.info("进入删除----id:"+id);
        int res = userService.delete(id);
        if(res > 0)
        {
            return this.findAll(model);
        }
        return "error";
    }


}
