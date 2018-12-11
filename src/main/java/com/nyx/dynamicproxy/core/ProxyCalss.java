package com.nyx.dynamicproxy.core;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyCalss {
	
	private InterfaceClass targetCalss;
	
	public ProxyCalss(InterfaceClass targetCalss) {
		this.targetCalss = targetCalss;
	}
	
	public Object getTargetInstance() {
		return Proxy.newProxyInstance(ProxyCalss.class.getClassLoader(), 
				TargetCalss.class.getInterfaces(), new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("before excute eat method ...");
						Object obj = method.invoke(targetCalss, args);
						System.out.println("after excute eat method ...");
						return obj;
					}
				});
	};
	

}
