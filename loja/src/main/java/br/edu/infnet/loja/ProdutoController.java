package br.edu.infnet.loja;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loja")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping()
	public List<ProdutoDTO> listar() {
		return produtoService.lista();
	}
	
}
