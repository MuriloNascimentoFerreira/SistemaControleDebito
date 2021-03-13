/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemaControleDebito;

import br.edu.ifnmg.sistemaControleDebito.controle.ControleTelaInicial;
import br.edu.ifnmg.sistemaControleDebito.modelo.dados.PessoaDAO;
import br.edu.ifnmg.sistemaControleDebito.modelo.entidade.Gerente;


/**
 *
 * @author Murilo
 */
public class Main {
    
    public static void main(String[] args) {
        
        Gerente gerente = new Gerente("admin", "000.111.222-03", "admin@teste.com", "rua teste numero 001",
        "9.888.777", 0, 0,
        "gerente", "admin");
        PessoaDAO.adicionarPessoa(gerente); 
    
        ControleTelaInicial controleTelaInicial = new ControleTelaInicial();
        controleTelaInicial.ControlarOpcaoEscolhida();
        
    }
    
}
