/**
 * Copyright (C), 2018, Jerry
 * FileName: UserService
 * Author:   jerry
 * Date:     2018/7/16 14:02
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zeng.demo.service;

import com.zeng.demo.model.User;
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
public interface UserService {
    int addUser(User user);

    List<User> findAll();
}