package com.dineshkrish;

public class MobileStrore {

	public Mobile order(String modelName) {
		
		if(modelName.equals("sgs4")) {
			
			return new SamsungGalaxyS4();
		} else if(modelName.equals("sg")) {
			
			return new SamsungGalaxy();
		} else {
			
			return new OPPO();
		}
	}

}
