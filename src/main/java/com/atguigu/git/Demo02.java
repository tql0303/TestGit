package com.atguigu.git;

public class Demo02 {
    private String name;

    public Demo02(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Demo02 d1 = new Demo02("tom");
        Demo02 d2 = new Demo02("tom");
        System.out.println(d1.equals(d2));
    }
}
