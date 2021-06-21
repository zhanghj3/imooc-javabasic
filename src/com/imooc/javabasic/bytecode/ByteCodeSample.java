package com.imooc.javabasic.bytecode;

public class ByteCodeSample {
    // 1.编译javac
    // 2.运行java
    // 3.查看字节码javap
    public static void main(String[] args) {
        int i=1,j=5;
        i++;
        ++j;
        System.out.println(i);
        System.out.println(j);
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println(System.getProperty("java.class.path"));
    }
}
