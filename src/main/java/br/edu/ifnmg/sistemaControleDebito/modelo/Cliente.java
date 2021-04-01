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
    
    //criar um metodo que adiciona os debitos de uma pessoa na lista de debitos dela
    
}
