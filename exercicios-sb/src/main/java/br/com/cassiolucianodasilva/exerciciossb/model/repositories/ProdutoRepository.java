package br.com.cassiolucianodasilva.exerciciossb.model.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import br.com.cassiolucianodasilva.exerciciossb.model.entities.Produto;

//Declaração da interface ProdutoRepository

//public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
//
//}

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {
	
	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
	
	//findByNomeContaining
	//findByNomeIsContaining
	//findByNomeContains
	
	
	//findByNomeStartsWith
	//findByNomeEndsWith
	
	//findByNomeNotContaining
	
	
	@Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%")
	public Iterable<Produto> searchByNameLike(@Param("nome") String nome);
}