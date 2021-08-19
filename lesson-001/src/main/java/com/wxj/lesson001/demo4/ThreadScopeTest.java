package com.wxj.lesson001.demo4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO 自定义scope
 * @date 2021/8/19 0019 15:48
 */
public class ThreadScopeTest {
    public static void main(String[] args) {

        //手动创建容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
        // 设置配置文件位置
        context.setConfigLocation("beans-thread.xml");

        //启动容器
        context.refresh();

        //向容器中注册自定义的scope
        // 这个地方向容器中注册了自定义的ThreadScope
        context.getBeanFactory().registerScope(ThreadScope.THREAD_SCOPE,new ThreadScope());

//        创建了2个线程，然后在每个线程中去获取同样的bean 2次，然后输出
        for (int i = 0; i < 2; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread() + "," + context.getBean("threadBean"));
                System.out.println(Thread.currentThread() + "," + context.getBean("threadBean"));
            }).start();
            try {
                TimeUnit.SECONDS.sleep(4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}