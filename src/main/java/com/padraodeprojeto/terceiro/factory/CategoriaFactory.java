package com.padraodeprojeto.terceiro.factory;

public class CategoriaFactory {
	
	public static Produto getProduto(TipoProduto tipoProduto) {
		
		switch(tipoProduto) {
		case PRODUTO_A:
			return new CategoriaA();
		case PRODUTO_B:
			return new CategoriaB();
		default:
			break;
			
		}
		throw new IllegalArgumentException("Não existe produto desse tipo");
		
	}

}
