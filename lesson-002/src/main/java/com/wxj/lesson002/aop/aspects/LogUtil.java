package com.wxj.lesson002.aop.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author wxj
 * @version 1.0.0
 * @ClassName LogUtil.java
 * @Description TODO
 * @createTime 2022年05月26日 23:00:00
 */
@Component
@Aspect
@Slf4j
public class LogUtil {

    @Before("execution(* com.wxj.lesson002.service.impl.*.saveUser(..))")
    public void printLog(){
      log.info("打印日志功能~~~~~~~~");
    }
}
