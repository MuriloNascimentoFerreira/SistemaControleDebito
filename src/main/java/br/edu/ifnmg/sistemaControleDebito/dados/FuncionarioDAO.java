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
    private static int idContador = 0;
    
    public static void adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
        interarContador();
    }
    
    public static Funcionario buscarFuncionario(String usuario) {
        Funcionario funcionario = null;
        for(Funcionario funcionarioEmPesquisa : funcionarios){
            if (funcionarioEmPesquisa instanceof Gerente){
                Gerente gerenteEmPesquisa = (Gerente) funcionarioEmPesquisa;
                if(gerenteEmPesquisa.getUsuario().equalsIgnoreCase(usuario) ){
                    funcionario = funcionarioEmPesquisa;
                    break;
                }
            }
        }
        return funcionario;
    }

    public static void excluirFuncionario(Gerente gerente) {
        funcionarios.remove(gerente);
    }
    
    private static void interarContador() {
        idContador++;
    }

    public static boolean verificaGerenteValido() {
        boolean resposta = false;
        for(Funcionario funcionarioEmPesquisa : funcionarios){
            if ( (funcionarioEmPesquisa instanceof Gerente) && (!funcionarioEmPesquisa.getNome().equals("admin"))){
                resposta = true;
                break;

            }
        }
        return resposta;
    }
}
