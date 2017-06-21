package br.com.casadocodigo.loja.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.casadocodigo.loja.modelo.Produto;

@Repository
@Transactional
public class ProdoutoDAO {
	@PersistenceContext
	private EntityManager manager;
	public void gravar(Produto produto){
		manager.persist(produto);
	}
}
