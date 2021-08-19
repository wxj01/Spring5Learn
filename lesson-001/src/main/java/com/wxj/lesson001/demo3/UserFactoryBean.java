package com.wxj.lesson001.demo3;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 * @date 2021/8/19 0019 15:02
 */
public class UserFactoryBean implements FactoryBean<UserModel> {

    int count = 1;
    @Nullable //如果可以传入NULL值，则标记为@Nullable，如果不可以，则标注为@Nonnull
    @Override
    public UserModel getObject() throws Exception {//@1
        UserModel userModel = new UserModel();
        userModel.setName("我是通过FactoryBean创建的第"+count+++ "对象");//@4
        return userModel;
    }

    @Nullable
    @Override
    public Class<?> getObjectType() {
        return UserModel.class;//@2
    }

    @Override
    public boolean isSingleton() {
//        return FactoryBean.super.isSingleton();
//        return true;//@3
        return false;//@3
    }
}