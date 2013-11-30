package GUI;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SwingUtilities;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class MainGUI extends JFrame {
	private TratarEvento eventos;
	private JButton btnCadastrarCliente ;
	private JButton btnCadastrarPet;
	private JButton btnVenda;
	private JButton btnVisualizarHistorico;
	public MainGUI() {
		
		eventos = new TratarEvento();
		getContentPane().setLayout(new BorderLayout(0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		PainelHome backPanel = new PainelHome();
		getContentPane().add(backPanel);
		backPanel.setLayout(null);
		
	    btnCadastrarCliente = new JButton("Cadastrar Cliente");
		btnCadastrarCliente.setIcon(new ImageIcon("img/ib_cadastrar_usuario.png"));
		btnCadastrarCliente.setHorizontalTextPosition(SwingUtilities.CENTER);
		btnCadastrarCliente.setVerticalTextPosition(SwingUtilities.BOTTOM);
		btnCadastrarCliente.setBounds(59, 50, 128, 98);
		btnCadastrarCliente.addActionListener(eventos);
		backPanel.add(btnCadastrarCliente);
		
		btnCadastrarPet = new JButton("Cadastrar Pet");
		btnCadastrarPet.addActionListener(new TratarEvento()) ;
		btnCadastrarPet.setIcon(new ImageIcon("img/ib_cadastrarPet.png"));
		btnCadastrarPet.setHorizontalTextPosition(SwingUtilities.CENTER);
		btnCadastrarPet.setVerticalTextPosition(SwingUtilities.BOTTOM);
		btnCadastrarPet.setBounds(262, 51, 128, 97);
		btnCadastrarPet.addActionListener(eventos);
		backPanel.add(btnCadastrarPet);
		
	    btnVenda = new JButton("Venda");
		btnVenda.setIcon(new ImageIcon("img/ib_loja.png"));
		btnVenda.setHorizontalTextPosition(SwingUtilities.CENTER);
		btnVenda.setVerticalTextPosition(SwingUtilities.BOTTOM);
		btnVenda.setBounds(59, 208, 128, 98);
		btnVenda.addActionListener(eventos);
		backPanel.add(btnVenda);
		
		btnVisualizarHistorico = new JButton("Visualizar Hist\u00F3rico");
		btnCadastrarCliente.addActionListener(new TratarEvento());
		btnVisualizarHistorico.setIcon(new ImageIcon("img/ib_visualizarHistorico.png"));
		btnVisualizarHistorico.setHorizontalTextPosition(SwingUtilities.CENTER);
		btnVisualizarHistorico.setVerticalTextPosition(SwingUtilities.BOTTOM);
		btnVisualizarHistorico.setBounds(262, 208, 128, 98);
		btnVisualizarHistorico.addActionListener(eventos);
		backPanel.add(btnVisualizarHistorico);
		
		setSize(471,390);
	}
	
	private class TratarEvento implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
               if(e.getSource() ==  btnCadastrarCliente){
				
			/**	if(cadastro_cliente == null){
					cadastro_cliente = new CadastroDeClientes();
					cadastro_cliente.setContoller(new CCadastroCliente());
					cadastro_cliente.setModal(true);
					cadastro_cliente.preencherCampos();
					cadastro_cliente.setVisible(true);
					cadastro_cliente = null;
				}*/
            	   telacadastroCliente telaCliente = new telacadastroCliente();
            	   telaCliente.setVisible(true);
            	   System.out.println("Clientecadastrado");
			// TODO Auto-generated method stub
			
		}if(e.getSource()==  btnCadastrarPet){
			TelaCadastroPet telaPet = new TelaCadastroPet();
			telaPet.setVisible(true);
		}
            
		
		}
		
	}
		
	
	public static void main(String[] args) {
		
		new MainGUI().setVisible(true);

		
	}
}
