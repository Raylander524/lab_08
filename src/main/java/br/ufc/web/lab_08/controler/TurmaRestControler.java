package br.ufc.web.lab_08.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufc.web.lab_08.Classes.Aluno;
import br.ufc.web.lab_08.Classes.Turma;
import br.ufc.web.lab_08.Repository.TurmaRepository;

@RestController
@RequestMapping("/")
public class TurmaRestControler{

	@Autowired
	TurmaRepository turmaRepository;

	@GetMapping("api/turma")
	public Iterable<Turma> getTurmas(){
		return turmaRepository.findAll();
	}

	@GetMapping("api/turma/{codigo}")
	public Turma getTurmasCodigo(@PathVariable Integer codigo){
		return turmaRepository.findById(codigo).get();
	}

	@PostMapping("api/turma")
	public void addTurma(@RequestBody Turma turma) {
		turmaRepository.save(turma);
	}

	@PutMapping("api/turma/{codigo}")
	public ResponseEntity atualizaTurmas(@PathVariable Integer codigo, @RequestBody List<Aluno> aluno){
		 return turmaRepository.findById(codigo)
		 .map(turma -> {
               turma.setAlunos(aluno);
               Turma turmas = turmaRepository.save(turma);
               return ResponseEntity.ok().body(turmas);
           }).orElse(ResponseEntity.notFound().build());
	}

	@DeleteMapping("api/turma/{codigo}")
	public void deleteTurma(@PathVariable Integer codigo){
		turmaRepository.deleteById(codigo);
	}
}
