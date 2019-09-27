package com.pattern.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {

	Star realStar;
	
	
	public StarHandler(Star realStar) {
		super();
		this.realStar = realStar;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object object=null;
		System.out.println(method.getName()+"...");
		if("sing".equals(method.getName())){
			object=method.invoke(realStar, args);
		}
		return object;
	}


}
