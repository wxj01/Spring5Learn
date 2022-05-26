package com.wxj.lesson001.demo16;

import org.junit.Test;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author wxj
 * @version 1.0.0
 * @ClassName ProxyTest.java
 * @Description TODO
 * @createTime 2021年08月20日 22:51:00
 */
public class ProxyTest {
    
    
   /**
    * @title
    * @description
    *
    * 方式一
    *     1.调用Proxy.getProxyClass方法获取代理类的Class对象
    *     2.使用InvocationHandler接口创建代理类的处理器
    *     3.通过代理类和InvocationHandler创建代理对象
    *     4.上面已经创建好代理对象了，接着我们就可以使用代理对象了
    *
    * @author wxj 
    * @updateTime 2021/8/20 0020 23:21 
    * @throws 
    */
    @Test
    public void m1() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 1. 获取接口对应的代理类
        Class<IService> proxyClass = (Class<IService>) Proxy.getProxyClass(IService.class.getClassLoader(), IService.class);
        // 2. 创建代理类的处理器
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("我是InvocationHandler，被调用的方法是：" + method.getName());
                return null;
            }
        };
        // 3. 创建代理实例
        IService proxyService = proxyClass.getConstructor(InvocationHandler.class).newInstance(invocationHandler);
        // 4. 调用代理的方法
        proxyService.m1();
        proxyService.m2();
        proxyService.m3();
    }


    /**
     * @title
     * @description
     * 方式二
     *     1.使用InvocationHandler接口创建代理类的处理器
     *     2.使用Proxy类的静态方法newProxyInstance直接创建代理对象
     *     3.使用代理对象
     * @author wxj 
     * @updateTime 2021/8/20 0020 23:23 
     * @throws 
     */
    @Test
    public void m2() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 1. 创建代理类的处理器
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("我是InvocationHandler，被调用的方法是：" + method.getName());
                return null;
            }
        };
        // 2. 创建代理实例
        IService proxyService = (IService) Proxy.newProxyInstance(IService.class.getClassLoader(), new Class[]{IService.class}, invocationHandler);
        // 3. 调用代理的方法
        proxyService.m1();
        proxyService.m2();
        proxyService.m3();
    }
}
