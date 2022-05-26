package com.wxj.lesson002;

import com.wxj.lesson002.bean.User;
import com.wxj.lesson002.config.AopContextConfiguration;
import com.wxj.lesson002.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wxj
 * @version 1.0.0
 * @ClassName AopContextTest.java
 * @Description TODO
 * @createTime 2022年05月26日 23:05:00
 */
public class AopContextTest {

    @Test
    public void test(){
        //1.创建容器
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AopContextConfiguration.class);
        //2.获取对象
        UserService userService = ac.getBean("userService",UserService.class);
        //3.执行方法
        User user = new User();
        user.setName("test");
        List<User> users = new ArrayList<>();
        users.add(user);

        userService.saveAllUsers(users);
    }
}
