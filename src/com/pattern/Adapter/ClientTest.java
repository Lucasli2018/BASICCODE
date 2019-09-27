package com.pattern.Adapter;

import org.junit.Test;

public class ClientTest {

	@Test
	public void test01() {
		//������
		Adaptee adaptee=new Adaptee();
		//������
		Target target=new Adapter(adaptee);
		//�ͻ���
		Client client=new Client(target);
		
		client.test1();
	}
	
	@Test
	public void test02() {
		//������
		Target target=new Adapter2();
		//�ͻ���
		Client client=new Client(target);
		
		client.test1();
	}

}
