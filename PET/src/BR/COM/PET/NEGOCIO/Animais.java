package BR.COM.PET.NEGOCIO;

public class Animais {
	/**O sistema deve permitir o cadastro de novos animais. 
	As principais informa��es s�o: nome (se existir),
	idade, tipo de animal (c�o e gato), pre�o, data de entrada, 
	data de sa�da (Se o animal j� estiver sido vendido). Al�m disso,
	todos os animais devem ter fotos para que seja f�cil identifica-lo. 
**/
	//atributos 
	private String Nome;
	private String Idade;
	private String Tipo;
	private String Preco;
	private String DataDeEntrada;
	private String DataDeSaida;
	
	//construtores
	
	public Animais (){
		
	}
	public Animais(String nome, String idade, String tipo, String preco,
			String dataDeEntrada, String dataDeSaida) {
		
		Nome = nome;
		Idade = idade;
		Tipo = tipo;
		Preco = preco;
		DataDeEntrada = dataDeEntrada;
		DataDeSaida = dataDeSaida;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getIdade() {
		return Idade;
	}
	public void setIdade(String idade) {
		Idade = idade;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public String getPreco() {
		return Preco;
	}
	public void setPreco(String preco) {
		Preco = preco;
	}
	public String getDataDeEntrada() {
		return DataDeEntrada;
	}
	public void setDataDeEntrada(String dataDeEntrada) {
		DataDeEntrada = dataDeEntrada;
	}
	public String getDataDeSaida() {
		return DataDeSaida;
	}
	public void setDataDeSaida(String dataDeSaida) {
		DataDeSaida = dataDeSaida;
	}
	
	
	
	
}
