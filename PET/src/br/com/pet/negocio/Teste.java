package br.com.pet.negocio;

import javax.swing.JOptionPane;

import br.com.pet.dados.Conexao;
import br.com.pet.dados.RepositorioCliente;

public class Teste {

	public static void main(String[] args) {

		Conexao c = new Conexao();

		RepositorioCliente repCl = new RepositorioCliente();

		Cliente cliente = new Cliente("dmd", "erdm", "edkjf", "vcv", "fsv", "as", "sd",
				"ds", "dsf");
		

		try {
			repCl.salvarCLIENTE(cliente);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

}
