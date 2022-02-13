package com.wxj.lesson002.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 * @date 2022/2/11 0011 20:16
 */
@Aspect
public class LogAspects {

    /**
     * @description: TODO
     * 除法运行......@Before，参数列表是：{[1, 0]}
     * MathCalculator .... div...
     * div除法结束......@After
     * div出现异常......异常信息：{java.lang.ArithmeticException: / by zero
     * @author wangxinjian
     * @date 2022/2/11 0011 20:35
     * @version 1.0
     */

    @Pointcut( "execution(public int com.wxj.lesson002.aop.MathCalculator.*(..))")
    private void wxjLogMathCalculator(){}


    @Before("wxjLogMathCalculator()")
    public void logStart(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println("除法运行......@Before，参数列表是：{" + Arrays.asList(args) + "}");
    }

//    @After("wxjLogMathCalculator()")
    @After("com.wxj.lesson002.aop.aspects.LogAspects.wxjLogMathCalculator()")
    public void logEnd(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName() + "除法结束......@After");
    }

    @AfterReturning(value = "wxjLogMathCalculator()", returning="result") // returning来指定我们这个方法的参数谁来封装返回值
    public void logReturn(JoinPoint joinPoint, Object result) {
        System.out.println(joinPoint.getSignature().getName() +"除法正常返回......@AfterReturning，运行结果是：{" + result + "}");
    }

    @AfterThrowing(value = "wxjLogMathCalculator()", throwing="exception")
    public void logException(JoinPoint joinPoint, Exception exception) {

        System.out.println(joinPoint.getSignature().getName() + "出现异常......@AfterThrowing异常信息：{" + exception + "}");    }

}