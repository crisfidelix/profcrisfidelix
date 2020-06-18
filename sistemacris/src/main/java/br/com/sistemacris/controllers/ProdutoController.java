package br.com.sistemacris.controllers;

	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.CrossOrigin;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RestController;
	import com.examplbr.gamae.sistemacris.model.produto;
	import br.com.sistemacris.services.IProdutoService;
	
	@RestController
	@CrossOrigin("*")
	
	
	public class ProdutoController {
		
	@Autowired
	private IProdutoService servico; // declaramos sempre a interface
	
	@GetMapping("/produto")
	public ResponseEntity<List<produto>> mostrarTodos(){
		
	return ResponseEntity.ok(servico.recuperarTodos());
	}
	
	@GetMapping("/produto/{id}")
	public ResponseEntity<produto> mostrarPeloId(@PathVariable int id){
	produto p = servico.recuperarPorId(id);
	
	if (p != null) {
	return ResponseEntity.ok(p);
	}
	return ResponseEntity.notFound().build();
	}

}
