package com.dineshkrish.assertexample;

public class AgeValidator {

	public boolean validate(int age) {
		
		boolean flag = false;
		
		if(age >= 18) {
			
			flag = true;
		}
		
		assert(flag):"Invalid age";
		
		return flag;
	}
}
