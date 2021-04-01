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
public class Gerente extends UsuarioSistema {

    public Gerente(String nome, String cpf, String endereco, String email, String rg, double salarioFixo, double bonusSalarial, 
            String usuario, String senha) {
        super(nome, cpf, endereco, email, rg, salarioFixo, bonusSalarial, usuario, senha);
    }

    
    
    public void cadastrarFuncionario(Gerente gerente){
        
    }
    
    public void cadastrarFuncionario(Funcionario funcionario){//vendedor//caixa usar reescrita de metodo.
    
    }


}
