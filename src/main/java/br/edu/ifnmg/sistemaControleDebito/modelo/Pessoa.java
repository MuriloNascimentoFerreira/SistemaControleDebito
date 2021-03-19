/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemaControleDebito.modelo;

/**
 *
 * @author Murilo
 */
public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;
    private String email;

    public Pessoa(String nome, String cpf, String endereco, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }
    
    
}
