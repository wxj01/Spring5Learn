package com.wxj.lesson002.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author wxj
 * @version 1.0.0
 * @ClassName AopContextConfiguration.java
 * @Description TODO
 * @createTime 2022年05月26日 23:07:00
 */
@Configuration
@EnableAspectJAutoProxy(exposeProxy = true)
@ComponentScan("com.wxj.lesson002")
public class AopContextConfiguration {
}
