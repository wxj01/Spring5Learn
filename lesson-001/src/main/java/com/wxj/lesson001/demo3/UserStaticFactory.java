package com.wxj.lesson001.demo3;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 * @date 2021/8/19 0019 14:24
 */
public class UserStaticFactory {
    /**
     * 静态无参方法创建UserModel
     *
     * @return
     */
    public static UserModel buildUser1(){
        System.out.println(UserStaticFactory.class + ".buildUser1");
        UserModel userModel = new UserModel();
        userModel.setName("我是无参构造方法创建的");
        return userModel;
    }
    /** 
     * @description:
     * @param: * @param: name
 * @param: age
     * @return: com.wxj.lesson001.demo3.UserModel 
     * @author wangxinjian
     * @date: 2021/8/19 0019 14:37
     */ 
    public static UserModel buildUser2(String name , int age){
        System.out.println(UserStaticFactory.class + ".buildUser2");
        UserModel userModel = new UserModel();
        userModel.setName(name);
        userModel.setAge(age);

        return userModel;
    }

}