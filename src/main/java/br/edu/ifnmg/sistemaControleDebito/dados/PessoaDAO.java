/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemaControleDebito.dados;

import br.edu.ifnmg.sistemaControleDebito.modelo.Pessoa;
import br.edu.ifnmg.sistemaControleDebito.modelo.Gerente;
import java.util.ArrayList;

/**
 *
 * @author Murilo
 */
public class PessoaDAO {
    
    private static ArrayList<Pessoa> pessoas =  new ArrayList<>();
    
    public static void adicionarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }
    
    public static Pessoa buscarPessoa(String usuario) {
        Pessoa pessoa = null;
        for(Pessoa pessoaEmPesquisa : pessoas){
            if (pessoaEmPesquisa instanceof Gerente){
                Gerente gerenteEmPesquisa = (Gerente) pessoaEmPesquisa;
                if(gerenteEmPesquisa.getUsuario().equals(usuario) ){
                    pessoa = pessoaEmPesquisa;
                    break;
                }
            }
        }
        return pessoa;
    }
    
    /*public static Pessoa buscarPessoa(Gerente gerenteTentandoLogar) {
        Gerente gerente = null; 
        for(Pessoa pessoaEmPesquisa : pessoas){
            Gerente gerenteEmPesquisa = (Gerente) pessoaEmPesquisa;
            if(gerenteEmPesquisa.getUsuario().equals(gerenteTentandoLogar.getUsuario()) ){
                gerente = gerenteEmPesquisa;
                break;
            }else{
                gerente = null;
            }
        }
        return gerente;
    }
    */

    public static void excluirPessoa(Gerente gerente) {
        pessoas.remove(gerente);
    }
}
