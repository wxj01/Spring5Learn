package com.wxj.lesson001.tx.demo1;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO spring事务拦截器顺序
 * @date 2021/10/8 0008 14:48
 */
@Component
@Aspect
@Order(1)
public class TransactionInterceptorBefore {
}