package com.wxj.lesson001.demo12;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 * @date 2021/8/20 0020 18:31
 */
public class ServiceCC {
    private String name;
    private ServiceAA serviceAA;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ServiceAA getServiceAA() {
        return serviceAA;
    }

    public void setServiceAA(ServiceAA serviceAA) {
        this.serviceAA = serviceAA;
    }

    @Override
    public String toString() {
        return "ServiceCC{" +
                "name='" + name + '\'' +
                ", serviceAA=" + serviceAA +
                '}';
    }
}