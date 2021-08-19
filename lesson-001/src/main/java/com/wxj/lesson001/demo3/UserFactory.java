package com.wxj.lesson001.demo3;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 * @date 2021/8/19 0019 14:36
 */
public class UserFactory {

    public UserModel buildUser1(){
        System.out.println("--------------1");
        UserModel userModel = new UserModel();
        userModel.setName("bean实例方法创建的对象!");
        return userModel;
    }


    public UserModel buildUser2(String name,int age){
        System.out.println("-----------------2");
        UserModel userModel = new UserModel();
        userModel.setName(name);
        userModel.setAge(age);
        return userModel;
    }
}