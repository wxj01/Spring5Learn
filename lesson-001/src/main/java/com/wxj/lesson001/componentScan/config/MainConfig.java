package com.wxj.lesson001.componentScan.config;

import com.wxj.lesson001.componentScan.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 * @date 2021/11/15 0015 10:28
 */
@Configuration
@ComponentScan(value = "com.wxj.lesson001.componentScan")
public class MainConfig {
    // @Bean注解是给IOC容器中注册一个bean，类型自然就是返回值的类型，id默认是用方法名作为id
    @Bean("person")
    public Person person01() {
        return new Person("liayun", 20);
    }
}