package com.basic.java8.lambda;

import java.util.Comparator;

/**
 * lambda 表达式只能引用标记了 final 的外层局部变量，也就是"常量" 如果变量不是final但是在后面没有被修改，也可以编译通过
 * 但是如果变量在后面的被修改了，编译失败
 * 
 * @author 50632
 *
 */
public class 变量作用域 {

	final static String salutation = "Hello! ";
	static String salutation1 = "Hello! ";

	public static void main(String args[]) {
		GreetingService greetService = message -> System.out.println(salutation + message);
		greetService.sayMessage("Runoob");// Hello! Runoob

		GreetingService greetService1 = message -> System.out.println(salutation1 + message);
		greetService1.sayMessage("Runoob");// Hello! Runoob

		String salutation2 = "Hello! ";
		GreetingService greetService2 = message -> System.out.println(salutation2 + message);
		greetService2.sayMessage("Runoob");// Hello! Runoob

		/**
		 * lambda中使用的局部变量应该是【final】含义的
		 */
		String salutation3 = "Hello! ";
		GreetingService greetService3 = message -> System.out.println(salutation3 + message);
		greetService3.sayMessage("Runoob");// Hello! Runoob
		/**
		 * java.lang.Error: Unresolved compilation problem: 
		 * 	Local variable salutation3 defined in an enclosing scope must be final or effectively final
		 */
		//salutation3 = "Hi!";

		
		/**
		 * 在 Lambda 表达式当中声明的参数不能与局部变量同名。
		 * 
		 */
		String first = "";
		/**
		 * java.lang.Error: Unresolved compilation problem:
		 * 	Lambda expression's parameter first cannot redeclare another local variable defined in an enclosing scope.
		 */
		
		//Comparator<String> comparator = (first, second) -> Integer.compare(first.length(), second.length()); // 编译会出错
	}

	interface GreetingService {
		void sayMessage(String message);
	}

}
