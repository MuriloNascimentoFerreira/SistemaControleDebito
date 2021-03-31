/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemaControleDebito.controle;

import br.edu.ifnmg.sistemaControleDebito.dados.PessoaDAO;
import br.edu.ifnmg.sistemaControleDebito.modelo.Gerente;
import br.edu.ifnmg.sistemaControleDebito.view.Tela;
import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class MenuInicialControle {
    
     private int opcaoDesejada;
    
    public void ControlarOpcaoEscolhida(){
       
        do{
            Tela tela = new Tela();
            this.opcaoDesejada = tela.carregarTelaInicial() ;
            MenuInicialGerenteControle telaInicialGerenteControle = new MenuInicialGerenteControle();
            MenuInicialCaixaControle telaInicialCaixaControle = new MenuInicialCaixaControle();
            
            switch (opcaoDesejada){
                case 1:
                    if (autenticarLogin(1) == true){
                        telaInicialGerenteControle.ControlarOpcaoEscolhidaGerente();
                    }else{
                     //   tela.mensagemOpcaoInvalida();
                    }
                        break;

                case 2:
                    if(autenticarLogin(1) == true){
                        telaInicialCaixaControle.ControlarOpcaoEscolhidaCaixa();
                    }else{
                    //    tela.mensagemOpcaoInvalida();
                    }
                
                case 0: return; //sair
                
                default: tela.mensagemOpcaoInvalida();
            }
        }while(true);
    }

    private boolean autenticarLogin(int tipoFuncionario) {//mesmo o usuario sendo caixa esse login funciona 
        boolean resposta = false;
        
        if(tipoFuncionario == 1){
           
            Gerente gerente = null;

            System.out.printf("\n------------------------ Login ------------------------\n");
            System.out.printf("Usuário: \n");
            Scanner ler = new Scanner(System.in);
            String usuario = ler.nextLine();
            System.out.printf("Senha: \n");
            String senhaTentada = ler.nextLine();

            gerente = (Gerente) PessoaDAO.buscarPessoa(usuario);
            if(gerente == null){
                System.out.println("Usuário ou senha inválidos!");
                return false;
            }else{
                resposta = gerente.validarSenha(senhaTentada);
            }
        }
        
        return resposta;
    }
    
}
