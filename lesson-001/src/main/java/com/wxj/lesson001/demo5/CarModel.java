package com.wxj.lesson001.demo5;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 * @date 2021/8/19 0019 17:15
 */

import java.beans.ConstructorProperties;

public class CarModel {
    private String name;
    //描述信息
    private String desc;

    public CarModel() {
    }

    @ConstructorProperties({"name", "desc"})
    public CarModel(String p1, String p2) {
        this.name = p1;
        this.desc = p2;
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}