package com.wxj.lesson002;

import com.wxj.lesson002.bean.Fruit;
import com.wxj.lesson002.config.AppConfiguration;
import com.wxj.lesson002.factorybean.FruitFactoryBean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 * @date 2022/1/7 0007 17:02
 */
public class FruitFactoryBeanTest {

    @Test
    public void test() throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        FruitFactoryBean fruitFactoryBean = context.getBean(FruitFactoryBean.class);
        Fruit fruit = fruitFactoryBean.getObject();
        System.out.println(fruit);

        Fruit fruit1 = (Fruit) context.getBean("fruitFactoryBean");
        System.out.println(fruit1);

        FruitFactoryBean bean = (FruitFactoryBean) context.getBean("&fruitFactoryBean");
        System.out.println(bean);


    }
}