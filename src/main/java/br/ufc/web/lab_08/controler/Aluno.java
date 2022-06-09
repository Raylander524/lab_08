package br.ufc.web.lab_08.controler;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Aluno {
    @Id
    @GeneratedValue
    private int matricula;
    private String nome;
    private String email;

    public Aluno(int matricula, String nome, String email){
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public int getMatricula(){
        return this.matricula;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }
}
