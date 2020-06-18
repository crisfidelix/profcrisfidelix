package br.com.sistemacris.services;

	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Component;
	import br.com.sistemacris.DAO.produtoRepo;
	import com.examplbr.gamae.sistemacris.model.departamento;
	
	@Component
	public class DepartamentoServiceImpl implements IDepartamentoService{
		
		
	@Autowired
	private produtoRepo repo;
	@Override
	public void adicionarNovoDepartamento(departamento depto) {
	repo.save(depto);
	}
	@Override
	public departamento recuperarDetalhes(int id) {
	return repo.findById(id).get();
	}
	
	@Override
	public List<departamento> recuperarTodos() {
	return (List<departamento>)repo.findAll();
	}

}
