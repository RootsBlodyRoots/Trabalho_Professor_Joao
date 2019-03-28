
package br.senai.sc.sisGestao.modelo;


public class CadastrarEquipe {
    protected String nome;
    protected String descricao;
    protected String atualizarNome;
    protected String atualizarDescricao;
    protected int codigoEquipe;
    
    public void setCodEquipe(int cod){
        this.codigoEquipe = cod;
    }
    
    public int getCodEquipe(){
        return this.codigoEquipe;
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void setAtualizarNome(String novoNome){
        this.atualizarNome = novoNome;
    }
    public String getAtualizarNome(){
        return this.atualizarNome;
    }
    
    public void setAtualizarDescricao(String novaDescricao){
       this.atualizarDescricao = novaDescricao;
    }
    
    public String getAtualizarDescricao(){
        return this.atualizarDescricao;
    }
   
    
}
