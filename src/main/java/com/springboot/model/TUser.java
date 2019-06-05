package com.springboot.model;

/**
 * Created by HP-8560p on 2018/8/8.
 */
public class TUser {

    private Long id;

    //姓名
    private String name;

    //年龄
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
