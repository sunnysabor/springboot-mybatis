/**
 * Copyright (C), 2018, Jerry
 * FileName: ServiceImpl
 * Author:   jerry
 * Date:     2018/7/16 14:03
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zeng.demo.service.impl;

import com.zeng.demo.mapper.UserMapper;
import com.zeng.demo.model.User;
import com.zeng.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author jerry
 * @create 2018/7/16
 * @since 1.0.0
 */
@Service
public class ServiceImpl implements UserService {

    @Autowired
    private UserMapper userDao;

    @Override
    public int addUser(User user) {
        return userDao.insert(user);
    }

    @Override
    public List<User> findAll() {
        return userDao.selectAllUser();
    }
}