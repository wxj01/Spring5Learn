package com.wxj.lesson002.postprocessor;

import com.wxj.lesson002.bean.ConcreteRPBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO BeanDefinitionRegistryPostProcessor==>ConcreteBeanDefinitionRegistryPostProcessor
 * @date 2022/1/7 0007 16:04
 */
@Component
public class ConcreteBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    public static final String beanName = "concreteRPBean";

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition(ConcreteRPBean.class)
                .getBeanDefinition();
        registry.registerBeanDefinition(beanName,beanDefinition);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName);
        MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
        propertyValues.addPropertyValue("author", "aabbcc");
    }
}