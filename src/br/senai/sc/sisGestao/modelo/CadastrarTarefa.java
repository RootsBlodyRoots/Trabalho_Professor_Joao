/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.sisGestao.modelo;

import java.sql.Date;

public class CadastrarTarefa {

    private String titulo;
    private String descricao;
    private int codTarefa;
    private Date data;
    private int codCol;
    private int codEq;

    public int getCodCol() {
        return codCol;
    }

    public void setCodCol(int codCol) {
        this.codCol = codCol;
    }

    public int getCodEq() {
        return codEq;
    }

    public void setCodEq(int codEq) {
        this.codEq = codEq;
    }

    public int getCodTarefa() {
        return codTarefa;
    }

    public void setCodTarefa(int codTarefa) {
        this.codTarefa = codTarefa;
    }

    public void setData(Date d){
        this.data = d;
    }
 
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
