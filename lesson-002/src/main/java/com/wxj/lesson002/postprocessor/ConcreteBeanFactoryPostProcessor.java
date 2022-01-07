package com.wxj.lesson002.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO  BeanFactoryPostProcessor==>ConcreteBeanFactoryPostProcessor
 * @date 2022/1/7 0007 14:59
 */
@Component
public class ConcreteBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition bf = beanFactory.getBeanDefinition("postBean");
        MutablePropertyValues propertyValues = bf.getPropertyValues();
        propertyValues.add("author","throwable");
    }
}