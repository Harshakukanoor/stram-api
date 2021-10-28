package org.lnt.practice;

@FunctionalInterface
public interface Demo {

	public void add();
	default void sum() {
		System.out.println("this is sum method from demo interface");
	}
	default void clean() {
		System.out.println("this is clean method");
	}
	
	
}

 class Run implements Demo
 {
	public static void main(String[] args) {
		Run run= new Run();
		run.add();
		run.sum();
		run.clean();
	
	}
	@Override
	public void sum() {
		System.out.println("this is sum method from run class");
		Demo.super.sum();
	}

	@Override
	public void add() {
	System.out.println("this is add method");
		
	}
}
