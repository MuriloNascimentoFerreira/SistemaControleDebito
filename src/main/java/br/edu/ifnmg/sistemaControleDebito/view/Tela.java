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
    
    public int carregarTelaInicial(){
    
        System.out.printf("------------------ Menu Inicial ----------------------\n");
        System.out.printf("1- Gerente\n");
        System.out.printf("2- Caixa\n");
        System.out.printf("0- Sair\n");
        Scanner ler = new Scanner(System.in);
        opcao = Integer.parseInt(ler.nextLine());//mudar para forma de helder
  
        return opcao;
    }
    
    public int carregarTelaInicialGerente(){
        System.out.printf("---------------Menu Inicial Gerente-------------------\n");
        System.out.printf("1- Débitos\n");
        System.out.printf("2- Gestão pessoas\n");
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
    public void mensagemOpcaoInvalida(){
        System.out.printf("Opção inválida!\n");
    }

    public int carregarTelaInicialCaixa() {
        System.out.printf("---------------Menu Inicial Caixa-------------------\n");
        System.out.printf("1- Realizar vendas\n");
        System.out.printf("2- Gerenciar Clientes\n");
        System.out.printf("3- Realizar pagamento de dividas\n");
        System.out.printf("0- Retornar menu anterior\n");
        System.out.printf("-----------------------------------------------------\n");
        System.out.printf("Digite a opção desejada: \n");
        Scanner ler = new Scanner(System.in);
        opcao = Integer.parseInt(ler.nextLine());
        
        return opcao;
       
    }

    public void primeiroAcessoTela(){
        System.out.printf("---------Bem vindo ao seu primeiro acesso------------\n");
        System.out.printf("\n--> Faça login com seu Usuário e senha padrão\n");
    }

}
