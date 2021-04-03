/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemaControleDebito.dados;

import br.edu.ifnmg.sistemaControleDebito.modelo.Cliente;
import br.edu.ifnmg.sistemaControleDebito.modelo.Debito;
import br.edu.ifnmg.sistemaControleDebito.modelo.DebitoCliente;
import br.edu.ifnmg.sistemaControleDebito.modelo.DebitoFuncionario;
import java.util.ArrayList;

/**
 *
 * @author Murilo
 */
public class DebitoDAO {
    private static final ArrayList<Debito> debitos =  new ArrayList<>();
    
    public static void adicionarDebito(Debito debito){
        debitos.add(debito);
        
    }
    
    
    public static Debito buscarDebitoCliente(String descricaoDebito) {
        Debito debito = null;                                  
        for(Debito debitoEmPesquisa : debitos){     
            if (debitoEmPesquisa instanceof DebitoCliente){
                DebitoCliente debitoCliente = (DebitoCliente) debitoEmPesquisa;
                if(debitoEmPesquisa.getDescricao().equals(descricaoDebito) ){
                    debito = debitoEmPesquisa;
                    break;
                }
            }else if(debitoEmPesquisa instanceof DebitoFuncionario){
                
            }
        }
        return debito;
    }
    
     public static void excluirFuncionario(Debito debito) {
        debitos.remove(debito);
    }
    
}
