/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemaControleDebito.controle;

import br.edu.ifnmg.sistemaControleDebito.dados.ClienteDAO;
import br.edu.ifnmg.sistemaControleDebito.dados.DebitoDAO;
import br.edu.ifnmg.sistemaControleDebito.dados.FuncionarioDAO;
import br.edu.ifnmg.sistemaControleDebito.modelo.Cliente;
import br.edu.ifnmg.sistemaControleDebito.modelo.Debito;
import br.edu.ifnmg.sistemaControleDebito.modelo.DebitoCliente;
import br.edu.ifnmg.sistemaControleDebito.modelo.DebitoFuncionario;
import br.edu.ifnmg.sistemaControleDebito.modelo.DebitoLoja;
import br.edu.ifnmg.sistemaControleDebito.modelo.Funcionario;
import br.edu.ifnmg.sistemaControleDebito.view.Tela;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class DebitoControle{
    private  static int opcaoDesejada;
     
    public static void gerenciarOpcaoDebitoControle(){
        try{
            do{
                opcaoDesejada = Tela.carregarTelaTiposDebitosCaixa();

                switch (opcaoDesejada){
                    case 1:debitosClienteControle();
                        break;

                    case 2:debitosFuncionarioControle();
                            break;
                            
                    case 0: return; 

                    default: Tela.mensagemOpcaoInvalida();
                }
            }while(true);
        }catch(NumberFormatException e){
            Tela.numeroInvalido();
        }        
    }

    private static void debitosClienteControle() {//buscar o cliente e atribuir o debito a ele.
        String nome;
        Cliente cliente = new Cliente();
        Scanner ler = new Scanner(System.in);
        System.out.println("Nome do Cliente:");
        nome = (ler.nextLine());
        cliente = ClienteDAO.buscarCliente(nome);
        
        if(cliente != null){
            DebitoCliente debitoCliente = new DebitoCliente();
            cadastrarDebito(debitoCliente,cliente);
        }
    }

    private static void debitosFuncionarioControle() { 
        String nome;
        Funcionario funcionario;
        Scanner ler = new Scanner(System.in);
        System.out.println("Nome do funcionario:");
        nome = (ler.nextLine());
        funcionario = FuncionarioDAO.buscarFuncionario(nome);
        
        if(funcionario.equals(null)){
            DebitoFuncionario debitofuncionario = new DebitoFuncionario();
            cadastrarDebito(debitofuncionario,funcionario.getId());
        }
    }

    private static void cadastrarDebito(DebitoCliente debitoCliente, Cliente cliente) {
        
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
        System.out.println("---------------------------------------------------\n");
        
         System.out.println("\n*Deseja confirmar o registro? S(sim) N(Não)");
        char resposta = ler.nextLine().charAt(0);
        if (resposta == 's' || resposta == 'S' ){
            cliente.setDebito(debitoCliente);
            DebitoDAO.adicionarDebito(debitoCliente);
            ClienteDAO.atualizarDados(cliente);
            System.out.println("***Cadastro concluido com suscesso!\n");
        }else if(resposta == 'n' || resposta == 'N'){
            System.out.println("\n*Operação cancelada\n");
        }
    }
    
     private static void cadastrarDebito(DebitoFuncionario debitoFuncionario, int idResponsavel) {
        
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
        debitoFuncionario.setId(idResponsavel);
        System.out.println("---------------------------------------------------\n");
        DebitoDAO.adicionarDebito(debitoFuncionario);
        System.out.println("***Cadastro concluido com suscesso!\n");
   
    }
     
     public static Debito buscarDebito(ArrayList<Debito> debitos, String descricaoDebito){// ver se necessária
        Debito debito = null;                                  
        for(Debito debitoEmPesquisa : debitos){     
            if (debitoEmPesquisa instanceof DebitoCliente){
                DebitoCliente debitoCliente = (DebitoCliente) debitoEmPesquisa;
                if(debitoCliente.getDescricao().equals(descricaoDebito) ){
                    debito = debitoCliente;
                    break;
                }
            }else if(debitoEmPesquisa instanceof DebitoFuncionario){
                //
            }else if(debitoEmPesquisa instanceof DebitoLoja){
            }
        }
        return debito;
    } 
    
    public void NumberFormatException(){
        DebitoControle.gerenciarOpcaoDebitoControle();
    }
}
