package com.example.demo.repository;/*
 *@Class:DefaultRepository
 *@Author:Zhr on:2021/4/1910:16
 *@Description:XXX
 */

import com.example.demo.domain.Student2;
import com.example.demo.service.DefaultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class DefaultRepository {
 /*   @Autowired
    DefaultService defaultService;
    public RestfulResult<Student> getStu(){

        String s = defaultService.getStu();
        System.out.println(s);
        RestfulResult restfulResult = JSON.parseObject(s, RestfulResult.class);
        return restfulResult;
    }*/
    @Resource
    DefaultService defaultService;
    public String getStu(){

        //Student2 s = defaultService.getStu();
        //System.out.println(s);
        return "s";
    }

}
