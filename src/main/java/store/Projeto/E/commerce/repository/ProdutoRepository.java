package store.Projeto.E.commerce.repository;

import org.springframework.data.repository.CrudRepository;

import store.Projeto.E.commerce.entity.Produto;

public interface ProdutoRepository extends CrudRepository<Produto,Integer>{
    
}
