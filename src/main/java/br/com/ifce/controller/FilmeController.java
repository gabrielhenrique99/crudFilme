package br.com.ifce.controller;

import br.com.ifce.model.Filme;
import br.com.ifce.service.FilmeService;
import br.com.ifce.teste.ViewTeste;

public class FilmeController {
	
	private FilmeService filmeService = new FilmeService();
	
	public void salvarFilme(Filme filme) {
		filmeService.salvarFilme(filme);
	}
	
	public void atualizarFilme(Filme filme) {
		filmeService.atualizarFilme(filme);
	}
	
	public void buscarPorId(Long codigo) {
		Filme filme = filmeService.buscarPorId(codigo);
		ViewTeste viewMain = new ViewTeste();
		viewMain.mostrar(filme);
		
	}
	
	public void excluirFilme(Long codigo) {
		filmeService.excluirFilme(codigo);
	}
	
	

}
