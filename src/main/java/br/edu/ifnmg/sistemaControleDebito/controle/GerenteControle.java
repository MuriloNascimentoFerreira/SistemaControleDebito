/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemaControleDebito.controle;

import br.edu.ifnmg.sistemaControleDebito.dados.FuncionarioDAO;
import br.edu.ifnmg.sistemaControleDebito.modelo.Funcionario;
import br.edu.ifnmg.sistemaControleDebito.modelo.Gerente;
import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class GerenteControle {
    private String nome;
    private String cpf;
    private String endereco;
    private String email;
    private String rg;
    private double salarioFixo;
    private double bonusSalarial;
    private String usuario;
    private String senha;
    
    public void CadastrarFuncionario(){
        
        System.out.println("-----------------Cadastro de Gerente--------------\n");
        Scanner ler = new Scanner(System.in);
        System.out.println("Nome: ");
        this.nome = (ler.nextLine());
        System.out.println("Cpf: ");
        this.cpf = (ler.nextLine());
        System.out.println("Endereço: ");
        this.endereco = (ler.nextLine());
        System.out.println("Email: ");
        this.email = (ler.nextLine());
        System.out.println("RG: ");
        this.rg = (ler.nextLine());
        System.out.println("SalarioFixo: ");
        this.salarioFixo = (Double.parseDouble(ler.nextLine()));
        System.out.println("Bonus Salarial: ");
        this.bonusSalarial = Integer.parseInt(ler.nextLine());
        System.out.println("Usuario: ");
        this.usuario = (ler.nextLine());
        System.out.println("Senha: ");
        this.senha = (ler.nextLine());
        System.out.println("---------------------------------------------------\n");
        
        Gerente gerente = new Gerente(this.nome, this.cpf, this.endereco, this.email, this.rg, this.salarioFixo,this.bonusSalarial,
        this.usuario, this.senha);
        FuncionarioDAO.adicionarFuncionario(gerente);
    
    }
    
    public void CadastrarFuncionario(Funcionario funcionario){
    
    }
    
}
