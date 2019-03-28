package br.senai.sc.sisGestao.modelo;

import br.senai.sc.sisGestao.conexao.ConnectionFactory;
import br.senai.sc.sisGestao.modelo.CadastrarUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ValidarLogin {

 
 

    public boolean checkLogin(String usuario, String senha, String tipo) {


        ConnectionFactory connection = new ConnectionFactory();
        Connection con ;
        
        con = connection.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean valida = false;

        try {
            stmt = con.prepareStatement("SELECT * FROM colaborador WHERE usuario = ? and senha = ? and tipo = ?");
            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            stmt.setString(3, tipo);
            rs = stmt.executeQuery();

            if (rs.next()) {
                valida = true;
                //JOptionPane.showMessageDialog(null, "deu");
            }else{
                //JOptionPane.showMessageDialog(null, "num deu");
            }
            
        } catch (SQLException ex) {
            
            Logger.getLogger(ValidarLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return valida;

    }

}
