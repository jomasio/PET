package br.com.pet.negocio;

import javax.swing.JOptionPane;

public class Vendas {
	private String Clientes;
	private String Valor ;
	private String DataDaVenda;
	private String Animais;
	
	
    
	
	public Vendas(String clientes, String valor, String dataDaVenda,
			String animais) {
		super();
		Clientes = clientes;
		Valor = valor;
		DataDaVenda = dataDaVenda;
		Animais = animais;
	}
	
	public Vendas(){
		
    }
	public String getClientes() {
		return Clientes;
	}
	public void setClientes(String clientes) {
		Clientes = clientes;
	}
	public String getValor() {
		return Valor;
	}
	public void setValor(String valor) {
		Valor = valor;
	}
	public String getDataDaVenda() {
		return DataDaVenda;
	}
	public void setDataDaVenda(String dataDaVenda) {
		DataDaVenda = dataDaVenda;
	}


	public String getAnimais() {
		return Animais;
	}


	public void setAnimais(String animais) {
		Animais = animais;
	}

	
	
	
}
