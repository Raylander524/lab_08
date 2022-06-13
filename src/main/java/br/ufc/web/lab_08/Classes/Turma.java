package br.ufc.web.lab_08.Classes;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Turma {
    @Id
    @GeneratedValue 
    private int codigo;
    @ManyToOne
    private Disciplina disciplina;
    @ManyToMany
    private List<Aluno> alunos;
    @ElementCollection
    private List<Date> horarios;

    public Turma(){
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public void setAlunos(List<Aluno> alunos){
        this.alunos = alunos;
    }

    public List<Aluno> getAlunos(){
        return this.alunos;
    }

}
