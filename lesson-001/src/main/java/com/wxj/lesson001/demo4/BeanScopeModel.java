package com.wxj.lesson001.demo4;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 * @date 2021/8/19 0019 15:10
 */
public class BeanScopeModel {
    public BeanScopeModel(String beanScope) {
        System.out.println(String.format("create BeanScopeModel,{sope=%s},{this=%s}", beanScope, this));
    }
}