package com.nyx.dynamicproxy.core;

public class DynamicProxyTest {
	
	public static void main(String[] args) {
		TargetCalss targetCalss = new TargetCalss();
		ProxyCalss pc = new ProxyCalss(targetCalss);
		InterfaceClass target = (InterfaceClass) pc.getTargetInstance();
		target.eat();
	}

}
