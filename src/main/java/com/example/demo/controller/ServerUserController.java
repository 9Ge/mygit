package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project: eureka-client
 * @Package: com.example.demo.controller
 * @Description: null
 * @Author: liangtao
 * @CreateDate: 2020/9/28 17:15
 * @ModificationHistory: （who whatTime doWhat）
 */
@RestController
@RequestMapping("/serverUserController")
public class ServerUserController {

    @RequestMapping("/addUser")
    public String addUser(){
        String str1= "addUser：";
        return "添加成功:"+str1;
    }
}
