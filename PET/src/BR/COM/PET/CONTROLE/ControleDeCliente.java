package BR.COM.PET.CONTROLE;

import BR.COM.PET.DADOS.RepositorioCliente;
import BR.COM.PET.NEGOCIO.Cliente;

public class ControleDeCliente {

	private RepositorioCliente repCliente;

	public ControleDeCliente() {
		repCliente = new RepositorioCliente();
	}
	
	public void salvarCLIENTE(Cliente novoCliente)throws Exception{
	
		this.repCliente.salvarCLIENTE(novoCliente);
	}
	
}
