package com.wxj.lesson001.demo4;


import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;
import org.springframework.lang.Nullable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO 自定义本地线程级别的bean作用域，
 *                    不同的线程中对应的bean实例是不同的，同一个线程中同名的bean是同一个实例
 * @date 2021/8/19 0019 15:34
 */
public class ThreadScope implements Scope {

//    定义了作用域的名称为一个常量thread，可以在定义bean的时候给scope使用
    public static final String THREAD_SCOPE = "thread";//@1

    private ThreadLocal<Map<String,Object>> beanMap = new ThreadLocal(){
        @Override
        protected  Object initialValue(){
            return new HashMap<>();
        }
    };


    @Override
    public Object get(String s, ObjectFactory<?> objectFactory) {

        Object bean = beanMap.get().get(s);
        if(Objects.isNull(bean)){
            bean = objectFactory.getObject();
            beanMap.get().put(s,bean);
        }
        return bean;
    }

    @Nullable
    @Override
    public Object remove(String s) {
        return beanMap.get().remove(s);
    }

    @Override
    public void registerDestructionCallback(String s, Runnable runnable) {
        //bean作用域范围结束的时候调用的方法，用于bean清理
        System.out.println(s);
    }

    @Nullable
    @Override
    public Object resolveContextualObject(String s) {
        return null;
    }

    @Nullable
    @Override
    public String getConversationId() {
        return Thread.currentThread().getName();
    }
}