package com.pattern.Adapter;

/**
 * ���������൱��ת��ͷ��
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
