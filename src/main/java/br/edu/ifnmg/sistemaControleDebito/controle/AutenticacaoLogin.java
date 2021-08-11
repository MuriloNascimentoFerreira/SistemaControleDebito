/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemaControleDebito.controle;

import br.edu.ifnmg.sistemaControleDebito.dados.FuncionarioDAO;
import br.edu.ifnmg.sistemaControleDebito.modelo.Caixa;
import br.edu.ifnmg.sistemaControleDebito.modelo.Gerente;
import br.edu.ifnmg.sistemaControleDebito.view.Tela;
import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class AutenticacaoLogin {
    public static boolean autenticarLogin(int tipoFuncionario) {
        boolean resposta = false;
        
        System.out.printf("\n------------------------ Login ------------------------\n");
        System.out.printf("Usuário: \n");
        Scanner ler = new Scanner(System.in);
        String usuario = ler.nextLine();
        System.out.printf("Senha: \n");
        String senhaTentada = ler.nextLine();
        try{
            if(tipoFuncionario == 1){

                Gerente gerente = new Gerente();

                gerente = (Gerente) FuncionarioDAO.buscarFuncionario(usuario,1);
                if(!gerente.getUsuario().equalsIgnoreCase(usuario)){
                    resposta = false;
                }else if(gerente instanceof Gerente){
                    resposta = gerente.validarSenha(senhaTentada);
                }
            }else  if(tipoFuncionario == 2){

                Caixa caixa = new Caixa();

                caixa = (Caixa) FuncionarioDAO.buscarFuncionario(usuario,2);
                if(caixa != null){
                    if(!caixa.getUsuario().equalsIgnoreCase(usuario)){
                        resposta = false;
                    }else if(caixa instanceof Caixa){
                        resposta = caixa.validarSenha(senhaTentada);
                    }
                }
            }else if(!resposta){
                    Tela.mensagemLoginInvalido();
                }
            
        }catch(NullPointerException e){
            Tela.mensagemLoginInvalido();
            autenticarLogin(tipoFuncionario);
        }  
        return resposta;
    }
    
}
