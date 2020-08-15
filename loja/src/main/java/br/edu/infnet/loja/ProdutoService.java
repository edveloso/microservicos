package br.edu.infnet.loja;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProdutoService {
	
	@Autowired
	private RestTemplate client;
	
	public List<ProdutoDTO> lista(){
		
		
				ResponseEntity<List> exchange = 
						client.exchange(
						"http://localhost:8080/produtos",
						HttpMethod.GET, 
						null, 
						List.class);
		
		System.out.println(" Retorno "+ exchange );
		
		return (List<ProdutoDTO>) exchange;
	}
	

}
