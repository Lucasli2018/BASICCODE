package com.pattern.adapter;

/**
 * 适配器（相当于转接头）
 * @author Administrator
 *
 */
public class Adapter2 extends Adaptee implements Target {

	@Override
	public void handleReq() {
		System.out.println("Adapter2 runing...");
		super.handle();
	}

}
