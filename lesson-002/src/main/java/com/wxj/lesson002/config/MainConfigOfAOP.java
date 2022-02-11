package com.wxj.lesson002.config;

import com.wxj.lesson002.aop.MathCalculator;
import com.wxj.lesson002.aop.aspects.LogAspects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO AOP：面向切面编程，其底层就是动态代理
 *  *      指在程序运行期间动态地将某段代码切入到指定方法指定位置进行运行的编程方式
 * @date 2022/2/11 0011 20:26
 */

@Configuration
@EnableAspectJAutoProxy
public class MainConfigOfAOP {

    @Bean
    public MathCalculator calculator(){
        return new MathCalculator();
    }

    @Bean
    public LogAspects logAspects(){
        return new LogAspects();
    }
}