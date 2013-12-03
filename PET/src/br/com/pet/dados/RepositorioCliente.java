package br.com.pet.dados;

import org.apache.log4j.Logger;

import br.com.pet.negocio.Cliente;
import br.com.pet.util.UtilGUI;

public class RepositorioCliente extends Conexao {
	
	private static Logger Log = Logger.getLogger(RepositorioCliente.class);
	
	private String sql = "";

	public RepositorioCliente() {
		
	}

	public boolean salvarCLIENTE(Cliente novoCliente) throws Exception {
		openBD();
		 boolean retorno = false;
		
		try{
			sql = "INSERT INTO main.Cliente(nome,endereco,bairro,cidade,estado,cep,cpf,sexo,Tel)VALUES(?,?,?,?,?,?,?,?,?)";

			prstm = conexao.prepareStatement(sql);
			prstm.setString(1, novoCliente.getNome());
			prstm.setString(2, novoCliente.getendereco());
			prstm.setString(3, novoCliente.getBairro());
			prstm.setString(4, novoCliente.getCidade());
			prstm.setString(5, novoCliente.getEstado());
			prstm.setString(6, novoCliente.getCep());
			prstm.setString(7, novoCliente.getCpf());
			prstm.setString(8, novoCliente.getSexo());
			prstm.setString(9, novoCliente.getTel());

			prstm.executeUpdate();
			retorno = true;
			
		}catch(Exception e){
			UtilGUI.errorMessage("Erro ao Cadastrar o Cliente: \n\nRazão:"+e.getMessage());
			Log.error("Erro ao Cadastrar o Cliente: "+e.getMessage());
		}
		
		return retorno;
	
	}

}
