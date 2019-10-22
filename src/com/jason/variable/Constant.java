package com.jason.variable;

import org.junit.Test;

/**常量
 * @author Administrator
 *
 */
public class Constant {
	@Test
	public void demo(){
		//java使用final关键字指示常量，名字全大写（这不仅是一个建议，更是一个标准），表示这个常量只能被赋值一次
		final double CM_PER_INCH=2.54;
		final int SIZE_OF_PAPER=5;
		System.out.println("这张纸的大小为："+SIZE_OF_PAPER+" 英寸，就是："+SIZE_OF_PAPER*CM_PER_INCH+" cm");
	}
	
	//使用static final设置类常量，在类中的所有方法中可以使用，如果是public，那么其他类的方法也可以使用
	//常用做常量
	public static final String SUCCESS="成功";
	public static final String FAILED="失败";
	
	@Test
	public void demo2(){
		System.out.println(SUCCESS);
	}
	
}
