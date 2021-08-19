package com.wxj.lesson001.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO spring learn
 * @date 2021/8/19 0019 11:03
 */
public class Client {
    public static void main(String[] args) {
        //1.bean配置文件位置
//        String beanXml = "classpath:src/main/resources/bean.xml";

        //放在这个位置没有获取到bean.xml，编译后的没有对应的bean.xml 文件，在 pom 中添加了有一个build后，
        // 编译后 bean.xml 出现在与com 同级目录中
        String beanXml = "classpath:/com/wxj/lesson001/demo1/bean.xml";

        //2.创建ClassPathXmlApplicationContext容器，给容器指定需要加载的bean配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");

        //3.从容器中获取需要的bean
        HelloWorld bean = applicationContext.getBean(HelloWorld.class);

        //4.使用对象
        bean.say();
    }
}