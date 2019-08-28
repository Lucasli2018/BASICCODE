package com.basic.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.omg.Messaging.SyncScopeHelper;

/**
 * Stream 使用一种类似用 SQL 语句从数据库查询数据的直观方式来 提供一种对 <b>Java 集合运算</b>和表达的高阶抽象。
 * 
 * @author 50632
 *
 */
public class Stream尝鲜 {

	public static void main(String[] args) {
//		stream();
//		forEach();
//		map();
//		filter();
//		limit();
		sorted();
	}

	// stream() − 为集合创建串行流。
	public static void stream() {
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		List<String> filtered = strings.stream()
				.filter(string -> !string.isEmpty())//可以注释掉这一句
				.filter(w->w.length()<4&&w.length()>0)
				.collect(Collectors.toList());
		strings.stream().map(w->w+",").forEach(System.out::print);
		System.out.println(filtered);
	}
	
	//Stream 提供了新的方法 'forEach' 来迭代流中的每个数据。
	public static void forEach(){
		Random random = new Random();
		random.ints().limit(3).forEach(System.out::println);
		
		
	}
	
	//map 方法用于映射每个元素到对应的结果
	public static void map(){
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		// 获取对应的平方数
		List<Integer> squaresList = numbers.stream()
				.map( i -> i*i)
				.distinct()
				.collect(Collectors.toList());
		System.out.println(squaresList);
	}
	
	//filter 方法用于通过设置的条件过滤出元素
	public static void filter(){
		List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		// 获取空字符串的数量
		int count = (int) strings.stream()
				.filter(string -> string.isEmpty())
				.count();
		System.out.println("字符串为空的单词数量="+count);
	}
	
	//limit 方法用于获取指定数量的流。
	public static void limit(){
		Random random = new Random();
		random.ints().limit(3).forEach(System.out::println);
		System.out.println(random);
	}

	//sorted 方法用于对流进行排序。
	public static void sorted(){
		Random random=new Random();
		/**
		 * 如果不添加.limit(5)会报错
		 *  java.lang.IllegalArgumentException:
		 * 		Stream size exceeds max array size
		 */
		random.ints().limit(5).sorted().forEach(System.out::println);
	}
	
	// parallelStream() − 为集合创建并行流。

}
