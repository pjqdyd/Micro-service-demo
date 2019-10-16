package com.pjqdyd.controller;

import com.pjqdyd.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**   
 * @Description:  [消费者Controller层]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/{id}")
    public User userInfo(@PathVariable("id") Long id){
        //调用提供者的restful接口获取用户信息
        User user = restTemplate.getForObject("/user/"+ id, User.class);
        return user;
    }

}
