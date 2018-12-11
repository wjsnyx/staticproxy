package com.nyx.dynamicproxy2.core;

public class DynamicProxyTest {
	
	public static void main(String[] args) {
		MyInvocationHandler handler = new MyInvocationHandler();
		InterfaceClass target = (InterfaceClass) handler.getInstance(new TargetClass());
		target.eat();
	}

}
