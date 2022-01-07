package com.wxj.lesson002.bean;

import lombok.Data;
import org.springframework.context.ApplicationEvent;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 * @date 2022/1/7 0007 17:16
 */
@Data
public class EmailEvent extends ApplicationEvent {

    private String author;
    private String content;
    private String date;
    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public EmailEvent(Object source, String author, String content, String date) {
        super(source);
        this.author = author;
        this.content = content;
        this.date = date;
    }
}