/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemaControleDebito.controle;

import br.edu.ifnmg.sistemaControleDebito.dados.PessoaDAO;
import br.edu.ifnmg.sistemaControleDebito.modelo.Gerente;

/**
 *
 * @author Murilo
 */
public class PessoaControle {
    
    public void adicionarPessoaControle(Gerente gerente){
        PessoaDAO.adicionarPessoa(gerente);
    }

    public void excluirPessoaControle(Gerente gerente) {
       PessoaDAO.excluirPessoa(gerente);
    }
    
}
