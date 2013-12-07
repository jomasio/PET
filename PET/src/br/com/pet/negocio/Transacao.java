package br.com.pet.negocio;

import java.util.HashMap;
import java.util.Map;

public class Transacao {
	

		private int idCliente; 
		private Map<String,Integer> transacoes;
		
		public Transacao(int idCliente) {
			super();
			this.idCliente = idCliente;
		}

		public Transacao() {
			transacoes = new HashMap<>();
			// TODO Auto-generated constructor stub
		}

		
		public void addAnimais(String nome, int id){
			transacoes.put(nome, id);
			
		}
		
		public void removeAnimais(String key){
			transacoes.remove(key);
		}

		public void setIdCliente(int idCliente) {
			this.idCliente = idCliente;
		}
		
		public int getIdCliente() {
			return idCliente;
		}

		public int[] getAnimaisIds() {
			
			int array[] = new int[transacoes.size()];
			int i = 0;
			for (Object name: transacoes.keySet()){
				 array[i++] = (int)transacoes.get(name);
			}
			
			return array;
		}

		
		@Override
		public String toString() {
			
			StringBuilder out = new StringBuilder();
			for (Object name: transacoes.keySet()){
	            out.append(String.format("Cliente Id: [%s] = Animais Id: %s", name.toString(),transacoes.get(name).toString() ));
			}
			
			return out.toString();
		}
		
		public String[] getCampos() {
			String campos[] = {"Nome","valor"," animais","data"};
			return campos;
		}
		
	}



