package com.wxj.lesson001.componentScan.test;

import com.wxj.lesson001.componentScan.config.MainConfig;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 * @date 2021/11/15 0015 10:26
 */

public class IOCTest {

    @SuppressWarnings("resource")
    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);        // 我们现在就来看一下IOC容器中有哪些bean，即容器中所有bean定义的名字
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }
}