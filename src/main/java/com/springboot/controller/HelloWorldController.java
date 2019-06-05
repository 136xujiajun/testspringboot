package com.springboot.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HP-8560p on 2018/8/8.
 */
@RestController
public abstract class HelloWorldController {

    @RequestMapping("/index")
    public String index(){

//        BeanUtils.copyProperties();
        return "HelloWorld";
    }


}
