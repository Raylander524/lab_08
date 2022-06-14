package br.ufc.web.lab_08.Classes;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Aluno {
    
    @Id
    @GeneratedValue
    private int matricula;

    private String nome;
    private String email;
    private String telefone;
    private String dataNasc;

    @Embedded
    private Endereco endereco;

    public Aluno(String nome, String email, String telefone, String dataNasc, Endereco endereco){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
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

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public void setDataNasc(String dataNasc){
        this.dataNasc = dataNasc;
    }

    public String getDataNasc(){
        return this.dataNasc;
    }
}
