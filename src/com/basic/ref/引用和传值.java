package com.basic.ref;

public class 引用和传值 {

	public static void main(String[] args) {
		//testvalue();//传值
		testref();//传引用
		//testref2();//传引用
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
	 * 由于StringBuffer操作的是同一块内存区
	 * 所以str指向的内存区被修改了
	 */
	public static void testref(){
		StringBuffer string=new StringBuffer("hello");
		test2(string);
		System.out.println(string);//hello,world!
	}
	
	
	private static void test3(String str){
		str="world!";
	}
	/**
	 * 因为java方法参数传对象，为对象的引用的一个副本，可以通过这个引用去修改对象，但是如果这个引用修改了不会应用对象本身
	 * 所以test3中，引用的副本原来指向hello，后来指向world！，但是原本的引用是一直没有被改变的
	 */
	public static void testref2(){
		String string="hello";
		test3(string);
		System.out.println(string);//hello
	}

}
