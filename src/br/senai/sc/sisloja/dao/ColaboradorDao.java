package br.senai.sc.sisloja.dao;

import br.senai.sc.sisGestao.conexao.ConnectionFactory;
import br.senai.sc.sisGestao.modelo.CadastrarUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ColaboradorDao extends ConnectionFactory {

    private Connection con;

    public ColaboradorDao() {
        this.con = this.getConnection();
    }

    public void inserir(CadastrarUsuario col) throws SQLException {

        String sql = "insert into colaborador "
                + "(tipo, usuario, "
                + "senha, nome, sobrenome, email, Equipe_codEquipe) "
                + "values (?, ?, ?, ?, ?, ?, ?);";
  
        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setString(1, col.getTipo());
            st.setString(2, col.getUsuario());
            st.setString(3, col.getSenha());
            st.setString(4, col.getNome());
            st.setString(5, col.getSobrenome());
            st.setString(6, col.getEmail());
            st.setInt(7, col.getEquipe());
            
            st.execute();
            st.close();
        }
        
        this.con.close();

    }
    
  

    public void eliminar(int codigoC) throws SQLException {

        String sql = "delete from colaborador where codColaborador = ?";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, codigoC);
            
            st.execute();
            st.close();
        }
        
        this.con.close();

    }

    public void alterar(CadastrarUsuario col) throws SQLException {

        String sql = "update colaborador set tipo = ?, usuario = ?, senha = ?, email = ? where codColaborador = ?";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setString(1, col.getTipo());
            st.setString(2, col.getUsuario());
            st.setString(3, col.getSenha());
            st.setString(4, col.getEmail());
            st.setInt(5, col.getColaborador());
            
            st.execute();
            st.close();
        }

        this.con.close();

    }

    public List<CadastrarUsuario> listarColaboradores() throws SQLException {
        String sql = "select * from colaborador";
        List<CadastrarUsuario> colaboradores = null;

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();

            colaboradores = new ArrayList<CadastrarUsuario>();

            while (rs.next()) {
                
                CadastrarUsuario c = new CadastrarUsuario();
                
                c.setColaborador(rs.getInt("codColaborador"));
                c.setTipo(rs.getString("tipo"));
                c.setUsuario(rs.getString("usuario"));
                c.setSenha(rs.getString("senha"));
                c.setNome(rs.getString("nome"));
                c.setSobrenome(rs.getString("sobrenome"));
                c.setEmail(rs.getString("email"));
                c.setEquipe(rs.getInt("Equipe_codEquipe"));
           
                
                colaboradores.add(c);
            }

            rs.close();
            st.close();

        }

        this.con.close();
        return colaboradores;
    }

    public CadastrarUsuario getColaborador(int codColaborador) throws SQLException {
        
        String sql = "select * from colaborador where codColaborador = ?";
        CadastrarUsuario colaborador = null;

        try (PreparedStatement st = this.con.prepareStatement(sql)){
           
            
            st.setInt(1, codColaborador);
                  
            try (ResultSet rs = st.executeQuery()) {
                
                if (rs.next()) {
                    CadastrarUsuario c = new CadastrarUsuario();
                    
                    c.setColaborador(rs.getInt("codColaborador"));
                    c.setTipo(rs.getString("tipo"));
                    c.setUsuario(rs.getString("usuario"));
                    c.setSenha(rs.getString("senha"));
                    c.setNome(rs.getString("nome"));
                    c.setSobrenome(rs.getString("sobrenome"));
                    c.setEmail(rs.getString("email"));
                    c.setEquipe(rs.getInt("Equipe_codEquipe"));
                  }
            }
            st.close();
        }

        this.con.close();
        return colaborador;
    }

}
