package com.basic.if_else;

import java.util.Scanner;

public class 求闰年 {

	/**求闰年
	 * 1、可以被400整除
	 * 2、可以被4整除但不能被100整除
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("请输入一个年份：");
		Scanner scanner=new Scanner(System.in);
		int year=scanner.nextInt();
		if (year%400==0||(year%4==0&&year%100!=0)) {
			System.out.println(year+"年 是闰年");
		}else{
			System.out.println(year+"年 不是闰年");
		}
	}
}
