package br.com.pet.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.pet.controle.ControleDeCliente;
import br.com.pet.dados.RepositorioCliente;
import br.com.pet.negocio.Cliente;
import br.com.pet.util.UtilGUI;

public class TelacadastroCliente extends JFrame {

	private JPanel contentPane;
	private ControleDeCliente controle = new ControleDeCliente();
	private JTextField textnome;
	private JTextField textendereco;
	private JTextField textbairro;
	private JTextField textcidade;
	private JTextField texttel;
	private JTextField textestado;
	private JTextField textcep;
	private JTextField textsexo;
	private JButton btnSalvar;
	private JTextField textField;
	private JButton btnCancelar;
	private TrataEvento eventos;
	

	public TelacadastroCliente() {
		
		eventos = new TrataEvento();
		
		setTitle("Cadastro De Cliente");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\jomasio\\Saved Games\\Pictures\\animais domesticos1.jpg"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(105, 105, 105));
		contentPane.setForeground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(44, 111, -11, 30);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("estado");
		btnNewButton_4.setBounds(0, 130, 45, -3);
		contentPane.add(btnNewButton_4);
		
		textnome = new JTextField();
		textnome.setBounds(64, 56, 172, 20);
		contentPane.add(textnome);
		textnome.setColumns(10);
		
		textendereco = new JTextField();
		textendereco.setBounds(64, 90, 280, 20);
		contentPane.add(textendereco);
		textendereco.setColumns(10);
		
		textbairro = new JTextField();
		textbairro.setBounds(64, 121, 127, 20);
		contentPane.add(textbairro);
		textbairro.setColumns(10);
		
		textcidade = new JTextField();
		textcidade.setBounds(255, 118, 153, 23);
		contentPane.add(textcidade);
		textcidade.setColumns(10);
		
		texttel = new JTextField();
		texttel.setBounds(255, 152, 127, 20);
		contentPane.add(texttel);
		texttel.setColumns(10);
		
		textestado = new JTextField();
		textestado.setBounds(65, 152, 86, 20);
		contentPane.add(textestado);
		textestado.setColumns(10);
		
		textcep = new JTextField();
		textcep.setBounds(64, 183, 101, 20);
		contentPane.add(textcep);
		textcep.setColumns(10);
		
		textsexo = new JTextField();
		textsexo.setBounds(255, 183, 86, 20);
		contentPane.add(textsexo);
		textsexo.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(22, 59, 46, 14);
		contentPane.add(lblNome);
		
		JLabel textEndereco = new JLabel("Endereco:");
		textEndereco.setBounds(11, 87, 79, 30);
		contentPane.add(textEndereco);
		
		JLabel textBairro = new JLabel("Bairro:");
		textBairro.setBounds(32, 121, 48, 20);
		contentPane.add(textBairro);
		
		JLabel textCidade = new JLabel("   Cidade:");
		textCidade.setBounds(200, 118, 69, 23);
		contentPane.add(textCidade);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(22, 152, 46, 14);
		contentPane.add(lblEstado);
		
		JLabel lblCep = new JLabel("Cep:");
		lblCep.setBounds(223, 183, 56, 14);
		contentPane.add(lblCep);
		
		JLabel lblTel = new JLabel("Tel:");
		lblTel.setBounds(44, 186, 46, 14);
		contentPane.add(lblTel);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(223, 155, 46, 14);
		contentPane.add(lblSexo);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(61, 229, 89, 23);
		btnSalvar.addActionListener(eventos);
		contentPane.add(btnSalvar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(223, 229, 89, 23);
		btnCancelar.addActionListener(eventos);
		contentPane.add(btnCancelar);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 48);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCadastroDeCliente = new JLabel(" Cliente");
		lblCadastroDeCliente.setFont(new Font("Verdana", Font.PLAIN, 27));
		lblCadastroDeCliente.setBounds(51, 11, 310, 26);
		panel.add(lblCadastroDeCliente);
		
		textField = new JTextField();
		textField.setBounds(298, 56, 126, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblcpf = new JLabel("      CPF :");
		lblcpf.setBounds(246, 59, 46, 14);
		contentPane.add(lblcpf);
		
	}
	private class TrataEvento implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent evento) {
			
			if(evento.getSource() == btnSalvar){
				
				RepositorioCliente repoCliente = new RepositorioCliente();
				
				Cliente c = new Cliente();
				
				try {
					
					c.setBairro(textbairro.getText());
					c.setCidade(textcidade.getText());
					c.setCep(textcep.getText());
					c.setCpf(textcep.getText());
					c.setEndereco(textendereco.getText());
					c.setEstado(textestado.getText());
					c.setNome(textnome.getText());
					c.setSexo(textsexo.getText());
					c.setTel(texttel.getText());
					
					if( repoCliente.salvarCLIENTE(c) ){
						UtilGUI.successMessage("O Cliente foi cadastrado com sucesso.");
						dispose();
					}
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}if(evento.getSource() == btnCancelar){
				dispose();
			}
			
		}
		
		
	}
	
	/**
	 * Somente para Teste. Deletar na vers�o final
	 */
	@Deprecated
	private void preencherCampos() {
		
		textbairro.setText("CDU");
		textcidade.setText("Recife");
		textcep.setText("678906-235");
		textendereco.setText("Passagem Lindalva");
		textestado.setText("Pernambuco");
		textnome.setText("Fulano da Silva");
		textsexo.setText("Masculino");
		texttel.setText("(81) 8767-7657");
		
	}
	
	public static void main(String[] args) {
		TelacadastroCliente telacadastroCliente = new TelacadastroCliente();
		telacadastroCliente.preencherCampos();
		telacadastroCliente.setVisible(true);
	}
}
