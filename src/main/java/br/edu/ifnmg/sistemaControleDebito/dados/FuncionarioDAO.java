/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemaControleDebito.dados;

import br.edu.ifnmg.sistemaControleDebito.modelo.Funcionario;
import br.edu.ifnmg.sistemaControleDebito.modelo.Gerente;
import java.util.ArrayList;

/**
 *
 * @author Murilo
 */
public class FuncionarioDAO {
    
    private static final ArrayList<Funcionario> funcionarios =  new ArrayList<>();
    
    public static void adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    
    public static Funcionario buscarFuncionario(String usuario) {
        Funcionario funcionario = null;
        for(Funcionario funcionarioEmPesquisa : funcionarios){
            if (funcionarioEmPesquisa instanceof Gerente){
                Gerente gerenteEmPesquisa = (Gerente) funcionarioEmPesquisa;
                if(gerenteEmPesquisa.getUsuario().equals(usuario) ){
                    funcionario = funcionarioEmPesquisa;
                    break;
                }
            }
        }
        return funcionario;
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

    public static void excluirFuncionario(Gerente gerente) {
        funcionarios.remove(gerente);
    }
}
