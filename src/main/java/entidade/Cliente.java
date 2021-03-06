/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author Murilo
 */
public class Cliente extends Pessoa {
    private double limiteCredito;
    
    /*boolean getStatus(){
    
    }
    */

    public Cliente(double limiteCredito, String nome, String cpf, String endereco, String email) {
        super(nome, cpf, endereco, email);
        this.limiteCredito = limiteCredito;
    }
    
    
    
}
