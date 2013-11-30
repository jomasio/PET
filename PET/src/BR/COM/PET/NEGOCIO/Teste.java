package BR.COM.PET.NEGOCIO;

import javax.swing.JOptionPane;

import BR.COM.PET.DADOS.Conexao;
import BR.COM.PET.DADOS.RepositorioCliente;

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
