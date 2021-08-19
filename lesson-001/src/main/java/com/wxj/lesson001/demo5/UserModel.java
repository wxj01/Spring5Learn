package com.wxj.lesson001.demo5;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 * @date 2021/8/19 0019 16:50
 */

public class UserModel {
    private String name;
    private int age;
    //描述信息
    private String desc;

    public UserModel() {
    }

    public UserModel(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public UserModel(String name, int age, String desc) {
        this.name = name;
        this.age = age;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", desc='" + desc + '\'' +
                '}';
    }
}