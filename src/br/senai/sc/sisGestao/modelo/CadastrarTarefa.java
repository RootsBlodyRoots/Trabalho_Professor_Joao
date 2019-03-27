/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.sisGestao.modelo;

public class CadastrarTarefa {

    private String titulo;
    private String descricao;
    private int codTarefa;
    private String data;
    private int codCol;
    private int codEq;
    private String dataCriacao;
    
    
    public void setDataCriacao(String d){
        this.dataCriacao = d;
    }
    public String getDataCriacao(){
        return this.dataCriacao;
    }
    
    public int getCodCol() {
        return this.codCol;
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

    public void setData(String data){
        this.data = data;
    }
    
    public String getData(){
        return this.data;
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
