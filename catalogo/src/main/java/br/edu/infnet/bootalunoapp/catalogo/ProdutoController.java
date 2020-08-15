package br.edu.infnet.bootalunoapp.catalogo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping()
	public ResponseEntity<List<Produto>> listar(){
		
		List<Produto> listar = produtoService.listar();
		
		return ResponseEntity.ok(listar);
	}
	
	@PostMapping()
	public ResponseEntity<Produto> salvar(@RequestBody  Produto produto){
		
		Produto prodDB = produtoService.salvar(produto);
		return new ResponseEntity<Produto>(prodDB, HttpStatus.CREATED);
		
//		return prodDB;
	}
	
	
	
}
