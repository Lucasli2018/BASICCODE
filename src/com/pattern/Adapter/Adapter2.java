package com.pattern.adapter;

/**
 * ���������൱��ת��ͷ��
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
