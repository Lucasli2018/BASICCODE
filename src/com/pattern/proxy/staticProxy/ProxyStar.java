package com.pattern.proxy.staticProxy;

public class ProxyStar implements Star {

	Star star;
	
	@Override
	public void confer() {
		System.out.println("ProxyStar.confer");
	}

	@Override
	public void signContact() {
		System.out.println("ProxyStar.signContact");
	}

	@Override
	public void bookTicket() {
		System.out.println("ProxyStar.bookTicket");
	}

	@Override
	public void sing() {
		//System.out.println("ProxyStar.sing");
		star.sing();
	}

	@Override
	public void colletMoney() {
		System.out.println("ProxyStar.colletMoney");
	}

	public ProxyStar(Star star) {
		super();
		this.star = star;
	}
	

}
