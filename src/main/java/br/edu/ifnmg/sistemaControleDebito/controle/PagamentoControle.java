/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemaControleDebito.controle;

import br.edu.ifnmg.sistemaControleDebito.dados.ClienteDAO;
import br.edu.ifnmg.sistemaControleDebito.modelo.Debito;
import br.edu.ifnmg.sistemaControleDebito.view.Tela;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Murilo
 */
class PagamentoControle {
    private static int opcaoDesejada;
    public static void realizarPagamento(){       

        
         try{
            do{
                opcaoDesejada = Tela.carregarTelaTiposPagamentos_dois();
                switch (opcaoDesejada){
                    case 1:buscarDebitosCliente();
                        break;
                
                }
            }while(true);
        }catch(NumberFormatException e){
            Tela.numeroInvalido();
        } 
    
    }
    
  /*  public static void realizarPagamento(){
        //fazer um swith para quem desenha pagar? 

        //2 funcionario
        
        
        //3 Gerente? no caso é a despesas da loja
        
        
         try{
            do{
                Tela tela = new Tela();
                opcaoDesejada = tela.carregarTelaTiposPagamentos();
                

                switch (opcaoDesejada){
                    case 1:realizarPagamentoCliente();
                        break;

                    case 2:realizarPagamentoFuncionario();
                        break;
                            
                    case 3:realizarPagamentoloja();
                        break;
                            
                    case 0: return; 

                    default: Tela.mensagemOpcaoInvalida();
                }
            }while(true);
        }catch(NumberFormatException e){
            Tela.numeroInvalido();
        } 
    }*/

    private static void realizarPagamentoCliente() {
        
    }

    private static void realizarPagamentoFuncionario() {
        
    }

    private static void realizarPagamentoloja() {
        
    }

    private static void buscarDebitosCliente() {
        
        System.out.println("Nome: ");
        Scanner ler = new Scanner(System.in);
        String nome = ler.nextLine();
        ArrayList<Debito> debitos = ClienteDAO.buscarTodosDebitosCliente(nome);
        Tela.imprimirListaDebitos(debitos);
        
    }
    public void NumberFormatException(){
        PagamentoControle.realizarPagamento();
    }
}
