package com.padraodeprojeto.segundo.factory;

public class Application {

	public static void main(String[] args) throws Exception {
		IPhone device = IPhoneFactory.getModel("a");
	}

}
