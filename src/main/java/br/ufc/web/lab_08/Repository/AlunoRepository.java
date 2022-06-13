package br.ufc.web.lab_08.Repository;

import org.springframework.data.repository.CrudRepository;

import br.ufc.web.lab_08.Classes.Aluno;

public interface AlunoRepository extends CrudRepository<Aluno, Integer>{
    
}
