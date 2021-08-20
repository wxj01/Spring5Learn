package com.wxj.lesson001.demo7;
import com.wxj.utils.IocUtils;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO dependon详解
 *
 * 总结
 *
 *     无依赖的bean创建顺序和定义的顺序一致，销毁顺序刚好相反
 *
 *     通过构造器强依赖的bean，会先创建构造器参数中对应的bean，然后才会创建当前bean，销毁顺序刚好相反
 *
 *     depend-on可以指定档期bean依赖的bean，通过这个可以确保depend-on指定的bean在当前bean创建之前先创建好，销毁顺序刚好相反
 *
 *     bean的销毁顺序和bean创建的顺序相反
 *
 * @date 2021/8/20 0020 14:17
 */


public class DependOnTest {

    /**
     * 无依赖的bean创建和销毁的顺序
     *
     * 从输出中可以得到2点结论：
     *
     *     bean对象的创建顺序和bean xml中定义的顺序一致
     *
     *     bean销毁的顺序和bean xml中定义的顺序相反
     */
    @Test
    public void normalBean() {
        System.out.println("容器启动中!");
        String beanXml = "normalBean.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println("容器启动完毕，准备关闭spring容器!");
        //关闭容器
        context.close();
        System.out.println("spring容器已关闭!");
    }


    /**
     * 强依赖的bean的创建和销毁顺序测试
     *
     *     bean对象的创建顺序和bean依赖的顺序一致
     *
     *     bean销毁的顺序和bean创建的顺序相反
     */
    @Test
    public void strongDependenceBean() {
        System.out.println("容器启动中!");
        String beanXml = "strongDependenceBean.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println("容器启动完毕，准备关闭spring容器!");
        context.close();
        System.out.println("spring容器已关闭!");
    }


    /**
     * 通过depend-on来干预bean创建和销毁顺序
     */
    @Test
    public void dependOnBean() {
        System.out.println("容器启动中!");
        String beanXml = "dependOnBean.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        System.out.println("容器启动完毕，准备关闭spring容器!");
        context.close();
        System.out.println("spring容器已关闭!");
    }
}