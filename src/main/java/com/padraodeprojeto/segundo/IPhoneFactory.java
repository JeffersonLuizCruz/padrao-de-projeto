package com.padraodeprojeto.segundo;

public class IPhoneFactory {
	
	public static IPhone getModel(String model) throws Exception {
		IPhone device = null;
		
		if(model.equalsIgnoreCase("A")) {
			System.out.println("Modelo IPhone A");
			device = new IPhoneA();
		}else if(model.equalsIgnoreCase("B")) {
			System.out.println("ModeloIPhone B");
			device = new IPhoneB();
		}
		
		device.getHardware();
		
		return device;
	}

}
