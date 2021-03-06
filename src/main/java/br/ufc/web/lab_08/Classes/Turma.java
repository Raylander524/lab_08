package br.ufc.web.lab_08.Classes;

import java.sql.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

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

    public Turma(Disciplina disciplina, List<Aluno> alunos, List<Date> horarios){
        this.disciplina = disciplina;
        this.alunos = alunos;
        this.horarios = horarios;
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

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public List<Date> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Date> horarios) {
        this.horarios = horarios;
    }

}
