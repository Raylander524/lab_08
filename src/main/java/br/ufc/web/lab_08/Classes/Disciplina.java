package br.ufc.web.lab_08.Classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Disciplina {
    
    @Id
    @GeneratedValue
    private int codigo;
    private String nome;
    private int creditos;

    public Disciplina(){

    }

    public Disciplina(int codigo, String nome, int creditos){
        this.codigo = codigo;
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
