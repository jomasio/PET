package br.com.pet.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class Conexao {

	private static Logger LOG = Logger.getLogger(Conexao.class);

	Connection conexao;
	private String driver = "org.sqlite.JDBC";
	private String url = "jdbc:sqlite:pet_cia.sqlite";
	PreparedStatement prstm;
	ResultSet resultset;

	public void Conexao() {

	}

	// metodo vai abrir uma conexao com o banco de dados
	public void openBD() {

		try {
			Class.forName(driver);
			conexao = DriverManager.getConnection(url);
		} catch (ClassNotFoundException e) {
			LOG.error("erro no driver: " + e.getMessage());
		} catch (SQLException e) {
			LOG.error("erro de url: " + e.getMessage());
		}
	}

	public void fecharBD() {
		
		try {
			if (conexao != null) {

				conexao.close();

				if (prstm != null ) {
					prstm.close();
				}

			}
		} catch (SQLException e) {
			LOG.error(e.getMessage());
		}
	}

	
}
