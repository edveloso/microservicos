package br.edu.infnet.bootalunoapp.catalogo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> listar(){
		return produtoRepository.findAll();
	}
	
	@Transactional
	public Produto salvar(Produto produto) {
		return produtoRepository.save(produto);
	}
	
	
}
