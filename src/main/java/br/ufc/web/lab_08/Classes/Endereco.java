package br.ufc.web.lab_08.Classes;

import org.springframework.lang.Nullable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;


@Embeddable
public class Endereco {
    
    @Column(length = 2)
    private char[] estado;
    private String cidade;
    private String logradouro;
    private String numero;
    @Nullable
    private int cep;

    public Endereco(char[] estado, String cidade, String logradouro, String numero, int cep){
        this.estado = estado;
        this.cidade = cidade;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
    }

    public char[] getEstado(){
        return estado;
    }

    public void setEstado(char[] estado){
        this.estado = estado;
    }

    public String getCidade(){
        return cidade;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public String getLogradouro(){
        return logradouro;
    }

    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }

    public String getNumero(){
        return numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public Integer getCep(){
        return cep;
    }

    public void setNumero(Integer cep){
        this.cep = cep;
    }
}
