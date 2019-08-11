package com.atguigu.git;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Demo01 {
    public static void main(String[] args) {
//        String str = "hello";
//        System.out.println(str.charAt(1));
//        System.out.println(str.indexOf('e'));
        Integer[] arr = {1,3,5,7,6};
        int max = (int) Collections.max(Arrays.asList(arr));
        System.out.println(max);
    }
}
