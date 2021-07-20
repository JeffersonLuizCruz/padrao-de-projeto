package com.padraodeprojeto.primeiro.singleton;

public enum ProdutoSingleton {
	
	INSTENCE;
	
	public Produto novoProduto(int tipoProduto) {
		
		switch(tipoProduto) {
		case 1:
			return new ProdutoA();
		case 2:
			return new ProdutoB();
			default:
				throw new IllegalArgumentException("Produto não existe");
		}
	}

}
