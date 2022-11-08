package com.hong.common.utils;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ReflectionUtils
 * @Description 反射工具类
 * @Author wangweihong
 * @Date 2022/11/8 16:47
 * @Version 1.0
 */
public class ReflectionUtils {

    /**
     * 根据class创建对象
     *
     * @param clazz 类运行时对象
     * @param <T>   对象类型
     * @return 实体对象
     */
    public static <T> T newInstance(Class<T> clazz) {
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalStateException(e.getMessage());
        }
    }


    public static Method[] getPublicMethods(Class clazz) {
        //获取这个类对象所有的方法
        Method[] methods = clazz.getDeclaredMethods();
        List<Method> list = new ArrayList<>();
        for (Method method : methods) {

        }
        return list.toArray(new Method[0]);
    }

//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        String[] s = new String[0];
//        list.add("a");
//        list.add("b");
//        String[] strings = list.toArray(s);
//        System.out.println(Arrays.toString(strings));
//    }

    public static void main(String[] args) {
        System.out.println(4&1);
    }
}
