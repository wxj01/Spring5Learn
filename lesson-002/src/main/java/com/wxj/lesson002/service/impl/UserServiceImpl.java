package com.wxj.lesson002.service.impl;

import com.wxj.lesson002.bean.User;
import com.wxj.lesson002.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wxj
 * @version 1.0.0
 * @ClassName UserServiceImpl.java
 * @Description TODO
 * @createTime 2022年05月26日 22:38:00
 */
@Service("userService")
@Slf4j
public class UserServiceImpl implements UserService {
    @Override
    public void register(User user) {

    }

    @Override
    public boolean login(String name, String password) {
        return false;
    }

    @Override
    public void saveUser(User user) {
        log.info("保存了用户：{}",user);
    }

    @Override
    public void saveAllUsers(List<User> users) {
        UserService proxyUserService = (UserService) AopContext.currentProxy();
        users.forEach(user -> {
            // 这种会有切面日志输出：打印日志功能~~~~~~~~
            proxyUserService.saveUser(user);
            //这种保存没有切面的日志输出
//            saveUser(user);
        });
    }
}
