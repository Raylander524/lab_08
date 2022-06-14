package br.ufc.web.lab_08.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufc.web.lab_08.Classes.Aluno;
import br.ufc.web.lab_08.Repository.AlunoRepository;

@RestController
@RequestMapping("/")
public class AlunoRestControler {
    
    @Autowired
    AlunoRepository alunoRepository;

    @PostMapping("api/turma/alunos")
	public void addAluno(@RequestBody Aluno aluno) {
		alunoRepository.save(aluno);
	}

    @GetMapping("api/turma/alunos")
    public Iterable<Aluno> addAluno(){
        return alunoRepository.findAll();
    }
}
