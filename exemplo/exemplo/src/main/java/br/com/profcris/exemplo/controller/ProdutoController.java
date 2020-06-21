package br.com.profcris.exemplo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.profcris.exemplo.dao.ProdutoDAO;
import br.com.profcris.exemplo.model.Produto;

@RestController
@CrossOrigin("*")

public class ProdutoController {
	
	
	@Autowired
	
	ProdutoDAO dao;
	
	@GetMapping("/produtos")
	
	public ArrayList<Produto> listarTodos(){
	return (ArrayList<Produto>)dao.findAll();
	
	
	}

}
