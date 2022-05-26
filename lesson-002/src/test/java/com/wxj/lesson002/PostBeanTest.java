package com.wxj.lesson002;

import com.wxj.lesson002.aware.SpringContextAssisor;
import com.wxj.lesson002.bean.ConcreteRPBean;
import com.wxj.lesson002.bean.PostBean;
import com.wxj.lesson002.config.AppConfiguration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 * @date 2022/1/7 0007 15:10
 */
public class PostBeanTest {

//    @Autowired
//    private PostBean postBean;

//    @Autowired
//    private SpringContextAssisor springContextAssisor;

    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        context.getBean(PostBean.class).sayhello();

//        springContextAssisor.getApplicationContext().getBean(PostBean.class).sayhello();
    }

    @Test
    public void test2(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        context.getBean(ConcreteRPBean.class).sayHello();
    }
}