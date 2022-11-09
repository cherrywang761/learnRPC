package com.hong.common.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
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

    /**
     * 获取某个class的共有方法
     * @param clazz 类运行时对象
     * @return 当前类的所有公共方法
     */
    public static Method[] getPublicMethods(Class clazz) {
        //获取这个类对象所有的方法
        Method[] methods = clazz.getDeclaredMethods();
        List<Method> list = new ArrayList<>();
        for (Method method : methods) {
            if(Modifier.isPublic(method.getModifiers())){
                list.add(method);
            }
        }
        return list.toArray(new Method[0]);
    }

    /**
     * 反射实现某个对象的某个方法
     * @param obj 对象实体
     * @param method 对象方法
     * @param args 方法参数
     * @return 方法返回参数
     */
    public static Object invoke(Object obj, Method method, Object... args){
        try {
            return method.invoke(obj, args);
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalStateException(e.getMessage());
        }
    }



}
