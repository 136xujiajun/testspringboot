package com;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.springboot.Application;
import com.springboot.mapper.TUserMapper;
import com.springboot.model.TUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class MyBatisTest {

    @Autowired
    private TUserMapper userMapper;

    /**
     * 新增用户
     * @throws Exception
     */
    @Test
    public void testAddUser() throws Exception {
        TUser user = new TUser();
        user.setId(555666L);
        user.setName("zhangsan");
        user.setAge(12);
        userMapper.addUser(user);
        System.out.println("adfasfd");
    }

    /**
     * 删除用户
     * @throws Exception
     */
    @Test
    public void testDelUser() throws Exception {
        userMapper.deleteUserById(555L);
    }

    /**
     * 修改用户信息
     * @throws Exception
     */
    @Test
    public void testUpdUser() throws Exception {
        TUser user = new TUser();
        user.setId(555L);
        user.setName("zhangsan99");
        user.setAge(122);
        userMapper.updateUserById(user);
    }

    /**
     * 查询用户
     * @throws Exception
     */
    @Test
    public void testQueryUser() throws Exception {
        TUser user = userMapper.queryUserById(555L);
        System.out.println(user.getName());
    }

    /**
     * 查询所有用户
     * @throws Exception
     */
    @Test
    public void testQueryUserList() throws Exception {
        int pageNum=1;
        int pageSize=10;
        Page<TUser> page = PageHelper.startPage(pageNum, pageSize);
        userMapper.queryUserList();
        System.out.println("总共条数："+page.getTotal());
        for (TUser user : page.getResult()) {
            System.out.println(user.getName());
        }
    }

}
