package com.dineshkrish.thincle.jt.students;

public class Outter {

	public static void test() {
		
		System.out.println("outter test");
	}
	
	public static class Inner {
		
		public static void test() {
			
			System.out.println("innner test");
		}
		
		public static class InnerMost {
			
			
			public static void test() {
				
				System.out.println("Inner most test");
			}
		}
		
	}
	
}
