package com.springboot.mapper;


import com.springboot.model.TUser;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by HP-8560p on 2018/8/8.
 */
@Repository
public interface TUserMapper {

    int addUser(TUser user);

    int deleteUserById(Long id);

    int updateUserById(TUser user);

    TUser queryUserById(Long id);

    List<TUser> queryUserList();


}
