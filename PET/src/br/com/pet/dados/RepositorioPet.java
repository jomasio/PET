package br.com.pet.dados;

import org.apache.log4j.Logger;

import br.com.pet.negocio.Animais;
import br.com.pet.util.UtilGUI;

public class RepositorioPet extends Conexao {
	
	private static Logger Log = Logger.getLogger(RepositorioPet.class);
	
	private String sql = "";

	public RepositorioPet() {
		
	}

	public boolean salvarPET(Animais animal)  {
		openBD();
		
		Log.debug("Salvando Animal no Banco: "+animal);
		
		boolean retorno = false;
		
		try{
			sql = "INSERT INTO main.Animal(nome,idade, tipo, preco, data_entrada, data_saida) VALUES (?,?,?,?,?,?)";

			prstm = conexao.prepareStatement(sql);
			prstm.setString(1, animal.getNome());
			prstm.setString(2, animal.getIdade());
			prstm.setString(3, animal.getTipo());
			prstm.setString(4, animal.getPreco());
			prstm.setString(5, animal.getDataDeEntrada());
			prstm.setString(6, animal.getDataDeSaida());
	
			prstm.executeUpdate();
			retorno = true;
			
			Log.debug("Animal salva com sucesso: ");
			
		}catch(Exception e){
			UtilGUI.errorMessage("Erro ao Cadastrar o Animal: \n\nRazão:"+e.getMessage());
			Log.error("Erro ao Cadastrar o Animal: "+e.getMessage());
		} 
		
		return retorno;
	}

}
