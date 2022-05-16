package br.com.ifce.teste;

import br.com.ifce.model.Filme;
import br.com.ifce.repository.FilmeRepository;

public class ViewMain {
	
	public static void main(String[] args) {
		Filme filme = new Filme();
		filme.setTitulo("Doutor Estranho - No Multiverso da Loucura");
		filme.setDuracao(126);
		filme.setPreco(35.90);
		filme.setDataLancamento("04/05/2022");
		
		FilmeRepository filmeRepo = new FilmeRepository();
		
		filmeRepo.salvar(filme);
		
		filme.setTitulo("Thor 4");
		filmeRepo.atualizar(filme);
		
		Filme filme1 = filmeRepo.buscarPorId(1L);
		System.out.println(filme.getTitulo());
		
	}

}
