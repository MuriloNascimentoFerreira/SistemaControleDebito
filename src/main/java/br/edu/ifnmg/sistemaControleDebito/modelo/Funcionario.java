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
public class Funcionario {
    private int id;
    private String nome;
    private String cpf;
    private String endereco;
    private String email;
    private String rg;
    private double salarioFixo;
    private double bonusSalarial;
    

    public Funcionario(String nome, String cpf, String endereco, String email, String rg, double salarioFixo, double bonusSalarial) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.rg = rg;
        this.salarioFixo = salarioFixo;
        this.bonusSalarial = bonusSalarial;
    }
    

       /*public double gerarSalarioTotal(){
    
    
    }*/

    public String getNome() {
        return nome;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public double getBonusSalarial() {
        return bonusSalarial;
    }

    public int getId() {
        return id;
    }
}
