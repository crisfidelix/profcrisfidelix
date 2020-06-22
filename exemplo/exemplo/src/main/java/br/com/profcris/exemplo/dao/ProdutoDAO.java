package br.com.profcris.exemplo.dao;



import org.springframework.data.repository.CrudRepository;

import br.com.profcris.exemplo.model.Produto;

public interface ProdutoDAO extends CrudRepository<Produto,Integer>{


	

}
