package com.wxj.lesson001.demo5;
import java.util.*;
/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 * @date 2021/8/19 0019 17:29
 */


public class DiOtherTypeModel {
    private List<String> list1;
    private Set<UserModel> set1;
    private Map<String, Integer> map1;
    private int[] array1;
    private Properties properties1;

    public List<String> getList1() {
        return list1;
    }

    public void setList1(List<String> list1) {
        this.list1 = list1;
    }

    public Set<UserModel> getSet1() {
        return set1;
    }

    public void setSet1(Set<UserModel> set1) {
        this.set1 = set1;
    }

    public Map<String, Integer> getMap1() {
        return map1;
    }

    public void setMap1(Map<String, Integer> map1) {
        this.map1 = map1;
    }

    public int[] getArray1() {
        return array1;
    }

    public void setArray1(int[] array1) {
        this.array1 = array1;
    }

    public Properties getProperties1() {
        return properties1;
    }

    public void setProperties1(Properties properties1) {
        this.properties1 = properties1;
    }

    @Override
    public String toString() {
        return "DiOtherTypeModel{" +
                "list1=" + list1 +
                ", set1=" + set1 +
                ", map1=" + map1 +
                ", array1=" + Arrays.toString(array1) +
                ", properties1=" + properties1 +
                '}';
    }
}