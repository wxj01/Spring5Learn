package com.wxj.lesson001.demo4;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 * @date 2021/8/19 0019 15:11
 */
public class ScopeTest {

    ClassPathXmlApplicationContext context;

    @BeforeEach
    public void before(){
        System.out.println("spring容器准备启动.....");
        //1.bean配置文件位置
        this.context = new ClassPathXmlApplicationContext("bean.xml");

        System.out.println("spring容器启动完毕！");
    }


    @Test
    public void singletonBean(){
        System.out.println("---------单例bean，每次获取的bean实例都一样---------");
        System.out.println(context.getBean("singletonBean"));
        System.out.println(context.getBean("singletonBean"));
        System.out.println(context.getBean("singletonBean"));
    }

    @Test
    public void prototypeBean(){
        System.out.println("---------prototypeBean，每次获取的bean实例都不一样---------");
        System.out.println(context.getBean("prototypeBean"));
        System.out.println(context.getBean("prototypeBean"));
        System.out.println(context.getBean("prototypeBean"));
    }

}