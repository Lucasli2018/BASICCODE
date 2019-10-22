package com.jason.variable;

import org.junit.Test;

/**
 * 变量
 * @author Administrator
 *
 */
public class Variable {
	
	@Test
	public void demo(){
		//声明变量
		int num;
		double salary;
		String name;
		char sex;
		boolean enable;
		//虽然$是合法的java字符，但不要在自己的代码中使用这个字符，它只用在java编译器生成的名字中
		String $address;
		//可以在一行中声明多个变量，但是为了提高程序可读性，不建议这样做
		int i = 0,j,k;
		System.out.println(i);
	}
}
