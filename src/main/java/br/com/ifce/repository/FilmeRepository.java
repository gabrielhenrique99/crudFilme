package br.com.ifce.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.ifce.config.HibernateConfig;
import br.com.ifce.model.Filme;

public class FilmeRepository {
	
	public void salvar(Filme filme) {
		Transaction transacao = null;
		Session session = HibernateConfig.getSessionFactory().openSession();
		
		transacao = session.beginTransaction();
		
		session.save(filme);
		
		transacao.commit();
		
		
	}
	
	public void atualizar(Filme filme) {
		
		Transaction transacao = null;
		Session session = HibernateConfig.getSessionFactory().openSession();
		
		transacao = session.beginTransaction();
		
		session.saveOrUpdate(filme);
		
		transacao.commit();
		
	}
	
	public Filme buscarPorId(Long codigo) {
		
		Transaction transacao = null;
		Session session = HibernateConfig.getSessionFactory().openSession();
		
		transacao = session.beginTransaction();
		
		Filme filme = session.get(Filme.class, codigo);
		
		transacao.commit();
		
		return filme;
	}
	
	public void excluirFilme(Long codigo) {
		
		Transaction transaction = null;
		Session session = HibernateConfig.getSessionFactory().openSession();
		
		transaction = session.beginTransaction();
		
		Filme filme = null;
		filme = session.get(Filme.class, codigo);
		session.delete(filme);
		
		transaction.commit();
		
		}

}
