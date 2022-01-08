package com.wxj.lesson001.demo15;

/**
 * @author wxj
 * @version 1.0.0
 * @ClassName ServiceA.java
 * @Description TODO
 * @createTime 2021年08月20日 22:14:00
 */

public class ServiceA implements IService {
    @Override
    public void m1() {
        System.out.println("我是ServiceA中的m1方法!");
    }

    @Override
    public void m2() {
        System.out.println("我是ServiceA中的m2方法!");
    }

    @Override
    public void m3() {
        System.out.println("我是ServiceA中的m3方法!");
    }
}
