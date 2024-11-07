/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.aespi.jdbc.model;

/**
 *
 * @author hitaloyo
 */
public class Herois {
    private Long id;
    private String nome;
    private String identidadeSecreta;
    private String habilidade;

  
    public Long getId() {
        return id;
    }

  
    public void setId(Long id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getIdentidadeSecreta() {
        return identidadeSecreta;
    }

  
    public void setIdentidadeSecreta(String identidadeSecreta) {
        this.identidadeSecreta = identidadeSecreta;
    }

    public String getHabilidade() {
        return habilidade;
    }

 
    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }
    
    
}
