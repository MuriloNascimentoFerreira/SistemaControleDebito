/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemaControleDebito.view;

import java.util.Scanner;


/**
 *
 * @author Murilo
 */
public class Tela {

    private int opcao;
    
    public int carregarTelaTiposDebitosCaixa() {
        
        System.out.printf("-------------------- Débitos ----------------------\n");
        System.out.printf("*Para quem deseja atribuir esse débito?\n");
        System.out.printf("1- Clientes\n");
        System.out.printf("2- Funcionarios\n");
        System.out.printf("0- Sair\n");
        Scanner ler = new Scanner(System.in);
        opcao = Integer.parseInt(ler.nextLine());
        return opcao;
    }
    
    
    public int carregarTelaInicial(){
    
        System.out.printf("------------------ Menu Inicial ----------------------\n");
        System.out.printf("1- Gerente\n");
        System.out.printf("2- Caixa\n");
        System.out.printf("0- Sair\n");
        Scanner ler = new Scanner(System.in);
        opcao = Integer.parseInt(ler.nextLine());
  
        return opcao;
    }
    
    public int carregarTelaInicialGerente(){
        System.out.printf("---------------Menu Inicial Gerente-------------------\n");
        System.out.printf("1- Registrar Débitos\n");
        System.out.printf("2- Cadastrar pessoas\n");
        System.out.printf("3- Relatórios\n");
        System.out.printf("0- Retornar menu anterior\n");
        System.out.printf("------------------------------------------------------\n");
        System.out.printf("Digite a opção desejada: \n");
        Scanner ler = new Scanner(System.in);
        opcao = Integer.parseInt(ler.nextLine());
        
        return opcao;
    }
    
    //fazer outros metodos 
    //carregar telas debitos
    //carregar telas gestão ...
    public static void mensagemOpcaoInvalida(){
        System.out.printf("Opção inválida!\n");
    }
    public static void mensagemLoginInvalido(){
        System.out.println("\n****Usuário ou senha inválidos!*****\n");
    
    }
    
    public static void numeroInvalido(){
        System.out.println("\n*** Você digitou letras no lugar de números\n***Inicie a operação novamente.\n");
    }
    public int carregarTelaInicialCaixa() {
        System.out.printf("---------------Menu Inicial Caixa-------------------\n");
        System.out.printf("1- Registrar Débitos\n");
        System.out.printf("2- Registrar Clientes\n");
        System.out.printf("3- Realizar pagamento de dividas\n");
        System.out.printf("0- Retornar menu anterior\n");
        System.out.printf("-----------------------------------------------------\n");
        System.out.printf("Digite a opção desejada: \n");
        Scanner ler = new Scanner(System.in);
        opcao = Integer.parseInt(ler.nextLine());
        
        return opcao;
       
    }

    public void primeiroAcessoTela(){
        System.out.printf("---------Bem vindo ao seu primeiro acesso-----------\n");
        System.out.printf("\n--> Faça login com seu Usuário e senha padrão\n");
    }

    public int carregarTelaTiposPagamentos() {
        System.out.printf("------------------- Pagamentos -------------------\n");
        System.out.printf("*Quem é o responsável pelo pagamento? \n");
        System.out.printf("1- É um Cliente \n");
        System.out.printf("2- É um funcionario que está pagando sua dívida\n");
        System.out.printf("3- É o gerente que está pagando algum débito da loja\n");
        System.out.printf("0- Retornar menu anterior\n");
        System.out.printf("----------------------------------------------------\n");
        System.out.printf("Digite a opção desejada: \n");
        Scanner ler = new Scanner(System.in);
        opcao = Integer.parseInt(ler.nextLine());
        
        return opcao;
    }

}
