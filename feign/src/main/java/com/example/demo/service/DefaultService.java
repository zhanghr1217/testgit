package com.example.demo.service;/*
 *@Class:DefaultService
 *@Author:Zhr on:2021/4/1910:05
 *@Description:XXX
 */

import com.example.demo.domain.RestfulResult;
import com.example.demo.domain.Student2;
import com.example.demo.fallback.DefaultServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/*@FeignClient(name="test",url="http://localhost/common/",fallback = DefaultServiceFallback.class)
public interface DefaultService {
    @GetMapping(value = "/getStu/1/1", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    String getStu();
}*/

@FeignClient(name="test",url="http://localhost/common/",fallback = DefaultServiceFallback.class)
public interface DefaultService {
    @RequestMapping(value = "/getStu/1/1",produces =MediaType.APPLICATION_JSON_UTF8_VALUE,method = RequestMethod.GET)
    Student2 getStu();
}