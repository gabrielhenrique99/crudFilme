package br.com.ifce.teste;

import br.com.ifce.model.Filme;

public class ViewTeste {
		
	public void mostrar(Filme filme) {
		System.out.println("Titulo: "+ filme.getTitulo());
		System.out.println("Dura��o: " + filme.getDuracao());
		System.out.println("Pre�o: " + filme.getPreco());
		System.out.println("Data de Lan�amento: " + filme.getDataLancamento());
	}
}
