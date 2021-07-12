package com.padraodeprojeto.primeiro;

public class MoedaApplication {

	public static void main(String[] args) throws Exception {
		Moeda moeda = MoedaFactory.getSimbolo(Pais.BRASIL);
		System.out.println("Moeda Brasileira " + moeda.getSimbolo());

	}

}
