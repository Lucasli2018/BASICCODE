package com.basic.ref;

public class 引用和传值 {

	public static void main(String[] args) {
		//testvalue();//传值
		//testref();//传引用
		//testref2();//传引用
		testExample();//15 0 20
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
	
	/**
	 * 美国某著名软件公司面试题2009
	 */
	public static void testExample(){
		first();
	}

	private static void first() {
		int i=5;
		Value v=new Value();
		v.i=25;
		second(v,i);
		System.out.println(v.i);
	}

	private static void second(Value v, int i) {
		i=0;
		v.i=20;//通过副本引用改变了值
		Value val=new Value();
		v=val;//副本引用指向了新的值，但是原本的v.i=20不变
		System.out.println(v.i+" "+i);
	}

}

class Value{
	public int i=15;
}

