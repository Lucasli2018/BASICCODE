package com.basic.ref;

public class 引用和传值 {

	public static void main(String[] args) {
		//testvalue();//传值
		//testref();//传引用
		testref2();//传引用
	}
	
	private static void test1(boolean test){
		test=!test;
		System.out.println("in test1 	test="+test);
	}
	/**
	 * 传值
	 */
	public static void testvalue(){
		boolean test=true;
		System.out.println("in testvalue	test="+test);
		test1(test);
		System.out.println("after test1:	test="+test);
	}
	
	private static void test2(StringBuffer str){
		str.append(",world!");
	}
	/**
	 * 传引用
	 */
	public static void testref(){
		StringBuffer string=new StringBuffer("hello");
		test2(string);
		System.out.println(string);
	}
	private static void test3(String str){
		str="world!";
	}
	public static void testref2(){
		String string="hello";
		test3(string);
		System.out.println(string);
	}

}
