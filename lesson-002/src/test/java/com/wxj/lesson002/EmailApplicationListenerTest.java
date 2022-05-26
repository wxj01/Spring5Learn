package com.wxj.lesson002;

import com.wxj.lesson002.bean.EmailEvent;
import com.wxj.lesson002.config.AppConfiguration;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 * @date 2022/1/7 0007 17:21
 */
public class EmailApplicationListenerTest {

    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        context.publishEvent(new EmailEvent("this is source",
                "throwable","here is emailEvent","2017-5-16"));
    }
}