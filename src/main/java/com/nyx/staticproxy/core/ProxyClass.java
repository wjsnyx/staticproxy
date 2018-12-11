package com.nyx.staticproxy.core;

public class ProxyClass implements InterfaceClass {
	
	private InterfaceClass targetCalss;
	
	public ProxyClass(InterfaceClass targetClass) {
		this.targetCalss = targetClass;
	}

	@Override
	public void eat() {
		System.out.println("before excute eat method ...");
		targetCalss.eat();
		System.out.println("after excute eat method ...");
	}

}
