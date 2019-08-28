package com.basic.java8.optional;

import java.util.Optional;

/**
 * Optional 是个容器：它可以保存类型T的值，或者仅仅保存null。 Optional 提供很多有用的方法，这样我们就不用显式进行空值检测。
 * Optional 类的引入很好的解决空指针异常。
 * 
 * 注意： 这些方法是从 java.lang.Object 类继承来的。
 * 
 * @author 50632
 *
 */
public class Optional尝鲜 {

	public static void main(String args[]) {

		Optional尝鲜 java8Tester = new Optional尝鲜();
		Integer value1 = null;
		Integer value2 = new Integer(10);

		// Optional.ofNullable - 允许传递为 null 参数
		Optional<Integer> a = Optional.ofNullable(value1);

		// Optional.of - 如果传递的参数是 null，抛出异常 NullPointerException
		Optional<Integer> b = Optional.of(value2);
		System.out.println(java8Tester.sum(a, b));
	}

	public Integer sum(Optional<Integer> a, Optional<Integer> b) {

		// Optional.isPresent - 判断值是否存在

		System.out.println("第一个参数值存在: " + a.isPresent());
		System.out.println("第二个参数值存在: " + b.isPresent());

		// Optional.orElse - 如果值存在，返回它，否则返回默认值
		Integer value1 = a.orElse(new Integer(0));

		/**
		 * Optional.get - 获取值，值需要存在
		 * 	否则：java.util.NoSuchElementException: No value present
		 */
		//Integer value2 = a.get();//
		Integer value2 = b.get();
		return value1 + value2;
	}

}
