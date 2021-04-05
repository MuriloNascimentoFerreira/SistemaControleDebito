/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemaControleDebito.modelo;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author Murilo
 */
public class Pagamento {

    private int id;
    private int numeroDeParcelas;
    private LocalDateTime dataHora;
    Debito debito;
    
    public void setDebito(Debito debito) {
        this.debito = debito;
    }

    public Object getId() {
        return id;
    }

    public int getNumeroDeParcelas() {
        return numeroDeParcelas;
    }

    public String getData() {
        StringBuilder data = new StringBuilder();
        data.append(this.dataHora.getDayOfMonth());
        data.append("/");
        data.append(this.dataHora.getMonthValue());
        data.append("/");
        data.append(this.dataHora.getYear());
        return data.toString();
    }

    public void setData(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public void setNumeroDeParcelas(int numeroDeParcelas) {
        this.numeroDeParcelas = numeroDeParcelas;
    }
    
}
