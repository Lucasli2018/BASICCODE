package com.pattern.adapter;

import org.junit.Test;

public class ClientTest {

	@Test
	public void test01() {
		//适配者
		Adaptee adaptee=new Adaptee();
		//目标
		Target target=new Adapter(adaptee);
		//客户端
		Client client=new Client();
		
		client.test1(target);
	}
	
	@Test
	public void test02() {
		//目标
		Target target=new Adapter2();
		//客户端
		Client client=new Client();
		
		client.test1(target);
	}

}
