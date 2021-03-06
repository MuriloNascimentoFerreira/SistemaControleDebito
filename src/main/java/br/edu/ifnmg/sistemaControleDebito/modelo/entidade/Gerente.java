/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemaControleDebito.modelo.entidade;

/**
 *
 * @author Murilo
 */
public class Gerente extends Funcionario {
    private String usuario;
    private String senha;
    
    public Gerente(String nome, String cpf, String endereco, String email, 
            String rg, double salarioFixo, double bonusSalarial, 
           String usuario, String senha){
        super(nome, cpf, endereco, email, rg, salarioFixo, bonusSalarial);
        this.usuario = usuario;
        this.senha =  senha; 
    }
    
    public void cadastrarFuncionario(Pessoa pessoa){
        
    }
    
    public void cadastrarFuncionarioVendedor(Pessoa pessoa){
    
    }

}
