package com.wxj.utils;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 * @date 2021/8/19 0019 16:53
 */


public class IocUtils {
    public static ClassPathXmlApplicationContext context(String beanXml) {
        return new ClassPathXmlApplicationContext(beanXml);
    }
}