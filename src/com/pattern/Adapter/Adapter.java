package com.pattern.Adapter;

/**
 * 适配器（相当于转接头）
 * @author Administrator
 *
 */
public class Adapter implements Target {

	private Adaptee adaptee;
	@Override
	public void handleReq() {
		System.out.println("Adapter runing...");
		adaptee.handle();
	}
	public Adapter(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}
	

}
