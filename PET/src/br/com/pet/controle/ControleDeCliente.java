package br.com.pet.controle;

import br.com.pet.dados.RepositorioCliente;
import br.com.pet.negocio.Cliente;

public class ControleDeCliente {

	private RepositorioCliente repCliente;

	public ControleDeCliente() {
		repCliente = new RepositorioCliente();
	}
	
	public void salvarCLIENTE(Cliente novoCliente)throws Exception{
	
		this.repCliente.salvarCLIENTE(novoCliente);
	}
	
}
