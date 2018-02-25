package com.dineshkrish.assertexample;

public class Main {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			System.out.println("hello" + i);

		}
		
		int j = 0;
		
		while(j < 10) {
			
			System.out.println("bye"+j);
			
			j++;
		}
		
		int k = 0;
		
		do {
			
			System.out.println("welcome");
			
			k++;
		} while(k > 10);

		
		String ch = "dinesh";
		
		switch(ch) {
			
		case "dinesh":
			System.out.println("1");
			break;
		case "krishnan":
			System.out.println("2");
			break;
		default:
			System.out.println("3");
			break;
		}
		
		
	}
}
