package com.dineshkrish;

public class SamsungGalaxy extends Samsung {

	@Override
	public void makeCall() {

		System.out.println("samsung making call");
	}

	@Override
	public void receiveCall() {

		System.out.println("samsung reciving call");
	}

	@Override
	public final void checkIME() {

		System.out.println("get IME by typing #04");
	}

}
