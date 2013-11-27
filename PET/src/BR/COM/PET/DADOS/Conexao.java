package BR.COM.PET.DADOS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {
	
	
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
		
			System.err.println("erro no driver: "+e.getMessage());
			
		} catch (SQLException e) {
	
			System.err.println("erro de url: "+e.getMessage());
			
		}
	}
	public void fecharBD() {

		if (conexao != null ) {
			try {
				conexao.close();

if(prstm  != null){
prstm.close();
}
		 	
			} catch (SQLException e) {

				System.err.println(e.getClass().getName() + ": "
						+ e.getMessage());

			}
		}
	}
}
 