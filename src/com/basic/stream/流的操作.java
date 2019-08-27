package com.basic.stream;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class 流的操作 {

	public static void main(String[] args) {
		迭代操作();
		流式操作();
		并行流式操作();
	}

	/**
	 * 对某本书的中所有长单词（长度超过12个）进行计数
	 * 
	 * @throws Exception
	 */
	public static void 迭代操作() {
		String content = "hello java ,javajavajavajavajava javajavajavajava java java over";// 读取文件

		List<String> words = Arrays.asList(content.split("\\PL+"));

		// 迭代
		long count = 0;
		for (String string : words) {
			if (string.length() > 12) {
				count++;
			}
		}
		System.out.println("长单词的数量="+count);
	}

	/**
	 * 流式操作
	 */
	public static void 流式操作() {
		String content = "hello java ,javajavajavajavajava javajavajavajava java java over";// 读取文件

		List<String> words = Arrays.asList(content.split("\\PL+"));
		
		//流式
		long count=words.stream()
				.filter(w->w.length()>12)
				.count();
		System.out.println("长单词的数量="+count);
	}
	
	/**
	 * 流式并行流式操作
	 */
	public static void 并行流式操作() {
		String content = "hello java ,javajavajavajavajava javajavajavajava java java over";// 读取文件

		List<String> words = Arrays.asList(content.split("\\PL+"));
		
		//流式
		long count=words.parallelStream()
				.filter(w->w.length()>12)
				.count();
		System.out.println("长单词的数量="+count);
	}

}
