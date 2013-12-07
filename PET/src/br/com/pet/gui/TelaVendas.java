package br.com.pet.gui;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

import br.com.pet.controle.ControleDeVendas;
import br.com.pet.dados.RepositorioPet;
import br.com.pet.dados.RepositorioVendas;

import br.com.pet.negocio.Animais;
import br.com.pet.negocio.Vendas;
import br.com.pet.util.UtilGUI;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class TelaVendas extends JFrame {
	private JPanel panel;
	private JTextField textClientes;
	private JTextField textValor;
	private JTextField textDataDeVendas;
	private JTextField textAnimais;
	private JButton buscarcliente;
	private JButton buscaranimias;
	private JButton salvar;
	private JButton cancelar;

	private TratadorEventos eventos;

	public void Init() {
		eventos = new TratadorEventos();
	}

	private RepositorioVendas repo;

	private void init() {
		repo = new RepositorioVendas();

	}

	public TelaVendas() {

		init();

		getContentPane().setBackground(Color.GRAY);
		setIconImage(Toolkit
				.getDefaultToolkit()
				.getImage(
						"C:\\Users\\jomasio\\Saved Games\\Pictures\\animais domesticos1.jpg"));
		setTitle("Tela de Vendas");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 778, 488);

		textClientes = new JTextField();
		textClientes.setBounds(126, 75, 259, 20);
		textClientes.setColumns(10);

		textValor = new JTextField();
		textValor.setBounds(126, 142, 163, 20);
		textValor.setColumns(10);

		textDataDeVendas = new JTextField();
		textDataDeVendas.setBounds(126, 215, 163, 20);
		textDataDeVendas.setColumns(10);

		textAnimais = new JTextField();
		textAnimais.setBounds(126, 289, 259, 20);
		textAnimais.setColumns(10);

		JButton btnSALVAR = new JButton("SALVAR");
		btnSALVAR.setBounds(155, 373, 81, 23);
		btnSALVAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JButton btnCANCELAR = new JButton("CANCELAR");
		btnCANCELAR.setBounds(357, 373, 85, 23);
		btnCANCELAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JLabel lblClientes = new JLabel("Clientes");
		lblClientes.setBounds(21, 78, 62, 14);

		JLabel lblValor = new JLabel("Valor");
		lblValor.setBounds(45, 145, 71, 14);

		JLabel lblAnimais = new JLabel("Animais");
		lblAnimais.setBounds(33, 292, 71, 14);

		JLabel lblDataDeVendas = new JLabel("DataDeVendas");
		lblDataDeVendas.setBounds(21, 218, 95, 14);

		JLabel lblVENDASPET = new JLabel("VENDAS PET SHOP");
		lblVENDASPET.setBounds(126, 24, 579, 22);
		lblVENDASPET.setFont(new Font("Arial", Font.PLAIN, 18));
		getContentPane().setLayout(null);
		getContentPane().add(lblClientes);
		getContentPane().add(lblValor);
		getContentPane().add(lblVENDASPET);
		getContentPane().add(textClientes);
		getContentPane().add(lblAnimais);
		getContentPane().add(textAnimais);
		getContentPane().add(btnSALVAR);
		getContentPane().add(textValor);
		getContentPane().add(lblDataDeVendas);
		getContentPane().add(textDataDeVendas);
		getContentPane().add(btnCANCELAR);

		JButton btnbuscarCliente = new JButton("Buscar");
		btnbuscarCliente.setBounds(395, 74, 89, 23);
		getContentPane().add(btnbuscarCliente);

		JButton btnBuscarAnimais = new JButton("Buscar");
		btnBuscarAnimais.setBounds(395, 288, 89, 23);
		getContentPane().add(btnBuscarAnimais);

		JButton btnsalvar = new JButton("SALVAR");
		btnsalvar.setBounds(126, 320, 89, 23);
		getContentPane().add(btnsalvar);

		JButton btncancelar = new JButton("CANCELAR");
		btncancelar.setBounds(301, 320, 89, 23);
		getContentPane().add(btncancelar);

	}

	public class TratadorEventos implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			if (e.getSource() == buscarcliente
					&& !textClientes.getText().equals("")) {

				UtilGUI.successMessage("vendas cadastrado com sucesso");
				dispose();

			}
			if (e.getSource() == cancelar) {
				dispose();

			}
		}
	}
}
