/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemaControleDebito.controle;

import br.edu.ifnmg.sistemaControleDebito.dados.FuncionarioDAO;
import br.edu.ifnmg.sistemaControleDebito.modelo.Gerente;
import br.edu.ifnmg.sistemaControleDebito.view.Tela;
import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class GerenteControle{
    
    public static void cadastrarGerente() {
        String nome;
        String cpf;
        String endereco;
        String email;
        String rg;
        double salarioFixo;
        double bonusSalarial;
        String usuario;
        String senha;
        try{
            System.out.println("-----------------Cadastro de Gerente--------------\n");
            Scanner ler = new Scanner(System.in);
            System.out.println("Nome: ");
            nome = (ler.nextLine());
            System.out.println("Cpf: ");
            cpf = (ler.nextLine());
            System.out.println("Endereço: ");
            endereco = (ler.nextLine());
            System.out.println("Email: ");
            email = (ler.nextLine());
            System.out.println("RG: ");
            rg = (ler.nextLine());
            System.out.println("SalarioFixo: ");
            salarioFixo = (Double.parseDouble(ler.nextLine()));
            System.out.println("Bonus Salarial: ");
            bonusSalarial = Integer.parseInt(ler.nextLine());
            System.out.println("Usuario: ");
            usuario = (ler.nextLine());
            System.out.println("Senha: ");
            senha = (ler.nextLine());
            System.out.println("---------------------------------------------------\n");
            Gerente gerente = new Gerente(nome, cpf, endereco, email, rg, salarioFixo, bonusSalarial,
                usuario, senha);
            FuncionarioDAO.adicionarFuncionario(gerente);
            
        }catch(NumberFormatException e){
            Tela.numeroInvalido();
            NumberFormatException();
        }
    }
    
    public static void cadastrarFuncionario(){
      //  FuncionarioControle.cadastrarFuncionario();
    }
     public static void cadastrarCaixa(){
     //   CaixaControle.cadastrarCaixa();
    }
     
    public static void cadastrarCliente(){
        ClienteControle.cadastrarCliente();
                
    }
    
    public static void NumberFormatException(){
        
        if(FuncionarioDAO.verificaGerenteValido()) {
            MenuInicialControle.ControlarOpcaoEscolhida();
        }else{
            PrimeiroAcessoControle.primeiroAcessoControle();
        }
    }
    
}
