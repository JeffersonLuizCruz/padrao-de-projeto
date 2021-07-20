package com.padraodeprojeto.primeiro.factory;

public class MoedaFactory {
	
	public static Moeda getSimbolo(Pais simbolo) throws Exception {
		if(simbolo.equals(Pais.BRASIL)) {
			return new Real();
			
		}else if(simbolo.equals(Pais.ESTADOS_UNIDOS)){
			return new Dolar();
		}
		throw new Exception("Não existe esse Pais");
		
	}

}
