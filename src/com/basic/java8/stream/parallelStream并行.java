package com.basic.java8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Stream的并行处理版本
 * 
 * @author 50632
 *
 */
public class parallelStream并行 {

	public static void main(String[] args) {
		parallelStream();
	}

	public static void parallelStream() {
		List<String> strings = Arrays.asList("abc", "", "bc", "","");
		// 获取空字符串的数量
		int count = (int) strings.parallelStream()
				.filter(string -> string.isEmpty())
				.count();
		System.out.println("空字符串的数量="+count);
	}

}
