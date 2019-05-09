package com.hp.mapper;

import com.hp.pojo.User;
import org.mybatis.spring.annotation.MapperScan;

/**
 * Created by zql on 2019/5/9.
 */
@MapperScan
public interface UserMapper {

    Boolean addUser(User user);
    Integer deleteUser(Integer id);
    Boolean updateUser(User user);
    User selectUser(User user);
}
