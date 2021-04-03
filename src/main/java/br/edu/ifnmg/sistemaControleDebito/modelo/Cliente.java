/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemaControleDebito.modelo;

import java.util.ArrayList;

/**
 * refatorar 
 * @author Murilo
 */
public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String endereco;
    private String email;
    private double limiteCredito;
    private ArrayList<Debito> debitos;
    
    /*boolean getStatus(){
    
    }
    */

    public Cliente(double limiteCredito, String nome, String cpf, String endereco, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.limiteCredito = limiteCredito;
    }

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }
    
    public ArrayList<Debito> getDebitos() {
        return debitos;
    }

    public int getId() {
       return id;
    }

    public void setNome(String nome) {
        this.nome =  nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public void setDebitos() {
        this.debitos = new ArrayList<>();
    }

    public void setDebito(Debito debito) {
        this.debitos.add(debito);
    }
    
}
