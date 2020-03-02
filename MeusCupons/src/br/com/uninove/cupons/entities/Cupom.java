/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uninove.cupons.entities;

/**
 *
 * @author jsoft-ti
 */
public class Cupom extends Entitie{
    private int id;
    private int codCupom;
    private String descricao;
    private int numPontos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodCupom() {
        return codCupom;
    }

    public void setCodCupom(int codCupom) {
        this.codCupom = codCupom;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNumPontos() {
        return numPontos;
    }

    public void setNumPontos(int numPontos) {
        this.numPontos = numPontos;
    }
    
    
}
