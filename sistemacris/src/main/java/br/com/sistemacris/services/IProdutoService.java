package br.com.sistemacris.services;

	import java.util.List;
	import com.examplbr.gamae.sistemacris.model.produto;
	
	public interface IProdutoService {
	public List<produto> recuperarTodos();
	public produto recuperarPorId(int id);
	
	
	public void novoProduto(produto produto); // novo metodo
	
	}
