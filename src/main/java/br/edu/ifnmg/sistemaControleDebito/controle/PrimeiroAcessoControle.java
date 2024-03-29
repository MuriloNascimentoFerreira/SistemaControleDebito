/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemaControleDebito.controle;

import br.edu.ifnmg.sistemaControleDebito.dados.FuncionarioDAO;
import br.edu.ifnmg.sistemaControleDebito.modelo.Gerente;
import br.edu.ifnmg.sistemaControleDebito.view.Tela;
import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class PrimeiroAcessoControle {
   
    public static void primeiroAcessoControle(){
    
        Tela tela = new Tela();
        tela.primeiroAcessoTela();
        Gerente gerente = new Gerente();
        String usuario;
        String senhaTentada;
        try{
            do{
                Scanner ler = new Scanner(System.in);
                System.out.println("Usuário: ");
                usuario = ler.nextLine();

                System.out.println("Senha: ");
                senhaTentada = ler.nextLine();

                gerente = (Gerente) FuncionarioDAO.buscarFuncionario(usuario,1);
                if(!gerente.getNome().equalsIgnoreCase(usuario)){
                    System.out.println("Usuário ou senha inválidos!");
                }else if (gerente.validarSenha(senhaTentada)){
                        System.out.println("\nFaça o seu cadastro para continuar\n");
                        cadastrarPrimeiroGerente();
                        break;
                }else{
                    Tela.mensagemLoginInvalido();
                }
                
            }while(true);
            
        }catch(NumberFormatException e){
            Tela.numeroInvalido();
            primeiroAcessoControle();
        }catch(NullPointerException f){
            Tela.numeroInvalido();
            primeiroAcessoControle();
        }
    }
    
    private static void cadastrarPrimeiroGerente(){
        GerenteControle.cadastrarGerente();
    }
    
}
