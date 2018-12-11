package com.nyx.dynamicproxy2.core;

public class TargetClass implements InterfaceClass{

	@Override
	public void eat() {
		System.out.println("TargetClass is excute eat method ...");
	}

}
