package br.senai.sc.sisloja.dao;

import br.senai.sc.sisGestao.conexao.ConnectionFactory;
import br.senai.sc.sisGestao.modelo.CadastrarTarefa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException; 
import java.util.ArrayList;
import java.util.List;

public class AgendaDao extends ConnectionFactory {

    private Connection con;

    public AgendaDao() {
        this.con = this.getConnection();
    }

    public void inserir(CadastrarTarefa taf) throws SQLException {

        String sql = "insert into agenda"
                + "(data_criacao, data_entrega, titulo, descricao, Colaborador_codColaborador)"
                + "values (curdate(), ?, ?, ?, ?);";
  
        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setString(3, taf.getTitulo());
            st.setString(4, taf.getDescricao());
    
            st.execute();
            st.close();
        }
        
        this.con.close();

    }
    
  

    public void eliminar(int codigoC) throws SQLException {

        String sql = "delete from agenda where codTarefa = ?";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, codigoC);
            
            st.execute();
            st.close();
        }
        
        this.con.close();

    }

    public void alterar(CadastrarTarefa taf) throws SQLException {

        String sql = "update agenda set titulo = ?, descricao = ?,  where codTarefa = ?";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setString(1, taf.getTitulo());
            st.setString(2, taf.getDescricao());
            st.setInt(3, taf.getCodTarefa());
         
            st.execute();
            st.close();
        }

        this.con.close();

    }

    public List<CadastrarTarefa> listarTarefas() throws SQLException {
        String sql = "select * from agenda";
        List<CadastrarTarefa> tarefas = null;

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();

            tarefas = new ArrayList<CadastrarTarefa>();

            while (rs.next()) {
                
                CadastrarTarefa t = new CadastrarTarefa();
                
                t.setCodTarefa(rs.getInt("codTarefa"));
                t.setData(rs.getDate("data_criacao"));
                t.setData(rs.getDate("data_entrega"));
                t.setTitulo(rs.getString("titulo"));
                t.setDescricao(rs.getString("descricao"));
      
                tarefas.add(t);
            }

            rs.close();
            st.close();

        }

        this.con.close();
        return tarefas;
    }

    public CadastrarTarefa getTarefa(int codTarefa) throws SQLException {
        
        String sql = "select * from agenda where codTarefa = ?";
        CadastrarTarefa tarefa = null;

        try (PreparedStatement st = this.con.prepareStatement(sql)){
           
            
            st.setInt(1, codTarefa);
                  
            try (ResultSet rs = st.executeQuery()) {
                
                if (rs.next()) {
                    CadastrarTarefa t = new CadastrarTarefa();
                    
                    t.setCodTarefa(rs.getInt("codTarefa"));
                    t.setData(rs.getDate("data_criacao"));
                    t.setData(rs.getDate("data_entrega"));
                    t.setTitulo(rs.getString("titulo"));
                    t.setDescricao(rs.getString("descricao"));
                  }
            }
            st.close();
        }

        this.con.close();
        return tarefa;
    }

}
