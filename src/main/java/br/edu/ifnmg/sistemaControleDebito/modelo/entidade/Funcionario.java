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
public abstract class Funcionario extends Pessoa {
    private String rg;
    private double salarioFixo;
    private double bonusSalarial;
    
    public Funcionario(String nome, String cpf, String endereco, String email,
            String rg, double salarioFixo, double bonusSalarial){
        super(nome, cpf, endereco, email);
        this.rg = rg;
        this.salarioFixo = salarioFixo;
        this.bonusSalarial = bonusSalarial;
    }
      /*public double gerarSalarioTotal(){
    
    
    }*/

}
