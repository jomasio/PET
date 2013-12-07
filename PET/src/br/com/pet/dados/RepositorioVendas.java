package br.com.pet.dados;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import br.com.pet.negocio.Animais;
import br.com.pet.negocio.Transacao;
import br.com.pet.negocio.Vendas;
import br.com.pet.util.UtilGUI;

public class RepositorioVendas  {

	private static Logger Log = Logger.getLogger(RepositorioPet.class);

	private String sql = "";

	private Conexao conect;
	public RepositorioVendas() {

		conect = new Conexao();
		conect.openBD();
	}

	public void salvarvendas(Transacao vendas) throws SQLException {
		

		Log.debug("Salvando vendas no Banco: " + vendas);

			String sql = "";

			int AnimaisIds[] = vendas.getAnimaisIds();
			int idCliente = vendas.getIdCliente();

			for (int i = 0; i < AnimaisIds.length; i++) {
				sql = "INSERT INTO main.transacoes(id_cliente,id_livro) "
						+ "VALUES (" + idCliente + "," + AnimaisIds[i] + ")";

				Log.debug("Sql: " + sql);

				
				conect.prstm.executeUpdate(sql);
			}
		
	}

	public ResultSet pesquisaComRetorno(String table, String coluna,
			String criterio, boolean withlike) {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		String sql = "SELECT * FROM main." + table;
		if (!criterio.equals("")){
			if(withlike)
				sql += "WHERE"+ coluna + "LIKE '%" + criterio + "%";
			else
				sql += "WHERE" + coluna + "='" + criterio + "'";
			
	
		}
		Log.debug("Sql: " + sql);
		
		try {
			rs= conect.prstm.executeQuery(sql);
		}catch(SQLException e ){
			Log.error(e.getMessage());
		}
		return rs;
	}

}
