package br.com.pet.util;

import java.sql.ResultSet;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UtilGUI {

	
	private static Icon successIcon = new ImageIcon("img/ic_msg_success.png");
	private static Icon errorIcon = new ImageIcon("img/ic_msg_error.png");
	
	public UtilGUI() {
		// TODO Auto-generated constructor stub
	}
	
	public final static void successMessage(String message){
		JOptionPane.showMessageDialog(null, message,"Sucesso",0,successIcon);
	}
	
	public final static void errorMessage(String message){
		
		JOptionPane.showMessageDialog(null, message,"Erro",0,errorIcon);

	}

	public static Map<String, String> getMapFromResultSet(ResultSet rs) {
		// TODO Auto-generated method stub
		return null;
	}

	public static DefaultTableModel buildTableModel(ResultSet rs) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void printArray(String[] valores) {
		// TODO Auto-generated method stub
		
	}

}
