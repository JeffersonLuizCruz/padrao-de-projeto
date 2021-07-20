package com.padraodeprojeto.primeiro.factory;

public class Application {

	public static void main(String[] args) throws Exception {
		Moeda moeda = MoedaFactory.getSimbolo(Pais.BRASIL);
		System.out.println("Moeda Brasileira " + moeda.getSimbolo());

	}

}
