package com.basic.if_else;

public class 求闰年 {

	/**求闰年
	 * 1、可以被400整除
	 * 2、可以被4整除但不能被100整除
	 * @param args
	 */
	public static void main(String[] args) {
		int year=2020;
		if (year%400==0||(year%4==0&&year%100!=0)) {
			System.out.println(year+" 是闰年");
		}else{
			System.out.println(year+" 不是闰年");
		}
	}
}
