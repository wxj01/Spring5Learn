package com.wxj.lesson001.demo5;

import com.wxj.utils.IocUtils;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 * @date 2021/8/19 0019 16:56
 */
public class DiTest {

    /** 
     * @description: 通过构造器的参数位置注入
     * @param: * @param:  
     * @return: void 
     * @author wangxinjian
     * @date: 2021/8/19 0019 16:57
     */ 
    @Test
    public void diByConstructorParamIndex(){
        String beanXml = "diByConstructorParamIndex.xml";

        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);

        System.out.println(context.getBean("diByConstructorParamIndex"));
    }


    /**
     * 通过构造器的参数类型注入
     */
    @Test
    public void diByConstructorParamType() {
        String beanXml = "diByConstructorParamIndex.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println(context.getBean("diByConstructorParamType"));
    }


    /**
     * 通过构造器的参数名称注入
     */
    @Test
    public void diByConstructorParamName() {
        String beanXml = "diByConstructorParamName.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println(context.getBean("diByConstructorParamName"));
    }


    /**
     * 通过setter方法注入
     */
    @Test
    public void diBySetter() {
        String beanXml = "diBySetter.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println(context.getBean("diBySetter"));
    }

    @Test
    public void diBean(){
        String beanXml = "diBean.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println(context.getBean("diBeanByConstructor"));
        System.out.println(context.getBean("diBeanBySetter"));
    }


    /**
     * 其他各种类型注入
     */
    @Test
    public void diOtherType() {
        String beanXml = "diOtherType.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println(context.getBean("diOtherType"));
    }
}