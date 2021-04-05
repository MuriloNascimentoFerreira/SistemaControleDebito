/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemaControleDebito.dados;

import br.edu.ifnmg.sistemaControleDebito.modelo.Pagamento;
import java.util.ArrayList;

/**
 *
 * @author Murilo
 */
public class PagamentoDAO {
    private static final ArrayList<Pagamento> pagamentos = new ArrayList<>();
    
    public static void adicionarPagamento(Pagamento pagamento){
        pagamentos.add(pagamento);
    }
    
    public static ArrayList<Pagamento> buscarPagamentos(int id) {
        ArrayList<Pagamento> pagamentosRealizados = new ArrayList<>(); 
        for(Pagamento pagamentoEmPesquisa : pagamentos){
            if(pagamentoEmPesquisa.getId().equals(id) ){
                pagamentosRealizados.add(pagamentoEmPesquisa);
                break;
            }else{
                
            }
        }
        return pagamentos;
    }
    
}
