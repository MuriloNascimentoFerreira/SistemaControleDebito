/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemaControleDebito.dados;

import br.edu.ifnmg.sistemaControleDebito.modelo.Debito;
import br.edu.ifnmg.sistemaControleDebito.modelo.DebitoCliente;
import java.util.ArrayList;

/**
 *
 * @author Murilo
 */
public class DebitoDAO {
    private static int contadorId = 0;
    private static final ArrayList<Debito> debitos =  new ArrayList<>();
    
    public static void adicionarDebito(Debito debito){
        debitos.add(debito);
        DebitoDAO.interadorId();
    }
    
    /*public static Debito buscarDebitoCliente(String usuario) {//1-criar um ID em debito 2-criar meio de identificar 
        Debito debito = null;                                 //os debitos de cada cliente. para servir de metodo de 
        for(Debito funcionarioEmPesquisa : funcionarios){      // busca(usar outra tipo de coleção)
            if (funcionarioEmPesquisa instanceof DebitoCliente){
                DebitoCliente gerenteEmPesquisa = (DebitoCliente) funcionarioEmPesquisa;
                if(gerenteEmPesquisa.getUsuario().equals(usuario) ){
                    funcionario = funcionarioEmPesquisa;
                    break;
                }
            }
        }
        return funcionario;
    }*/
    
     public static void excluirFuncionario(Debito debito) {
        debitos.remove(debito);
    }

    public static int getContadorId() {
        return contadorId;
    }

    public static void interadorId() {
        DebitoDAO.contadorId++;
    }
    
    
}
