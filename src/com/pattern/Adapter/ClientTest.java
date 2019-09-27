package com.pattern.adapter;

import org.junit.Test;

public class ClientTest {

	@Test
	public void test01() {
		//������
		Adaptee adaptee=new Adaptee();
		//Ŀ��
		Target target=new Adapter(adaptee);
		//�ͻ���
		Client client=new Client();
		
		client.test1(target);
	}
	
	@Test
	public void test02() {
		//Ŀ��
		Target target=new Adapter2();
		//�ͻ���
		Client client=new Client();
		
		client.test1(target);
	}

}
