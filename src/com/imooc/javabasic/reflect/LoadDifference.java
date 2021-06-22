package com.imooc.javabasic.reflect;

import com.sun.org.apache.bcel.internal.generic.LoadClass;

public class LoadDifference {
    public static void main(String[] args) throws ClassNotFoundException {
        // loadClass方法加载类的时候，不会对类进行初始化
        // 应用：spring 懒加载，不初始化类，加快加载速度
         ClassLoader cl = Robot.class.getClassLoader();
         Class r = cl.loadClass("com.imooc.javabasic.reflect.Robot");
        // 2.forName方法会初始话类
        // 应用：mysql直接就可以初始化驱动
        Class r1 = Class.forName("com.imooc.javabasic.reflect.Robot");
    }
}
