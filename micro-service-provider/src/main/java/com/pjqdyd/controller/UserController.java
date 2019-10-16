package com.pjqdyd.controller;

import com.pjqdyd.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**   
 * @Description:  [用户Controller层]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@RestController
public class UserController {

    @GetMapping("/user/{id}")
    public User userInfo(@PathVariable("id") Long id){
        User user = new User(id, "小明");
        return user;
    }

}
