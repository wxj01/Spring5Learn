package com.wxj.lesson002.applicationlistener;

import com.wxj.lesson002.bean.EmailEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 * @date 2022/1/7 0007 17:18
 */
@Component
public class EmailApplicationListener implements ApplicationListener<EmailEvent> {

    @Override
    public void onApplicationEvent(EmailEvent event) {
        System.out.println("EmailApplicationListener callback!!");
        System.out.println("EmailEvent --> source: " + event.getSource());
        System.out.println("EmailEvent --> author: " + event.getAuthor());
        System.out.println("EmailEvent --> content: " + event.getContent());
        System.out.println("EmailEvent --> date: " + event.getDate());
    }
}