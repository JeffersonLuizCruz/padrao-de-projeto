package com.padraodeprojeto.terceiro.factory;

public class Application {

	public static void main(String[] args) {
		
		Produto produto = CategoriaFactory.getProduto(TipoProduto.PRODUTO_B);
		
		System.out.println("Impressão do Produto: " + produto.getName());

	}

}
