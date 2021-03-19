/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemaControleDebito;

import br.edu.ifnmg.sistemaControleDebito.controle.TelaInicialControle;
import br.edu.ifnmg.sistemaControleDebito.controle.PessoaControle;
import br.edu.ifnmg.sistemaControleDebito.modelo.Gerente;


/**
 *
 * @author Murilo
 */
public class Main {
    
    public static void main(String[] args) {
        
        Gerente gerente = new Gerente("admin", "000.111.222-03", "admin@teste.com", "rua teste numero 001",
        "9.888.777", 0, 0,
        "admin", "admin");
        PessoaControle pessoaControle = new PessoaControle();
        pessoaControle.adicionarPessoaControle(gerente); 
    
        TelaInicialControle controleTelaInicial = new TelaInicialControle();
        controleTelaInicial.ControlarOpcaoEscolhida();
        
    }
    
}
