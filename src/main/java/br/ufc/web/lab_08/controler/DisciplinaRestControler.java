package br.ufc.web.lab_08.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufc.web.lab_08.Classes.Disciplina;
import br.ufc.web.lab_08.Repository.DisciplinaRepository;

@RestController
@RequestMapping("/")
public class DisciplinaRestControler {
    
    @Autowired
	DisciplinaRepository disciplinaRepository;

    @PostMapping("api/disciplina")
	public void addDisciplina(@RequestBody Disciplina disciplina) {
		if(disciplina.getNome() == null){
			disciplina.setNome("");
		}
		disciplinaRepository.save(disciplina);
	}

	@GetMapping("api/disciplina")
	public Iterable<Disciplina> getTurmas(){
		return disciplinaRepository.findAll();
	}
}
