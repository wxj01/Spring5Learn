package com.wxj.lesson001.demo9;

import com.wxj.utils.IocUtils;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO bean元素的autowire-candidate可以设置当前bean是否作为其他bean自动注入的候选bean
 *
 * 容器在创建setterBean的时候，发现其autowire为byType，即按类型自动注入，此时会在SetterBean类中查找所有setter方法列表，
 * 其中就包含了setService方法，setService方法参数类型是IService，然后就会去容器中按照IService类型查找所有符合条件的bean列表，
 * 此时容器中会返回满足IService这种类型并且autowire-candidate="true"的bean，
 * 刚才有说过bean元素的autowire-candidate的默认值是true，所以容器中符合条件的候选bean有2个：
 * serviceA和serviceB，setService方法只需要一个满足条件的bean，
 * 此时会再去看这个列表中是否只有一个主要的bean（即bean元素的primary=“ture”的bean），
 * 而bean元素的primary默认值都是false，所以没有primary为true的bean，
 * 此时spring容器懵了，不知道选哪个了，此时就报错了，抛出NoUniqueBeanDefinitionException异常
 *
 * @date 2021/8/20 0020 15:10
 */
public class AutowireCandidateTest {
    @Test
    public void setterBean() {
        String beanXml = "autowireCandidateBean.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println(context.getBean(SetterBean.class)); //@1

        SetterBean.IService service = context.getBean(SetterBean.IService.class); //@2
        System.out.println(service);
    }
}