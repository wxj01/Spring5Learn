package com.wxj.lesson002.bean;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 * @date 2022/1/7 0007 16:08
 */
public class ConcreteRPBean {

    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void sayHello(){
        System.out.println(String.format("ConcreteRPBean call sayhello method ==> author %s say hello!", author));
    }
}