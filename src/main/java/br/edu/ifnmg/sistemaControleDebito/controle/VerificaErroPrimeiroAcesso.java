/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemaControleDebito.controle;

import br.edu.ifnmg.sistemaControleDebito.dados.FuncionarioDAO;

/**
 *
 * @author Murilo
 */
public class VerificaErroPrimeiroAcesso {
    
    public static boolean verificaErroPrimeiroAcesso(){
        boolean resposta = false;
        
        resposta = FuncionarioDAO.verificaGerenteValido();
        if(resposta == true){
            return resposta;
        }else{
            return resposta;
        }
    }
    
}
