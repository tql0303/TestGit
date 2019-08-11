package com.atguigu.git;

import java.util.HashMap;
import java.util.Map;

public class test {
	public static void main(String[] args) {

		Map map = new HashMap();
		map.put(1,null);
		System.out.println(map.containsKey(null));
		System.out.println(map.get(1)==null);
		int a ='2';
		System.out.println(a);
	}
}
