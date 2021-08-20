package com.wxj.lesson001.demo11;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * @author wxj
 * @version 1.0
 * @description: TODO bean默认是实时初始化的，可以通过bean元素的lazy-init="true"将bean定义为延迟初始化
 *
 * 总结
 *
 * 延迟初始化的bean无法在程序启动过程中迅速发现bean定义的问题，第一次获取的时候可能耗时会比较长。在实际工作中用的比较少，作为了解，以后碰到的时候会有个印象。
 *
 * @date 2021/8/20 0020 15:57
 */
public class LazyBeanTest {

    @Test
    public void actualTimeBean() {
        System.out.println("spring容器启动中...");
        String beanXml = "actualTimeBean.xml";
        new ClassPathXmlApplicationContext(beanXml); //启动spring容器
        System.out.println("spring容器启动完毕...");
    }


    @Test
    public void lazyInitBean() {
        System.out.println("spring容器启动中...");
        String beanXml = "lazyInitBean.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(beanXml); //启动spring容器
        System.out.println("spring容器启动完毕...");
        System.out.println("从容器中开始查找LazyInitBean");
        LazyInitBean lazyInitBean = context.getBean(LazyInitBean.class);
        System.out.println("LazyInitBean:" + lazyInitBean);
    }



    @Test
    public void actualTimeDependencyLazyBean() {
        System.out.println("spring容器启动中...");
        String beanXml = "actualTimeDependencyLazyBean.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(beanXml); //启动spring容器
        System.out.println("spring容器启动完毕...");
    }
}