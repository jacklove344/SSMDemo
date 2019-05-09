package com.hp.service;

import com.hp.pojo.User;

/**
 * Created by zql on 2019/5/9.
 */
public interface UserService {
    Boolean addUser(User user);
    Boolean deleteUser(Integer id);
    Boolean updateUser(User user);
    User selectUser(User user);
}
