package BR.COM.PET.DADOS;

import BR.COM.PET.NEGOCIO.Cliente;

public class RepositorioCliente extends Conexao{
private String sql = "";

public RepositorioCliente() {
	
}
public void salvarCLIENTE(Cliente novoCliente)throws Exception{
	openBD();
	
	if(novoCliente != null){
		
		sql = "INSERT INTO main.Cliente(nome,endereco,bairro,cidade,estado,cep,telefone,cpf,sexo)VALUES(?,?,?,?,?,?,?,?,?)";


		prstm = conexao.prepareStatement(sql);
		prstm.setString(1, novoCliente.getNome());
		prstm.setString(2, novoCliente.getEndereco());
		prstm.setString(3, novoCliente.getBairro());
		prstm.setString(4, novoCliente.getCidade());
		prstm.setString(5, novoCliente.getEstado());
		prstm.setString(6, novoCliente.getCep());
		prstm.setString(7, novoCliente.getTel());
		prstm.setString(8, novoCliente.getCpf());
	        prstm.setString(9, novoCliente.getSexo());
	
		prstm.executeUpdate();
		
		

		throw new Exception("Cliente cadastrado com sucesso!!");
	}
	
}

}
