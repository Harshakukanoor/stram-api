package org.lnt.practice;

public interface Foo {
	
	public default String helloWorld() {
		return "hello world";
		
	}
	public static String customMsg(String msg) {
		return msg;
		
	}
	
	public void bar();
	

}
