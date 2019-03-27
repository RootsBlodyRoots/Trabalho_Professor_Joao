package br.senai.sc.sisGestao.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    
    public  Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1/mydb", "root", "CachorroRoco27");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    

            
}