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
public class MenuInicialControle {
    
    public static void ControlarOpcaoEscolhida(){
       int opcaoDesejada;
       try{
            do{

                opcaoDesejada = Tela.carregarTelaInicial() ;
                MenuInicialGerenteControle telaInicialGerenteControle = new MenuInicialGerenteControle();
                MenuInicialCaixaControle telaInicialCaixaControle = new MenuInicialCaixaControle();

                switch (opcaoDesejada){
                    case 1:
                        if (AutenticacaoLogin.autenticarLogin(1)){
                            telaInicialGerenteControle.controlarOpcaoEscolhidaGerente();
                            break;
                        }else{
                            Tela.mensagemLoginInvalido();
                            break;
                        }

                    case 2:
                        if(AutenticacaoLogin.autenticarLogin(2)){
                            telaInicialCaixaControle.controlarOpcaoEscolhidaCaixa();
                            break;
                        }else{
                            Tela.mensagemLoginInvalido();
                            break;
                        }

                    case 0: return; 

                    default: Tela.mensagemOpcaoInvalida();
                }
            }while(true);
       }catch(NumberFormatException e){
           Tela.numeroInvalido();
       }
    }

}
    

