/**
 * Copyright (C), 2018, Jerry
 * FileName: UserController
 * Author:   jerry
 * Date:     2018/7/13 17:06
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zeng.demo.controller;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.zeng.demo.model.User;
import com.zeng.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author jerry
 * @create 2018/7/13
 * @since 1.0.0
 */
@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/add", consumes = {"application/json;charset=UTF-8"}, produces = {"application/json;charset=UTF-8"})
    public int addUser(@RequestBody User user) {
        return userService.addUser(user);
    }


    @GetMapping(produces = {"application/json;charset=UTF-8"})
    public ResponseEntity findAllUser() {
        return new ResponseEntity(userService.findAll(), HttpStatus.OK);
    }
}