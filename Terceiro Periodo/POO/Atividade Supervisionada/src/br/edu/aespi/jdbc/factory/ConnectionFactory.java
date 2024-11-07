package br.edu.aespi.jdbc.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection() throws ClassNotFoundException {
        // URL de conexão com o MySQL
        String mysqlUrl = "jdbc:mysql://localhost:3306/herodb"; // ajuste o nome do banco de dados
        String username = "root"; // substitua pelo seu usuário do MySQL
        String password = ""; // substitua pela sua senha do MySQL

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Classe do driver do MySQL
            
            return DriverManager.getConnection(mysqlUrl, username, password);
            
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar ao banco de dados", e);
        }
    }
}
