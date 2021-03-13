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
        opcao = ler.nextInt();
        
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
        opcao = ler.nextInt();
        
        return opcao;
    }
    
    //fazer outros metodos 
    //carregar telas debitos
    //carregar telas gestão ...
    public void mensagemOpcaoInvalida(){
        System.out.printf("Opção inválida!\n");
    }


}
