package br.ufc.web.lab_08.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

	// @PutMapping("/api/turma/{codigo}")
    // public void updateTurma(@PathVariable Integer codigo, @RequestBody Turma turma){
    //     turmaRepository.findById(codigo).get();
    // }

	// @DeleteMapping("/api/turma/{codigo}")
    // public void deleteTurma(@PathVariable int codigo){
    //     if (!turmaServices.deleteTurma(codigo)) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    // }

    // @GetMapping("/api/turma/{codigo}/alunos")
	// public List<Aluno> getAlunos(@PathVariable int codigo){
	// 	return turmaServices.getAlunos(codigo);
	// }

	// @DeleteMapping("/api/turma/{codigo}/alunos/{matricula}")
    // public void deleteAluno(@PathVariable int codigo,@PathVariable int matricula){
    //     if (!turmaServices.deleteAluno(codigo,matricula)) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    // }
}
