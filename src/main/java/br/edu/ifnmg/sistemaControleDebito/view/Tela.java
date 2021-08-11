/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemaControleDebito.view;

import br.edu.ifnmg.sistemaControleDebito.modelo.Debito;
import br.edu.ifnmg.sistemaControleDebito.modelo.Pagamento;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Murilo
 */
public class Tela {
    
    public static int carregarTelaTiposDebitosCaixa() {
        int opcao;
        System.out.printf("-------------------- Débitos ----------------------\n");
        System.out.printf("*Para quem deseja atribuir esse débito?\n");
        System.out.printf("1- Clientes\n");
        System.out.printf("2- Funcionarios\n");
        System.out.printf("0- Sair\n");
        Scanner ler = new Scanner(System.in);
        opcao = Integer.parseInt(ler.nextLine());
        return opcao;
    }
    
    
    public static int carregarTelaInicial(){
        int opcao;
        System.out.printf("------------------ Menu Inicial ----------------------\n");
        System.out.printf("1- Gerente\n");
        System.out.printf("2- Caixa\n");
        System.out.printf("0- Sair\n");
        Scanner ler = new Scanner(System.in);
        opcao = Integer.parseInt(ler.nextLine());
  
        return opcao;
    }
    
    public static int carregarTelaInicialGerente(){
        int opcao;
        System.out.printf("---------------Menu Inicial Gerente-------------------\n");
        System.out.printf("1- Registrar Débitos\n");
        System.out.printf("2- Cadastrar pessoas\n");
        System.out.printf("3- Pagamentos\n");
        System.out.printf("4- Relatórios\n");
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
    public static int carregarTelaInicialCaixa() {
        int opcao;
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

    public static void imprimirDebito(Debito debito) {
              
        System.out.printf("\nDescrição:%s\tParcelas:%d\tValor de cada parcela: %.2f"
                +"\tValor Total:%.2f",debito.getDescricao(), debito.getQuantidadeParcela(),
                debito.getValorParcela(), (debito.getQuantidadeParcela() * debito.getValorParcela()) );
            
    }

    public static void imprimirPagamentosEfetuados(ArrayList<Pagamento> pagamentosEfetuados) {
        for(Pagamento pagamentoEmPesquisa: pagamentosEfetuados){
            System.out.printf("\tParcela paga-\tNumero(s):%s\tData do pagamento: %s",
                    pagamentoEmPesquisa.getNumeroDeParcelas(), pagamentoEmPesquisa.getData());
    }   }

    public static void imprimirDetalhamentoDebito(Debito debito, ArrayList<Pagamento> pagamentos) {
        double totalDebito = (debito.getQuantidadeParcela() * debito.getValorParcela());
        double totalPago = 0;
        double totalDevendo = 0 ;
        int parcelasFaltaPagar = 0;
        int totalParcelasPagas = 0;
        for(Pagamento pagamentoEmPesquisa : pagamentos){
            totalPago += pagamentoEmPesquisa.getNumeroDeParcelas() * debito.getValorParcela();
            totalParcelasPagas += pagamentoEmPesquisa.getNumeroDeParcelas(); 
        }
        
        parcelasFaltaPagar = debito.getQuantidadeParcela() - totalParcelasPagas;
        totalDevendo = totalDebito - totalPago;
        System.out.printf("\nDetalhes sobre o Débito --> %s <--\n",debito.getDescricao());
        System.out.printf("Total parcelas:%d\tParcelas pagas:%d\tParcelas falta Pagar:%d\n",
                debito.getQuantidadeParcela(), totalParcelasPagas, parcelasFaltaPagar);
        System.out.printf("Valor total débito:%.2f\tValor total pago:%.2f\tValor total devendo:%.2f",
                totalDebito, totalPago,totalDevendo );
        
    }

    public static int carregarTelaCadastroPessoas() {
        int opcao;
        System.out.printf("---------------Menu Inicial Cadastro Pessoas-------------------\n");
        System.out.printf("1- Cadastrar cliente\n");
        System.out.printf("2- Cadastrar Vendedor\n");
        System.out.printf("3- Cadastrar Caixa\n");
        System.out.printf("4- Cadastrar Gerente\n");
        System.out.printf("5- Relatorios\n");
        System.out.printf("0- Retornar menu anterior\n");
        System.out.printf("------------------------------------------------------\n");
        System.out.printf("Digite a opção desejada: \n");
        Scanner ler = new Scanner(System.in);
        opcao = Integer.parseInt(ler.nextLine());
        
        return opcao;
    }

    public static void naoEncontrado() {
       System.out.printf("\n!!Não encontrado ou não cadastrado!!\n");
    }

    public void primeiroAcessoTela(){
        System.out.printf("\n---------Bem vindo ao seu primeiro acesso-----------\n");
        System.out.printf("\n--> Faça login com seu Usuário e senha padrão\n");
    }

    public static int carregarTelaTiposPagamentos() {
        int opcao;
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
     public static int carregarTelaTiposPagamentos_dois() {
        int opcao;
        System.out.printf("------------------- Pagamentos -------------------\n");
        System.out.printf("*Por qual modo deseja buscar? \n");
        System.out.printf("1- Procurar os debitos por nome da pessoa. \n");
        System.out.printf("2- Procurar por descrição do debito\n");
        System.out.printf("0- Retornar menu anterior\n");
        System.out.printf("----------------------------------------------------\n");
        System.out.printf("Digite a opção desejada: \n");
        Scanner ler = new Scanner(System.in);
        opcao = Integer.parseInt(ler.nextLine());
        
        return opcao;
    }

}
