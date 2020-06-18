package br.com.sistemacris.services;

	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Component;
	import br.com.sistemacris.DAO.produtoRepo;
	import com.examplbr.gamae.sistemacris.model.produto;
	@Component
	public class ProdutoServiceImpl implements IProdutoService {
		
		
	@Autowired // declaramos a interface do DAO que criamo
	private produtoRepo repo; // e a anotação AutoWired busca uma impleme
	@Override
	public List<produto> recuperarTodos() {
		
		// isso corresponde a um
		// select * from tblproduto
		// inner join tbldepartamento
		// on tblproduto.depto_id = departamento.id
		return (List<produto>)repo.findAll();
		}
	
		@Override
		public produto recuperarPorId(int id) {
		return repo.findById(id).get();
		}
		

}