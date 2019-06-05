package com.springboot.controller;

import com.springboot.model.TUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @RestController则是相当于
 * @Controller
 * @ResponseBody两个注解，
 * 该类返回的都是数据，不返回页面。
 *
 */

@RestController
public class TUserController {

    @GetMapping("/getString")
    public String getString() {
        return "Hello 张三";
    }

    @GetMapping("/queryUserById")
    public TUser queryUserById() {
        TUser user = new TUser();
        user.setId(555L);
        user.setName("张三");
        user.setAge(12);
        return user;
    }

    @GetMapping("/queryUserList")
    public List<TUser> queryUserList() {
        List<TUser> list = new ArrayList<TUser>();

        TUser user = new TUser();
        user.setId(555L);
        user.setName("张三");
        user.setAge(12);

        TUser user2 = new TUser();
        user2.setId(555L);
        user2.setName("李四");
        user2.setAge(22);

        list.add(user);
        list.add(user2);
        return list;
    }
}
