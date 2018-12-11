package com.nyx.staticproxy.core;

public class StaticProxyTest {
	
	public static void main(String[] args) {
		TargetClass target = new TargetClass();
		InterfaceClass proxy = new ProxyClass(target);
		proxy.eat();
	}

}
