package com.pattern.Adapter;

import org.junit.Test;

public class ClientTest {

	@Test
	public void test01() {
		//ÊÊÅäÕß
		Adaptee adaptee=new Adaptee();
		//ÊÊÅäÆ÷
		Target target=new Adapter(adaptee);
		//¿Í»§¶Ë
		Client client=new Client(target);
		
		client.test1();
	}
	
	@Test
	public void test02() {
		//ÊÊÅäÆ÷
		Target target=new Adapter2();
		//¿Í»§¶Ë
		Client client=new Client(target);
		
		client.test1();
	}

}
