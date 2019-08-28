package com.basic.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class 排序 {

	public static void main(String[] args) {
		List<String> names1=getData();
		System.out.println("使用 Java 7 语法: ");
		System.out.println(names1);
		Collections.sort(names1, new Comparator<String>() {
	         @Override
	         public int compare(String s1, String s2) {
	            return s1.compareTo(s2);
	         }
	      });
		System.out.println(names1);
		
		List<String> names2=getData();
		
		System.out.println("使用 Java 8 语法: ");
		System.out.println(names2);
		Collections.sort(names2, (s1, s2) -> s1.compareTo(s2));
		System.out.println(names2);
	}

	public static List<String> getData() {
		List<String> names = new ArrayList<String>();
		names.add("Google ");
		names.add("Runoob ");
		names.add("Taobao ");
		names.add("Baidu ");
		names.add("Sina ");
		return names;
	}

}
