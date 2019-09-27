package com.pattern.proxy.staticProxy;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClientTest {

	@Test
	public void test() {
		Star real=new RealStar();
		Star proxy=new ProxyStar(real);
		
		proxy.confer();
		proxy.signContact();
		proxy.bookTicket();
		proxy.sing();
		proxy.colletMoney();
	}

}
