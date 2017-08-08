package br.com.alura.designpatterns2.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.commons.lang3.StringUtils;



public class ConnectionFactory {

	
	public Connection getConnection() {
		
		
		String dbtype = "sqlite";
		
		String envTipoBanco = System.getenv("tipoBanco");
		
		if ( StringUtils.isNotEmpty(envTipoBanco) && envTipoBanco.equals("postgres")) dbtype = "postgres";
		
        try {
            Connection conexao = DriverManager.getConnection("jdbc:" + dbtype + ":database.db");
            return conexao;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
	
}
