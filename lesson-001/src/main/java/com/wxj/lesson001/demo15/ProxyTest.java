package com.wxj.lesson001.demo15;
import org.junit.Test;
/**
 * @author wxj
 * @version 1.0.0
 * @ClassName ProxyTest.java
 * @Description TODO
 *
 * 1.调用Proxy.getProxyClass方法获取代理类的Class对象
 * 2.使用InvocationHandler接口创建代理类的处理器
 * 3.通过代理类和InvocationHandler创建代理对象
 * 4.上面已经创建好代理对象了，接着我们就可以使用代理对象了
 *
 *
 * @createTime 2021年08月20日 22:16:00
 */

public class ProxyTest {
    @Test
    public void m1() {
        IService serviceA = new ServiceA();
        IService serviceB = new ServiceB();
        serviceA.m1();
        serviceA.m2();
        serviceA.m3();

        serviceB.m1();
        serviceB.m2();
        serviceB.m3();
    }


    @Test
    public void serviceProxy() {
        IService serviceA = new ServiceProxy(new ServiceA());//@1
        IService serviceB = new ServiceProxy(new ServiceB()); //@2
        serviceA.m1();
        serviceA.m2();
        serviceA.m3();

        serviceB.m1();
        serviceB.m2();
        serviceB.m3();
    }
}
