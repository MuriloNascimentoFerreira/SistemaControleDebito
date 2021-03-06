/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemaControleDebito.controle;

import br.edu.ifnmg.sistemaControleDebito.view.MenuInicial;
import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class ControleTelaInicial {
    private int opcaoDesejada;
    
    public void ControlarOpcaoEscolhida(){
        
       
        do{
            MenuInicial telaUm = new MenuInicial();
            telaUm.carregarTelaInicial();
        
            this.opcaoDesejada = carregarOpcaoDesejada();
            
            switch (opcaoDesejada){
                case 1: System.out.println("Opção um");
                    break;

                case 2:

                case 3: return;
            }
        }while(true);
    }

    private int carregarOpcaoDesejada(){
        int opcao;
        Scanner ler = new Scanner(System.in);
        opcao = ler.nextInt();
        return opcao;
    }
    
}
