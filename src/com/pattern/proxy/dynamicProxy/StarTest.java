package com.pattern.proxy.dynamicProxy;

import static org.junit.Assert.*;

import java.lang.reflect.Proxy;

import org.junit.Test;

public class StarTest {

	@Test
	public void test() {
		Star realStar=new RealStar();
		StarHandler starHandler = new StarHandler(realStar);
		Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, starHandler);
		
		proxy.confer();
		proxy.signContact();
		proxy.bookTicket();
		proxy.sing();
		proxy.colletMoney();
	}

}
