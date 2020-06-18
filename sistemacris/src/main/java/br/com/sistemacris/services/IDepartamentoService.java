package br.com.sistemacris.services;

	import java.util.List;
	import com.examplbr.gamae.sistemacris.model.departamento;
	
	public interface IDepartamentoService {
		
		
	public void adicionarNovoDepartamento(departamento depto);
	public departamento recuperarDetalhes(int id);
	public List<departamento> recuperarTodos();
	

}
