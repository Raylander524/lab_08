package br.ufc.web.lab_08.Classes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Disciplina {
    
    @Id
    @GeneratedValue
    private int codigo;
    private String nome;
    private int creditos;

    public Disciplina(String nome, int creditos){
        this.nome = nome;
        this.creditos = creditos;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getCreditos(){
        return creditos;
    }

    public void setCreditos(int creditos){
        this.creditos = creditos;
    }
}
