package com.wxj.lesson001.demo8;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 * @date 2021/8/20 0020 14:54
 */
public class PrimaryBean {
    public interface IService{} //@1
    public static class ServiceA implements IService{} //@2
    public static class ServiceB implements IService{} //@3

    private IService service;

    public void setService(IService service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "PrimaryBean{" +
                "service=" + service +
                '}';
    }
}