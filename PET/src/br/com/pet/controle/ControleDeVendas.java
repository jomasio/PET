package br.com.pet.controle;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import org.apache.log4j.Logger;
import br.com.pet.dados.RepositorioVendas;
import br.com.pet.negocio.Transacao;
import br.com.pet.util.UtilGUI;

public class ControleDeVendas {

	private static Logger LOG = Logger.getLogger(ControleDeVendas.class);

	private RepositorioVendas conexao;

	public ControleDeVendas() {
		conexao = new RepositorioVendas();
	}

	public Map<String, String> getClienteInfoById(int parseInt) {

		Map<String, String> resultMap = null;

		ResultSet rs = (ResultSet) conexao.pesquisaComRetorno("clientes",
				"id_cliente", String.valueOf(parseInt), false);

		resultMap = UtilGUI.getMapFromResultSet(rs);

		return resultMap;

	}

	public Map<String, String> getFilmeInfoById(int parseInt) {
		Map<String, String> resultMap = null;

		ResultSet rs = (ResultSet) conexao.pesquisaComRetorno("filmes", "id_filme",
				String.valueOf(parseInt), false);

		resultMap = UtilGUI.getMapFromResultSet(rs);

		return resultMap;
	}

	public boolean cadastrarTransacao(Transacao vendas) {

		LOG.debug("Cadastrando Transação:" + vendas);

		boolean res = false;

		try {
			conexao.salvarvendas(vendas);
			res = true;
		} catch (Exception e) {
			LOG.error("Erro ao cadastrar cliente: " + e.getMessage());
			UtilGUI.errorMessage("Erro ao cadastrar cliente: " + e.getMessage());
		}

		return res;
	}
}
