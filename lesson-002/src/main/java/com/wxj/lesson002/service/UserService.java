package com.wxj.lesson002.service;

import com.wxj.lesson002.bean.User;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 * @date 2021/12/17 0017 11:13
 */
public interface UserService {

    public void register(User user);

    public boolean login(String name, String password);
}
