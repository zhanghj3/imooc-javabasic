package com.imooc.javabasic.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RelfectSample {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException {
        Class rc = Class.forName("com.imooc.javabasic.reflect.Robot");
        Robot r = (Robot)rc.newInstance();
        System.out.println("class name is" + rc.getName());
        // getDeclaredMethod能获取类的所有方法，但是不能获取继承的和实现的接口的方法
        Method getHello = rc.getDeclaredMethod("throwHello", String.class);
        // 因为是私有方法，所以必须设置为true;
        getHello.setAccessible(true);
        Object str = getHello.invoke(r,"Bob");
        System.out.println("getHello result is " + str);
        // getMethod只能类的public的方法，和继承的public方法，和实现的接口的一些方法
        Method sayHi = rc.getMethod("sayHi", String.class);
        sayHi.invoke(r,"welcome");
        Field name = rc.getDeclaredField("name");
        name.setAccessible(true);
        name.set(r,"Alice");
        sayHi.invoke(r,"welcome ");
    }
}
