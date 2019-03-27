/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.sisGestao.modelo;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CadastrarTarefa {

    private String titulo;
    private String descricao;
    private int codTarefa;

    public int getCodTarefa() {
        return codTarefa;
    }

    public void setCodTarefa(int codTarefa) {
        this.codTarefa = codTarefa;
    }

    public void setData(){
        getData();
    }
    
    
    public Date getData() {
        Calendar calendar = new GregorianCalendar();
        Date date = new Date(System.currentTimeMillis());
        calendar.setTime(date);
        return (Date) calendar.getTime();
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
