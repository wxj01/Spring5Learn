package com.wxj.lesson002;

import com.wxj.lesson002.aop.MathCalculator;
import com.wxj.lesson002.config.MainConfigOfAOP;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 * @date 2022/2/11 0011 20:08
 */
public class AopTest {

    @Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);


        MathCalculator mathCalculator = applicationContext.getBean(MathCalculator.class);
//        mathCalculator.div(1,1);
        mathCalculator.div(1,0);

        applicationContext.close();
    }

}