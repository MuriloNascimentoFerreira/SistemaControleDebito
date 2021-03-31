/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemaControleDebito.controle;

import br.edu.ifnmg.sistemaControleDebito.modelo.Funcionario;
import br.edu.ifnmg.sistemaControleDebito.modelo.Gerente;
import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class GerenteControle {
    Gerente gerente;
    
    public void CadastrarGerente(){//como preecher os dados da pessoa 
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Nome: ");
        gerente.setNome(ler.nextLine());
        System.out.println(": ");
        gerente.setNome(ler.nextLine());
        System.out.println("Nome: ");
        gerente.setNome(ler.nextLine());
        System.out.println("Nome: ");
        gerente.setNome(ler.nextLine());
    
    }
    
    public void CadastrarGerente(Funcionario funcionario){
    
    }
    
    public void CadastrarFuncionario(){
    
    }
    
}
