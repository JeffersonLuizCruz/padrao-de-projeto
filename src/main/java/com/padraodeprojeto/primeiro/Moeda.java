package com.padraodeprojeto.primeiro;

public interface Moeda {
	String getSimbolo();

}

class Real implements Moeda{

	@Override
	public String getSimbolo() {
		
		return "R$";
	}
	
}

class Dolar implements Moeda{

	@Override
	public String getSimbolo() {
		
		return "US";
	}
	
}
