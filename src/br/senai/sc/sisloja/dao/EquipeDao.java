package br.senai.sc.sisloja.dao;

import br.senai.sc.sisGestao.conexao.ConnectionFactory;
import br.senai.sc.sisGestao.modelo.CadastrarEquipe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EquipeDao extends ConnectionFactory {

    private Connection con;

    public EquipeDao() {
        this.con = this.getConnection();
    }

    public void inserir(CadastrarEquipe eq) throws SQLException {

        String sql = "insert into equipe "
                + "(nome, objetivo)"
                + "values (?, ?);";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setString(1, eq.getNome());
            st.setString(2, eq.getDescricao());

            st.execute();
            st.close();
        }

        this.con.close();

    }

    public void eliminar(int codigoC) throws SQLException {

        String sql = "delete from equipe where codEquipe = ?";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, codigoC);
            st.execute();
            st.close();
        }

        this.con.close();

    }

    public void alterar(CadastrarEquipe eq) throws SQLException {

        String sql = "update equipe set nome = ?, Objetivo = ? where codEquipe = ?";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setString(1, eq.getAtualizarNome());
            st.setString(2, eq.getAtualizarDescricao());
            st.setInt(3, eq.getCodEquipe());

            st.execute();
            st.close();
        }

        this.con.close();

    }

    public List<CadastrarEquipe> listarEquipes() throws SQLException {
        String sql = "select * from equipe";
        List<CadastrarEquipe> equipes = null;

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();

            equipes = new ArrayList<CadastrarEquipe>();

            while (rs.next()) {
                CadastrarEquipe e = new CadastrarEquipe();

                e.setCodEquipe(rs.getInt("codEquipe"));
                e.setNome(rs.getString("nome"));
                e.setDescricao(rs.getString("objetivo"));
                equipes.add(e);
            }

            rs.close();
            st.close();

        }

        this.con.close();
        return equipes;
    }

    public CadastrarEquipe getEquipe(int codEquipe) throws SQLException {
        String sql = "select * from equipe where codEquipe = ?";
        CadastrarEquipe equipe = null;

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, codEquipe);
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    CadastrarEquipe e = new CadastrarEquipe();
                    e.setCodEquipe(rs.getInt("codEquipe"));
                    e.setNome(rs.getString("nome"));
                    e.setDescricao(rs.getString("objetivo"));
                }
            }
            st.close();
        }

        this.con.close();
        return equipe;
    }

}
