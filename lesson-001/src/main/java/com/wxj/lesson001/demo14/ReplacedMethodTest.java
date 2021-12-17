package com.wxj.lesson001.demo14;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wxj
 * @version 1.0.0
 * @ClassName ReplacedMethodTest.java
 * @Description TODO replaced-method：方法替换
 * @createTime 2021年08月20日 22:02:00
 */


public class ReplacedMethodTest {

    @Test
    public void replacedmethod() {
        String beanXml = "replacedmethod.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(beanXml);

        System.out.println(context.getBean(ServiceA.class)); //@1
        System.out.println(context.getBean(ServiceA.class)); //@2

        System.out.println("serviceB中的serviceA");
        ServiceB serviceB = context.getBean(ServiceB.class); //@3
        serviceB.say();
        serviceB.say();
    }

}
