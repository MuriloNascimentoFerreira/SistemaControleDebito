/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemaControleDebito.controle;

import br.edu.ifnmg.sistemaControleDebito.view.Tela;

/**
 *
 * @author Murilo
 */
public class MenuInicialCaixaControle extends Exception{

    public static void controlarOpcaoEscolhidaCaixa(){
        int opcaoDesejada;
        try{
            do{
                opcaoDesejada = Tela.carregarTelaInicialCaixa() ;

                switch (opcaoDesejada){
                    case 1:DebitoControle.gerenciarOpcaoDebitoControle();
                        break;

                    case 2:ClienteControle.cadastrarCliente();
                        break;

                    case 3:PagamentoControle.realizarPagamento();
                          break;

                    case 0: return;

                    default: Tela.mensagemOpcaoInvalida();
                }
            }while(true);
        }catch(NumberFormatException e){
            Tela.numeroInvalido();
        }    
    }
     public void NumberFormatException(){
        MenuInicialCaixaControle.controlarOpcaoEscolhidaCaixa();
    }
}
