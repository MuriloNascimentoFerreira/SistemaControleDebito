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
public abstract class UsuarioSistema extends Funcionario{
    private String usuario;
    private String senha;
    
    public UsuarioSistema(String nome, String cpf, String endereco, String email,
            String rg, double salarioFixo, double bonusSalarial,
             String usuario, String senha) {
        
        super(nome, cpf, endereco, email, rg, salarioFixo, bonusSalarial);
        
        this.usuario = usuario;
        this.senha =  senha; 
    }
    
      public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public boolean validarSenha(String senhaTentada) {
        boolean resposta;
        if(this.senha.equals(senhaTentada)){
            resposta = true;
        }else{
            resposta = false;
        }
        
        return resposta;
    }
  
}