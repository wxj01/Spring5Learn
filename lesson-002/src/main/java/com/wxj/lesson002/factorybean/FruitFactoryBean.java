package com.wxj.lesson002.factorybean;

import com.wxj.lesson002.bean.Fruit;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO 自定义factoryBean
 * @date 2022/1/7 0007 16:59
 */
@Component
public class FruitFactoryBean implements FactoryBean<Fruit> {
    @Override
    public Fruit getObject() throws Exception {
        //获取fruit 可以自定义
        Fruit fruit = new Fruit();
        fruit.setColor("white");
        fruit.setName("apple");
        return fruit;
    }

    @Override
    public Class<?> getObjectType() {
        return Fruit.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}