package com.wxj.lesson001.demo6;
import com.wxj.utils.IocUtils;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collection;
import java.util.List;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO xml中自动注入配置案例
 * @date 2021/8/19 0019 18:24
 */



public class DiAutowireTest {

//    用来判断c2和c1是否相等，或者c2是否是c1的子类。
    @Test
    public void isAssignableFrom(){
        System.out.println(Object.class.isAssignableFrom(Integer.class)); //true
        System.out.println(Object.class.isAssignableFrom(int.class)); //false
        System.out.println(Object.class.isAssignableFrom(List.class)); //true
        System.out.println(Collection.class.isAssignableFrom(List.class)); //true
        System.out.println(List.class.isAssignableFrom(Collection.class)); //false
    }

    /**
     * 按照名称进行注入  这个test
     * org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'diAutowireByName' available
     * 没看明白
     */
    @Test
    public void diAutowireByName() {
        String beanXml = "diAutowireByName.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println(context.getBean("diAutowireByName1"));
        System.out.println(context.getBean("diAutowireByName2"));
    }


    /**
     * 按照set方法参数类型进行注入
     */
    @Test
    public void diAutowireByType() {
        String beanXml = "diAutowireByType.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println(context.getBean("diAutowireByType1"));
        System.out.println(context.getBean("diAutowireByType2"));
    }
}