package br.com.loja.jdbc.controller;

import java.sql.Connection;
import java.util.List;

import br.com.loja.jdbc.dao.ProdutoDAO;
import br.com.loja.jdbc.factory.ConnectionFactory;
import br.com.loja.jdbc.modelo.Produto;

public class ProdutoController {
	
	private ProdutoDAO produtoDAO;
	
	public ProdutoController() {
		
		Connection connection = new ConnectionFactory().recuperarConexao();
		this.produtoDAO = new ProdutoDAO(connection);
	}

	public void deletar(Integer id) {
		this.produtoDAO.deletar(id);
	}

	public void salvar(Produto produto) {
		this.produtoDAO.salvar(produto);
	}

	public List<Produto> listar() {
		
		return this.produtoDAO.listar();
	}

	public void alterar(String nome, String descricao, Integer id) {
		this.produtoDAO.alterar(nome, descricao, id);
	}
}
