package br.com.ifce.teste;

import br.com.ifce.model.Filme;

public class ViewTeste {
		
	public void mostrar(Filme filme) {
		System.out.println("Titulo: "+ filme.getTitulo());
		System.out.println("Duração: " + filme.getDuracao());
		System.out.println("Preço: " + filme.getPreco());
		System.out.println("Data de Lançamento: " + filme.getDataLancamento());
	}
}
