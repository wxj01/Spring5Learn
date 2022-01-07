package com.wxj.lesson002.config;

import com.wxj.lesson002.annotation.EnableThrowable;
import com.wxj.lesson002.service.ConcreteService;
import org.springframework.context.annotation.Configuration;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 * @date 2022/1/7 0007 11:18
 */
@Configuration
@EnableThrowable(targets = {ConcreteService.class})
public class ConcreteConfiguration {
}