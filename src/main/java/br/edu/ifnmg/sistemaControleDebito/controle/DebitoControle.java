/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemaControleDebito.controle;

import br.edu.ifnmg.sistemaControleDebito.dados.DebitoDAO;
import br.edu.ifnmg.sistemaControleDebito.modelo.Debito;
import br.edu.ifnmg.sistemaControleDebito.modelo.DebitoCliente;
import br.edu.ifnmg.sistemaControleDebito.modelo.DebitoFuncionario;
import br.edu.ifnmg.sistemaControleDebito.view.Tela;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class DebitoControle extends Exception{
    private  static int opcaoDesejada;
     
    public static void gerenciarOpcaoDebitoControle(){
        try{
            do{
                Tela tela = new Tela();
                opcaoDesejada = tela.carregarTelaTiposDebitosCaixa();

                switch (opcaoDesejada){
                    case 1:debitosClienteControle();
                        break;

                    case 2:debitosFuncionarioControle();

                    case 0: return; 

                    default: Tela.mensagemOpcaoInvalida();
                }
            }while(true);
        }catch(NumberFormatException e){
            Tela.numeroInvalido();
        }
                
                
    }

    private static void debitosClienteControle() {
        DebitoCliente debitoCliente = new DebitoCliente();
        cadastrarDebito(debitoCliente);
    }

    private static void debitosFuncionarioControle() {//implementar esse 
        DebitoFuncionario debitoFuncionario = new DebitoFuncionario();
        cadastrarDebito(debitoFuncionario);
    }

    private static void cadastrarDebito(DebitoCliente debitoCliente) {
        
        System.out.println("---------------- Cadastro Débito -------------------");
        Scanner ler = new Scanner(System.in);
        System.out.println("Descrição: ");
        debitoCliente.setDescricao(ler.nextLine());
        System.out.println("Quantidade de parcelas: ");
        debitoCliente.setQuantidadeParcela( Integer.parseInt(ler.nextLine()) );
        System.out.println("Valor de cada parcela: ");
        debitoCliente.setValorParcela(Double.parseDouble(ler.nextLine()));
        System.out.println("Intervalo em dias de cada parcela: ");
        debitoCliente.setIntervaloParcela(Integer.parseInt(ler.nextLine()) );
        debitoCliente.setDataDebito(LocalDateTime.now());
        debitoCliente.setId(DebitoDAO.getContadorId());
        System.out.println("---------------------------------------------------\n");
        DebitoDAO.adicionarDebito(debitoCliente);
        System.out.println("***Cadastro concluido com suscesso!\n");
   
    }
    
     private static void cadastrarDebito(DebitoFuncionario debitoFuncionario) {
        
        System.out.println("---------------- Cadastro Débito -------------------");
        Scanner ler = new Scanner(System.in);
        System.out.println("Descrição: ");
        debitoFuncionario.setDescricao(ler.nextLine());
        System.out.println("Quantidade de parcelas: ");
        debitoFuncionario.setQuantidadeParcela( Integer.parseInt(ler.nextLine()) );
        System.out.println("Valor de cada parcela: ");
        debitoFuncionario.setValorParcela(Double.parseDouble(ler.nextLine()));
        System.out.println("Intervalo em dias de cada parcela: ");
        debitoFuncionario.setIntervaloParcela(Integer.parseInt(ler.nextLine()) );
         System.out.println("Quantos porcento de desconto? ");
        debitoFuncionario.setPorcentagemDesconto(Integer.parseInt(ler.nextLine()) );
        debitoFuncionario.setDataDebito(LocalDateTime.now());
        debitoFuncionario.setId(DebitoDAO.getContadorId());
        System.out.println("---------------------------------------------------\n");
        DebitoDAO.adicionarDebito(debitoFuncionario);
        System.out.println("***Cadastro concluido com suscesso!\n");
   
    }
    
    public void NumberFormatException(){
        DebitoControle.gerenciarOpcaoDebitoControle();
    }
}
