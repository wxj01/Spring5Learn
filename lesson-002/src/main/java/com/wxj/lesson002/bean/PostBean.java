package com.wxj.lesson002.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 * @date 2022/1/7 0007 15:08
 */
@Component
@Data
public class PostBean {
    private String author;

    public void sayhello() {
        System.out.println(String.format("author %s say hello!", author));
    }
}