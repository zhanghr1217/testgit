package com.example.demo.domain;/*
 *@Class:Student
 *@Author:Zhr on:2021/4/1910:09
 *@Description:XXX
 */

import java.io.Serializable;

public class Student2 implements Serializable {
  /*  Integer id;
    String name;
    String password;
    Integer points;
    String email;
    String phone;
    Integer num;
    String trueName;*/

    //private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;

    public Student2() {
    }

    public Student2(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
