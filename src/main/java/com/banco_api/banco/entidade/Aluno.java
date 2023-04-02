package com.banco_api.banco.entidade;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Aluno{
    @Id
    private String cpf;
    private String data_nascimento;
    private String nome;

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setdata_nascimento(String data_nascimento){
        this.data_nascimento = data_nascimento;
    }

    public String getdata_nascimento(){
        return data_nascimento;
    }

}