package com.wxj.lesson002.aop;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 * @date 2022/2/11 0011 20:14
 */
public class MathCalculator {
    public int div(int i, int j){
        System.out.println("MathCalculator .... div...");
        return i / j;
    }
}