package br.ufc.web.lab_08.Classes;

import java.sql.Date;

import jakarta.persistence.Embedded;
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
    private String telefone;
    
    private Date dataNasc;

    @Embedded
    private Endereco endereco;

    public Aluno(){
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

    public void setDataNasc(Date telefone){
        this.dataNasc = dataNasc;
    }

    public Date getDataNasc(){
        return this.dataNasc;
    }
}
