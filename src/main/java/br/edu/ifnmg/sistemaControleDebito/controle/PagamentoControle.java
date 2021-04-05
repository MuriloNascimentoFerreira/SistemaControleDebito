/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemaControleDebito.controle;

import br.edu.ifnmg.sistemaControleDebito.dados.ClienteDAO;
import br.edu.ifnmg.sistemaControleDebito.dados.DebitoDAO;
import br.edu.ifnmg.sistemaControleDebito.dados.PagamentoDAO;
import br.edu.ifnmg.sistemaControleDebito.modelo.Debito;
import br.edu.ifnmg.sistemaControleDebito.modelo.DebitoCliente;
import br.edu.ifnmg.sistemaControleDebito.modelo.DebitoFuncionario;
import br.edu.ifnmg.sistemaControleDebito.modelo.DebitoLoja;
import br.edu.ifnmg.sistemaControleDebito.modelo.Pagamento;
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
                    case 1:registrarPagamentoPorNome();
                        break;
                       
                    case 2:registrarPagamento();
                        break;
                        
                    case 0:return;
                }
            }while(true);
        }catch(NumberFormatException e){
            Tela.numeroInvalido();
        } 
    }
    
    private static void registrarPagamentoPorNome() {
        
        System.out.println("Nome: ");
        Scanner ler = new Scanner(System.in);
        String nome = ler.nextLine();
        ArrayList<Debito> debitos = ClienteDAO.buscarTodosDebitosCliente(nome);
        
        if(!debitos.isEmpty()){
            System.out.println("\nSeus débitos:");
            for(Debito debito : debitos){
                    Tela.imprimirDebito(debito);
                    PagamentoControle.apresentarPagamentosEfetuados(debito);
            }
            registrarPagamento();
        }else{
            System.out.println("\n***Não possui debitos!\n");
            return;
        }
    }

    public static void apresentarPagamentosEfetuados(Debito debito){
        ArrayList<Pagamento> listaDePagamentosEfetuados = new ArrayList<>();
        listaDePagamentosEfetuados = PagamentoDAO.buscarPagamentos(debito.getId());
        if(!listaDePagamentosEfetuados.isEmpty()){
            Tela.imprimirPagamentosEfetuados(listaDePagamentosEfetuados);
        }
    }
    
    private static void registrarPagamento() {
        
        System.out.println("\n*Qual descrição do débito que deseja pagar?");
        Scanner ler = new Scanner(System.in);
        String descricaoDebito = ler.nextLine();
        
        Debito debito = DebitoDAO.buscarDebito(descricaoDebito);
        ArrayList<Pagamento> pagamentos = new ArrayList<>();
        pagamentos = PagamentoDAO.buscarPagamentos(debito.getId());
        Tela.imprimirDetalhamentoDebito(debito,pagamentos);
        
        Pagamento pagamento = new Pagamento();
        int totalParcelasPagas = 0;
        for(Pagamento pagamentoEmPesquisa : pagamentos){
            totalParcelasPagas += pagamentoEmPesquisa.getNumeroDeParcelas(); 
        }
        
        do{
            System.out.println("\n*Quantas parcelas deseja pagar?");
            int numeroParcelasSelecionadas = Integer.parseInt(ler.nextLine());
            if( numeroParcelasSelecionadas > (debito.getQuantidadeParcela() - totalParcelasPagas)){
                System.out.println("Número de parcelas invalido!");
                continue;
            }
            double totalAPagar = numeroParcelasSelecionadas * debito.getValorParcela();
            System.out.printf("\nTotal a pagar: %.2f",totalAPagar);
            
            System.out.println("\n*Deseja confirmar o pagamento? S(sim) N(Não)");
            char resposta = ler.nextLine().charAt(0);
            if (resposta == 's' || resposta == 'S' ){
    
                pagamento.setNumeroDeParcelas(numeroParcelasSelecionadas);
                pagamento.setDebito(debito);
                PagamentoDAO.adicionarPagamento(pagamento);

                System.out.println("\n***Pagamento realizado com sucesso!\n");
                break;

            }else if(resposta == 'n' || resposta == 'N'){
                System.out.println("\n*Operação cancelada\n");
                break;
            }
        }while(true);
    }
    
    public void NumberFormatException(){
        PagamentoControle.realizarPagamento();
    }
}
