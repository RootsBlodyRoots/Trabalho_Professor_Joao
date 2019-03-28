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
                + "(data_criacao, titulo, descricao, data_entrega, Colaborador_codColaborador)"
                + "values (curdate(), ?, ?, ?, ?);";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setString(1, taf.getTitulo());
            st.setString(2, taf.getDescricao());
            st.setString(3, taf.getData());
            st.setInt(4, taf.getCodCol());

            st.execute();
            st.close();
        }

        this.con.close();

    }

    public void inserirTarefaEquipe(CadastrarTarefa taf) throws SQLException {

        String sql = "insert into agenda"
                + "(data_criacao, titulo, descricao, data_entrega, Equipe_codEquipe)"
                + "values (curdate(), ?, ?, ?, ?);";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setString(1, taf.getTitulo());
            st.setString(2, taf.getDescricao());
            st.setString(3, taf.getData());
            st.setInt(4, taf.getCodEq());

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

        String sql = "update agenda set titulo = ?, descricao = ?, data_entrega = ?  where codTarefa = ?";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setString(1, taf.getTitulo());
            st.setString(2, taf.getDescricao());
            st.setString(3, taf.getData());
            st.setInt(4, taf.getCodTarefa());

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
                t.setDataCriacao(rs.getString("data_criacao"));
                t.setTitulo(rs.getString("titulo"));
                t.setDescricao(rs.getString("descricao"));
                t.setData(rs.getString("data_entrega"));
                t.setCodCol(rs.getInt("Colaborador_codColaborador"));
                t.setCodEq(rs.getInt("Equipe_codEquipe"));

                tarefas.add(t);
            }

            rs.close();
            st.close();

        }

        this.con.close();
        return tarefas;
    }

}
