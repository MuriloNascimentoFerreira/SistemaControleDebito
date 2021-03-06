/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemaControleDebito;

import br.edu.ifnmg.sistemaControleDebito.controle.ControleTelaInicial;
import br.edu.ifnmg.sistemaControleDebito.view.MenuInicial;
import entidade.Gerente;


/**
 *
 * @author Murilo
 */
public class Main {
    
    public static void main(String[] args) {
        
        Gerente gerente = new Gerente("Guilherme", "000.111.222-03", "guilherme@teste.com", "rua teste numero 001",
        "9.888.777", 2000, 15,
        "guilhermeGerenteUm", "22203");
    
        ControleTelaInicial controleTelaInicial = new ControleTelaInicial();
        controleTelaInicial.ControlarOpcaoEscolhida();
        
    
    }
    
}
