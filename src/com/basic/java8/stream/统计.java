package com.basic.java8.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * 产生统计结果的收集器也非常有用。它们主要用于int、double、long等基本类型上
 * @author 50632
 *
 */
public class 统计 {

	public static void main(String[] args) {
		test();
	}

	public static void test(){
		List<Integer> numbers = Arrays.asList(1, 2,   3, 4, 5);
		 
		IntSummaryStatistics stats = numbers.stream()
				.mapToInt((x) -> x)
				.summaryStatistics();
		 
		System.out.println("列表中最大的数 : " + stats.getMax());//int
		System.out.println("列表中最小的数 : " + stats.getMin());//int
		System.out.println("所有数之和 : " + stats.getSum());//long
		System.out.println("平均数 : " + stats.getAverage());//double

	}
}
