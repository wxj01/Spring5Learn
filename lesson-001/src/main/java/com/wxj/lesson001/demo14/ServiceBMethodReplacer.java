package com.wxj.lesson001.demo14;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.lang.reflect.Method;
/**
 * @author wxj
 * @version 1.0.0
 * @ClassName ServiceBMethodReplacer.java
 * @Description TODO servieB的方法替换者
 * @createTime 2021年08月20日 21:56:00
 */
public class ServiceBMethodReplacer implements MethodReplacer, ApplicationContextAware {

    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        return this.context.getBean(ServiceA.class);
    }

    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
