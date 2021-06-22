package com.imooc.javabasic.jvm.model;

public class ByteCodeSample {
    /**
     * 通过javap -v ByteCodeSample.class 反编译
     *
     *
     * public static int add(int, int);
     *     descriptor: (II)I
     *     flags: ACC_PUBLIC, ACC_STATIC
     *     Code:
     *       stack=2, locals=3, args_size=2
     *          0: iconst_0                     每一步都会对应一个栈帧，根据数字
     *          1: istore_2                     大小将栈帧压入栈，然后后进先出，就会
     *          2: iload_0                      从0执行到7
     *          3: iload_1
     *          4: iadd
     *          5: istore_2
     *          6: iload_2
     *          7: ireturn
     *       LineNumberTable:
     *         line 5: 0         代码第5行对应字节码第0行
     *         line 6: 2
     *         line 7: 6
     *
     *
     *
     *
     *
     */
    public static int add(int a, int b){
        int c = 0;
        c = a + b;
        return c;
    }
}
