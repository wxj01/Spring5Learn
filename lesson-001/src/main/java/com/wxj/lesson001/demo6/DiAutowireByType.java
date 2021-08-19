package com.wxj.lesson001.demo6;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO 按照类型自动注入
 * @date 2021/8/19 0019 19:27
 */
public class DiAutowireByType {
    public static class Service1 {
        private String desc;

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        @Override
        public String toString() {
            return "Service1{" +
                    "desc='" + desc + '\'' +
                    '}';
        }
    }

    public static class Service2 {
        private String desc;

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        @Override
        public String toString() {
            return "Service2{" +
                    "desc='" + desc + '\'' +
                    '}';
        }
    }

    private Service1 service1;
    private Service2 service2;

    public Service1 getService1() {
        return service1;
    }

    public void setService1(Service1 service1) {
        System.out.println("setService1->" + service1); //@1
        this.service1 = service1;
    }

    public Service2 getService2() {
        return service2;
    }

    public void setService2(Service2 service2) {
        System.out.println("setService2->" + service2); //@2
        this.service2 = service2;
    }

    @Override
    public String toString() {
        return "DiByType{" +
                "service1=" + service1 +
                ", service2=" + service2 +
                '}';
    }
}