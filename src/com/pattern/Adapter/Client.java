package com.pattern.Adapter;

public class Client {
	Target target;
	public void test1(){
		target.handleReq();
	}
	public Client(Target target) {
		super();
		this.target = target;
	}
	
}
