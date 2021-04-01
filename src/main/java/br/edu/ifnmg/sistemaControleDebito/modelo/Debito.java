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
public abstract class Debito {
    private int id;
    private double valorParcela;
    private int quantidadeParcela;
    private  LocalDateTime DataDebito;
    private int intervaloParcela;
    private String descricao;


    public Debito() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDataDebito(LocalDateTime DataDebito) {
        this.DataDebito = DataDebito;
    }

    public void setValorParcela(double valorParcela) {
        this.valorParcela = valorParcela;
    }

    public void setQuantidadeParcela(int quantidadeParcela) {
        this.quantidadeParcela = quantidadeParcela;
    }

    public void setIntervaloParcela(int intervaloParcela) {
        this.intervaloParcela = intervaloParcela;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    

    
    
}   
