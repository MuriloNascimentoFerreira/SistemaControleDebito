/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemaControleDebito.dados;

import br.edu.ifnmg.sistemaControleDebito.modelo.Cliente;
import br.edu.ifnmg.sistemaControleDebito.modelo.Debito;
import java.util.ArrayList;

/**
 *
 * @author Murilo
 */
public class ClienteDAO {
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static int idContador = 0;
    
    public static Cliente buscarCliente(String nome) {
        Cliente cliente = null;
        for (Cliente clienteEmPesquisa : clientes) {
            if(clienteEmPesquisa.getNome().equalsIgnoreCase(nome)){
                cliente = clienteEmPesquisa;
                break;
            }
        }
        return cliente;
    }
    
    public static void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
        interarContador();
    }
    
    public static ArrayList<Debito> buscarTodosDebitosCliente(String nomeCliente){
        ArrayList<Debito> debitosDoCliente = null;
        for(Cliente clienteEmPesquisa : clientes){
            if(clienteEmPesquisa.getNome().equals(nomeCliente)){
             debitosDoCliente = clienteEmPesquisa.getDebitos();
             break;
            } 
           
        }
        
        return debitosDoCliente;
    }

    private static void interarContador() {
       idContador++;
    }
    
}
