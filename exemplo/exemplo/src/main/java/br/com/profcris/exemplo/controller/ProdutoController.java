package br.com.profcris.exemplo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.profcris.exemplo.dao.ProdutoDAO;
import br.com.profcris.exemplo.model.Produto;

@RestController // o controller é declarado com esta anotação
@CrossOrigin("*") //permite acesso através do @CrossOrigin("*") e injeta
                  //uma dependência do serviço através do @Autowired .



public class ProdutoController {
	
	
	@Autowired
	
	ProdutoDAO dao;
	
	@GetMapping("/produtos")
	
	public ArrayList<Produto> listarTodos(){
	return (ArrayList<Produto>)dao.findAll();
	
	
	}

}
