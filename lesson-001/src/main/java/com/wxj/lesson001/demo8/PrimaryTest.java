package com.wxj.lesson001.demo8;
import com.wxj.utils.IocUtils;


import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * @author wxj
 * @version 1.0
 * @description: TODO bean元素的primary属性可以解决什么问题？
 *
 * 当希望从容器中获取到一个bean对象的时候，容器中却找到了多个匹配的bean，此时spring不知道如何选择了，处于懵逼状态，就会报这个异常。
 *
 * spring中可以通过bean元素的primary属性来解决这个问题，可以通过这个属性来指定当前bean为主要候选者，
 * 当容器查询一个bean的时候，如果容器中有多个候选者匹配的时候，此时spring会返回主要的候选者
 *
 * 总结
 *
 * 当从容器中查找一个bean的时候，如果容器中出现多个Bean候选者时，可以通过primary="true"将当前bean置为首选者，
 * 那么查找的时候就会返回主要的候选者，否则将抛出异常
 *
 *
 * @date 2021/8/20 0020 14:37
 */
public class PrimaryTest {


    //org.springframework.beans.factory.NoUniqueBeanDefinitionException:
    // No qualifying bean of type 'com.wxj.lesson001.demo8.NormalBean$IService' available:
    // expected single matching bean but found 2: serviceA,serviceB

    @Test
    public void normalBean() {
        String beanXml = "normalBean08.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        //下面我们通过spring容器的T getBean(Class<T> requiredType)方法获取容器中对应的bean
        NormalBean.IService service = context.getBean(NormalBean.IService.class); //@1
        System.out.println(service);
    }

    //org.springframework.beans.factory.UnsatisfiedDependencyException:
    // Error creating bean with name 'setterBean' defined in class path resource [setterBean.xml]:
    // Unsatisfied dependency expressed through bean property 'service';
    // nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException:
    // No qualifying bean of type 'com.wxj.lesson001.demo8.SetterBean$IService' available:
    // expected single matching bean but found 2: serviceA,serviceB

    @Test
    public void setterBean() {
        String beanXml = "setterBean.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
    }



    @Test
    public void primaryBean() {
        String beanXml = "primaryBean.xml";
        ClassPathXmlApplicationContext context = IocUtils.context(beanXml);
        PrimaryBean.IService service = context.getBean(PrimaryBean.IService.class); //@1
        System.out.println(service);
        PrimaryBean primaryBean = context.getBean(PrimaryBean.class); //@2
        System.out.println(primaryBean);
    }
}