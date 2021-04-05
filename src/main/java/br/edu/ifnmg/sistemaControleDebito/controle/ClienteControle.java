/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemaControleDebito.controle;

import br.edu.ifnmg.sistemaControleDebito.dados.ClienteDAO;
import br.edu.ifnmg.sistemaControleDebito.modelo.Cliente;
import br.edu.ifnmg.sistemaControleDebito.view.Tela;
import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class ClienteControle {
    
    public static void cadastrarCliente(){
        
        try{
            Cliente cliente = new Cliente();
            
            System.out.println("-------------- Cadastro Cliente ---------------");
            Scanner ler = new Scanner(System.in);
            System.out.println("Nome: ");
            cliente.setNome(ler.nextLine());
            System.out.println("Cpf: ");
            cliente.setCpf(ler.nextLine());
            System.out.println("Endereço: ");
            cliente.setEndereco(ler.nextLine());
            System.out.println("Email: ");
            cliente.setEmail(ler.nextLine());
            System.out.println("Limite de credito: ");
            cliente.setLimiteCredito(Double.parseDouble(ler.nextLine()));
            cliente.setDebitos();
            ClienteDAO.adicionarCliente(cliente);
            System.out.println("\n***Cadastro realizado com sucesso! \n");
            
        }catch(NumberFormatException e){
            Tela.numeroInvalido();
        }
                
    }
    
    public void NumberFormatException(){
        ClienteControle.cadastrarCliente();
    }
    
}
