package com.dineshkrish.thincle.jt.students;

public class Example {
	
	int a;
	
	static int b;
	
	static {
		
		System.out.println("3");
		
		b = 10;
	}
	
	{
		System.out.println("2");
	}

	public Example() {
		
		System.out.println("1");
	}
}
