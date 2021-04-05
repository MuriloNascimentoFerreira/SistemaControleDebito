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
public class MenuInicialGerenteControle{
    
    public static void controlarOpcaoEscolhidaGerente(){
        int opcaoDesejada;
        try{
            do{
                opcaoDesejada = Tela.carregarTelaInicialGerente();

                switch (opcaoDesejada){
                    case 1:DebitoControle.gerenciarOpcaoDebitoControle();
                        break;

                    case 2:gerenciarCadastroPessoas();
                        
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
    public static void gerenciarCadastroPessoas(){
        int opcaoDesejada;
         try{
            do{
                opcaoDesejada = Tela.carregarTelaCadastroPessoas();

                switch (opcaoDesejada){
                    case 1:GerenteControle.cadastrarCliente();//cadastrar cliente
                        break;
                        
                    case 2:GerenteControle.cadastrarFuncionario();//cadastrar funcionario
                          break;
                          
                    case 3:GerenteControle.cadastrarCaixa();//cadastrar caixa
                         break;
                         
                    case 4:GerenteControle.cadastrarGerente();//cadastrar gerente
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
        controlarOpcaoEscolhidaGerente();
    }
}
