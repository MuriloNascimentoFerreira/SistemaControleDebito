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
public class Caixa extends UsuarioSistema {
    private String usuario;
    private String senha;

    public Caixa(String nome, String cpf, String endereco, String email,
            String rg, double salarioFixo, double bonusSalarial, String usuario, String senha) {
        super(usuario, senha, nome, cpf, endereco, email, rg, salarioFixo, bonusSalarial);
        this.usuario = usuario;
        this.senha = senha;
    }

    public Caixa() {
        this.usuario = "";
        this.senha = "";
       
    }

    
    
}
