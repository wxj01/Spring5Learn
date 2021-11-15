package com.wxj.lesson001.demo13.lookupmethod;

/**
 * @author wxj
 * @version 1.0.0
 * @ClassName ServiceB.java
 * @Description TODO
 * @createTime 2021年08月20日 21:49:00
 */

public class ServiceB {

    public void say() {
        ServiceA serviceA = this.getServiceA();
        System.out.println("this:" + this + ",serviceA:" + serviceA);
    }

    public ServiceA getServiceA() { //@1
        return null;
    }

}
