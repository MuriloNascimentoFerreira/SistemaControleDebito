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
public class MenuInicialCaixaControle {

    private int opcaoDesejada;
    
    public void ControlarOpcaoEscolhidaCaixa(){
       
        do{
            Tela tela = new Tela();
            this.opcaoDesejada = tela.carregarTelaInicialCaixa() ;
            
            switch (opcaoDesejada){
                case 1: System.out.println("Opção um do caixa"); //chamar controlador para essa função 
                    break;

                case 2://pessoas 

                case 3: //relatorios
                
                case 0: return; //sair
                
                default: tela.mensagemOpcaoInvalida();
            }
        }while(true);
    }
    
}
