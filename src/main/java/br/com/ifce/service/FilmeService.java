package br.com.ifce.service;

import br.com.ifce.model.Filme;
import br.com.ifce.repository.FilmeRepository;

public class FilmeService {
	private FilmeRepository filmeRepository = new FilmeRepository();
	
	public void salvarFilme(Filme filme) {
		filmeRepository.salvar(filme);
	}
	
	public void atualizarFilme(Filme filme) {
		filmeRepository.atualizar(filme);
	}
	
	public Filme buscarPorId(Long codigo) {
		Filme filme = filmeRepository.buscarPorId(codigo);
		return filme;
	}
	
	public void excluirFilme(Long codigo) {
		filmeRepository.excluirFilme(codigo);
	}

}
