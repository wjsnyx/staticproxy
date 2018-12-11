package com.nyx.dynamicproxy2.core;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.nyx.dynamicproxy2.core.InterfaceClass;

public class MyInvocationHandler implements InvocationHandler {
	
	private InterfaceClass targetCalss;

	public Object getInstance(InterfaceClass targetCalss) {
		this.targetCalss = targetCalss;
		return Proxy.newProxyInstance(InterfaceClass.class.getClassLoader(), 
				new Class[] {InterfaceClass.class}, this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before excute eat method ...");
		Object obj = method.invoke(targetCalss, args);
		System.out.println("after excute eat method ...");
		return obj;
	}

}
