package br.com.pet.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.UIManager;

import java.awt.Toolkit;

import javax.swing.JLabel;

import br.com.pet.dados.RepositorioCliente;
import br.com.pet.dados.RepositorioPet;
import br.com.pet.negocio.Animais;
import br.com.pet.negocio.Cliente;
import br.com.pet.util.UtilGUI;

import java.awt.Font;

import javax.swing.JComboBox;

public class TelaCadastroPet extends JFrame {

	private JPanel contentPane;
	private final JTextField textNome = new JTextField();
	private JTextField textIdade;
	private JTextField textpreco;
	private JTextField textDataDeEntrada;
	private JTextField textDataDeSaida;
	private final JLabel lblNome = new JLabel("Nome");
	private JButton btnCancelar ;
	private TrataEvento tratadorEventos;
	private JButton btnSalvar;
	private JComboBox cbTipo;
	
	private RepositorioPet repo;
			
	private void init(){
		repo = new RepositorioPet();
		tratadorEventos = new TrataEvento();
	}
	
	public TelaCadastroPet() {
		
		init();
		
		setResizable(false);
		setForeground(Color.GREEN);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\jomasio\\Saved Games\\Pictures\\animais domesticos1.jpg"));
		setBackground(new Color(255, 0, 0));
		setTitle("CADASTRO DE PET");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setForeground(UIManager.getColor("InternalFrame.activeTitleBackground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		textNome.setBounds(50, 53, 341, 31);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		textIdade = new JTextField();
		textIdade.setBounds(50, 95, 108, 20);
		contentPane.add(textIdade);
		textIdade.setColumns(10);
		
		textpreco = new JTextField();
		textpreco.setBounds(50, 123, 108, 20);
		contentPane.add(textpreco);
		textpreco.setColumns(10);
		
		textDataDeEntrada = new JTextField();
		textDataDeEntrada.setBounds(107, 163, 80, 20);
		contentPane.add(textDataDeEntrada);
		textDataDeEntrada.setColumns(10);
		
		textDataDeSaida = new JTextField();
		textDataDeSaida.setBounds(290, 163, 98, 20);
		contentPane.add(textDataDeSaida);
		textDataDeSaida.setColumns(10);
		lblNome.setBounds(10, 53, 98, 31);
		contentPane.add(lblNome);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(10, 95, 46, 14);
		contentPane.add(lblIdade);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(236, 126, 46, 14);
		contentPane.add(lblTipo);
		
		JLabel lblPreco = new JLabel("Preco");
		lblPreco.setBounds(10, 129, 46, 14);
		contentPane.add(lblPreco);
		
		JLabel lblDataDeEntrada = new JLabel("Data De Entrada");
		lblDataDeEntrada.setBounds(10, 169, 98, 14);
		contentPane.add(lblDataDeEntrada);
		
		JLabel lblDataDeSaida = new JLabel("Data De Saida");
		lblDataDeSaida.setBounds(200, 169, 98, 14);
		contentPane.add(lblDataDeSaida);
		
		btnSalvar = new JButton("SALVAR");
		btnSalvar.setBounds(96, 209, 89, 23);
		btnSalvar.addActionListener(tratadorEventos);
		contentPane.add(btnSalvar);
		
		btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBounds(236, 208, 98, 24);
		btnCancelar.addActionListener(tratadorEventos);
		contentPane.add(btnCancelar);
		
		JLabel lblNewLabel_6 = new JLabel("CACHORROS E GATOS");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(24, 11, 330, 28);
		contentPane.add(lblNewLabel_6);
		
		String[] tipos= {"Cachorro","Gato"};
		cbTipo = new JComboBox(tipos);
		cbTipo.setBounds(290, 123, 98, 20);
		contentPane.add(cbTipo);
	}
	
	
	private class TrataEvento implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent evento) {
			
			if(evento.getSource() == btnSalvar){
				Animais animal = new Animais();
				animal.setNome(textNome.getText());
				animal.setIdade(textIdade.getText());
				animal.setTipo(cbTipo.getSelectedItem().toString());
				animal.setPreco(textpreco.getText());
				animal.setDataDeEntrada(textDataDeEntrada.getText());

				if(repo.salvarPET(animal)){
					UtilGUI.successMessage("Pet cadastrado com sucesso");
					dispose();
				}
							
			}if(evento.getSource() == btnCancelar){
				dispose();
			}
			
		}
		
		
	}
	
	/**
	 * Somente para Teste. Deletar na versão final
	 */
	@Deprecated
	private void preencherCampos() {
		
		  textNome.setText("Totó");
		  textIdade.setText("1");
		  textpreco.setText("R$ 200,00");;
		  textDataDeEntrada.setText("11/04/2013");
		
	}
	
	public static void main(String[] args) {
		TelaCadastroPet telaCadastroPet = new TelaCadastroPet();
		telaCadastroPet.preencherCampos();
		telaCadastroPet.setVisible(true);
	}
}
