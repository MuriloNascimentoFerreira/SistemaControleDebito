/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemaControleDebito.controle;

import br.edu.ifnmg.sistemaControleDebito.dados.FuncionarioDAO;
import br.edu.ifnmg.sistemaControleDebito.modelo.Caixa;
import br.edu.ifnmg.sistemaControleDebito.modelo.Gerente;

/**
 *
 * @author Murilo
 */
public class FuncionarioControle {
    
    public void adicionarFuncionario(Gerente gerente){
        FuncionarioDAO.adicionarFuncionario(gerente);
    }
    
    public void adicionarFuncionario(Caixa caixa){
        FuncionarioDAO.adicionarFuncionario(caixa);
    }

    public void excluirFuncionario(Gerente gerente) {
       FuncionarioDAO.excluirFuncionario(gerente);
    }
    
}
