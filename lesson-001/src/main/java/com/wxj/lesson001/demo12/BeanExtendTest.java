package com.wxj.lesson001.demo12;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO bean定义继承案例
 *
 * 总结
 *
 *     bean元素的abstract属性为true的时候可以定义某个bean为一个抽象的bean，相当于定义了一个bean模板，spring容器并不会创建这个bean，从容器中查找abstract为true的bean的时候，会报错BeanIsAbstractException异常
 *
 *     bean元素的parent属性可以指定当前bean的父bean，子bean可以继承父bean中配置信息，也可以自定义配置信息，这样可以覆盖父bean中的配置
 * ————————————————
 * 版权声明：本文为CSDN博主「路人甲Java」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/likun557/article/details/104666854
 *
 * @date 2021/8/20 0020 18:32
 */

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanExtendTest {
    @Test
    public void beanExtend() {
        String beanXml = "beanExtend.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(beanXml);
        System.out.println("serviceB:" + context.getBean(ServiceBB.class));
        System.out.println("serviceC:" + context.getBean(ServiceCC.class));
    }


    @Test
    public void extendBean() {
        String beanXml = "extendBean.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(beanXml);
        System.out.println("serviceB:" + context.getBean(ServiceBB.class));
        System.out.println("serviceC:" + context.getBean(ServiceCC.class));
    }
}