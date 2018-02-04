package com.dineshkrish.thincle.jt.customer;

import com.dineshkrish.thincle.jt.students.Outter;

public class ExampleTest {

	
	public static void main(String[] args) {
		
		
		/*Outter out = new Outter();
		
		out.test();*/
		
		Outter.test();
		
		/*Outter.Inner in = out.new Inner();
		
		in.test();*/
		
		Outter.Inner.test();
		
		/*Outter.Inner.InnerMost inMost = in.new InnerMost();
		
		inMost.test();*/
		
		
		Outter.Inner.InnerMost.test();
		
	}
}
