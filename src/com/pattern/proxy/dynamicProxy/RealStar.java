package com.pattern.proxy.dynamicProxy;

public class RealStar implements Star{

	@Override
	public void confer() {
		System.out.println("RealStar.confer");
	}

	@Override
	public void signContact() {
		System.out.println("RealStar.signContact");		
	}

	@Override
	public void bookTicket() {
		System.out.println("RealStar.bookTicket");		
	}

	@Override
	public void sing() {
		System.out.println("ÖÜ½ÜÂ×³ª¸è");		
	}

	@Override
	public void colletMoney() {
		System.out.println("RealStar.colletMoney");		
	}

}
