import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.examplbr.gamae.sistemacris.model.departamento;
import br.com.sistemacris.services.IDepartamentoService;


@RestController
@CrossOrigin("*")
public class DepartamentoController {
@Autowired

private IDepartamentoService servico;


@PostMapping("/departamento/novo")

public ResponseEntity<departamento> incluirNovo(@RequestBody Departament servico.adicionarNovoDepartamento(depto);
return ResponseEntity.ok(depto);
}

@GetMapping("/departamento/todos")
public ResponseEntity<List<departamento>> listarTodos(){
return ResponseEntity.ok(servico.recuperarTodos());

}
@GetMapping("/departamento/{id}")

public ResponseEntity<departamento> listarDetalhes(@PathVariable int id departamento depto = servico.recuperarDetalhes(id);

if (depto != null) {
return ResponseEntity.ok(depto);
}
return ResponseEntity.notFound().build();
}
}