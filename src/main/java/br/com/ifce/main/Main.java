package br.com.ifce.main;

import br.com.ifce.controller.FilmeController;
import br.com.ifce.model.Filme;

public class Main {
	
	public static void main(String[] args) {
		
		FilmeController filmeController = new FilmeController();
		
		Filme filme = new Filme();
		filme.setTitulo("Doutor Estranho - No Multiverso da Loucura");
		filme.setDuracao(126);
		filme.setPreco(35.90);
		filme.setDataLancamento("04/05/2022");
		filmeController.salvarFilme(filme);
		
		Filme filme2 = new Filme();
		filme.setTitulo("Homem Aranha - Sem volta para casa");
		filme.setDuracao(146);
		filme.setPreco(35.90);
		filme.setDataLancamento("21/12/2021");
		filmeController.salvarFilme(filme2);
		
		filmeController.excluirFilme((long) 2);
		
		filmeController.buscarPorId((long) 1);
		
		
		//filme.setTitulo("Thor 4");
		//filmeController.atualizarFilme(filme);
		

	}
}
	
