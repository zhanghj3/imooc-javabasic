package com.imooc.javabasic.reflect;

public class ClassLoaderChecker {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        MyClassLoader m = new MyClassLoader("D:\\github-project\\imooc-javabasic","myClassLoader");
        Class c = m.findClass("Wali");
        System.out.println(c.getClassLoader());
        // 验证自定义的ClassLoader的父类是什么，还有父类的父类...
        System.out.println(c.getClassLoader().getParent());
        System.out.println(c.getClassLoader().getParent().getParent());
        System.out.println(c.getClassLoader().getParent().getParent().getParent());
        c.newInstance();
    }
}
