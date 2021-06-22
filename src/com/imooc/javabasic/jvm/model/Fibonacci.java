package com.imooc.javabasic.jvm.model;

public class Fibonacci {
    // F(0)=0,F(1)=1,当n>2时，F(n) = F(n-1) + F(n-2)
    // F(2)=F(1)+F(0)=1, F(3)=F(2)+F(1)=1+1=2
    // F(0) -- F(N) 以此为：0,1,1,2,3,5,8,13,21,34,55...
    public static int fibonacci(int n){
        if(n==0){return 0;}
        if(n==1){return 1;}
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(0));
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(9));
        // 复现java.lang.StackOverflowError
        // 递归过深，栈帧数超出虚拟栈深度
        // 解决：限制递归的次数，或者利用循环来替代递归
        System.out.println(fibonacci(1000000));

        // 复现OutOfMemoryError
        // 因为一个线程就对应一个虚拟机栈，线程无限增多时，虚拟机栈数量也会无限多，就导致内存溢出
        // 下面执行可能会导致电脑死机 慎重
        // stackLeakByThread();
    }

    public static void stackLeakByThread(){
        while(true) {
            new Thread(){
                @Override
                public void run(){
                    while (true){

                    }
                }
            }.start();
        }
    }
}
