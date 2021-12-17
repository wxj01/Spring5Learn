package com.wxj.lesson001.demo6;
import com.wxj.utils.IocUtils;

import org.junit.jupiter.api.Test;
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
        System.out.println(context.getBean("DiAutowireByType1"));
        System.out.println(context.getBean("DiAutowireByType2"));
    }


    /**
     * 按照类型注入集合
     */
    @Test
    public void diAutowireByTypeExtend() {
        String beanXml = "diAutowireByTypeExtend.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        //从容器中获取DiAutowireByTypeExtend
        DiAutowireByTypeExtend diAutowireByTypeExtend = context.getBean(DiAutowireByTypeExtend.class);
        //输出diAutowireByTypeExtend中的属性看一下
        System.out.println("serviceList：" + diAutowireByTypeExtend.getServiceList());
        System.out.println("baseServieList：" + diAutowireByTypeExtend.getBaseServieList());
        System.out.println("service1Map：" + diAutowireByTypeExtend.getService1Map());
        System.out.println("baseServieMap：" + diAutowireByTypeExtend.getBaseServieMap());
    }



    /**
     * 构造函数的方式进行自动注入
     */
    @Test
    public void diAutowireByConstructor() {
        String beanXml = "diAutowireByConstructor.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println(context.getBean("diAutowireByConstructor"));
    }


    /**
     * autowire=default
     */
    @Test
    public void diAutowireByDefault() {
        String beanXml = "diAutowireByDefault.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println(context.getBean("diAutowireByDefault1"));
        System.out.println(context.getBean("diAutowireByDefault2"));
    }
}