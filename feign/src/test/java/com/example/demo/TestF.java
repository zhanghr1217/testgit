package com.example.demo;/*
 *@Class:TestF
 *@Author:Zhr on:2021/4/1913:36
 *@Description:XXX
 */

import com.example.demo.service.DefaultService;
//import org.junit.jupiter.api.Test;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
@ComponentScan(basePackages = "com.example.demo")
public class TestF {
    @Autowired
    DefaultService defaultService;

    @Test
    public void inter(){
        System.out.println("===>"+defaultService);
        System.out.println(defaultService.getStu());
    }
}
