package com.wxj.lesson002;

import com.wxj.lesson002.config.ConcreteConfiguration;
import com.wxj.lesson002.service.ConcreteService;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 * @date 2022/1/7 0007 11:30
 */

public class ConcreteServiceTest {

//    @Autowired
//    private ConcreteService concreteService;

    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(ConcreteConfiguration.class);
        context.getBean(ConcreteService.class).sayHello();
    }
}