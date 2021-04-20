package com.example.demo.fallback;/*
 *@Class:DefaultServiceFallback
 *@Author:Zhr on:2021/4/1910:12
 *@Description:XXX
 */

import com.example.demo.domain.Student2;
import com.example.demo.service.DefaultService;
import org.springframework.stereotype.Component;

@Component
public class DefaultServiceFallback implements DefaultService {
/*    @Override
    public *//*RestfulResult<Student>*//* String getStu() {
        Student student=new Student(0,"","",0,"","","","");


        RestfulResult<Student> restfulResult = new RestfulResult();
        restfulResult.setCode("500");
        restfulResult.setData(student);
        restfulResult.setMessage("fail");
        return restfulResult.toString();
    }*/

    @Override
    public /*RestfulResult<Student>*/ Student2 getStu() {
        Student2 student=new Student2(0,"");

        return student;
    }
}
