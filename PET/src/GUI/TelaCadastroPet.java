package GUI;

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
import java.awt.Font;

public class TelaCadastroPet extends JFrame {

	private JPanel contentPane;
	private final JButton btnNome = new JButton("Nome");
	private final JTextField textNome = new JTextField();
	private JTextField textIdade;
	private JTextField textTipo;
	private JTextField textpreco;
	private JTextField textDataDeEntrada;
	private JTextField textDataDeSaida;
	private final JLabel lblNome = new JLabel("Nome");
	private final JButton btnCancelar = new JButton("CANCELAR");

	
	public TelaCadastroPet() {
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
		textNome.setBounds(51, 53, 259, 31);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		textIdade = new JTextField();
		textIdade.setBounds(107, 95, 86, 20);
		contentPane.add(textIdade);
		textIdade.setColumns(10);
		
		textTipo = new JTextField();
		textTipo.setBounds(274, 126, 86, 20);
		contentPane.add(textTipo);
		textTipo.setColumns(10);
		
		textpreco = new JTextField();
		textpreco.setBounds(107, 126, 108, 20);
		contentPane.add(textpreco);
		textpreco.setColumns(10);
		
		textDataDeEntrada = new JTextField();
		textDataDeEntrada.setBounds(107, 166, 80, 20);
		contentPane.add(textDataDeEntrada);
		textDataDeEntrada.setColumns(10);
		
		textDataDeSaida = new JTextField();
		textDataDeSaida.setBounds(274, 166, 80, 20);
		contentPane.add(textDataDeSaida);
		textDataDeSaida.setColumns(10);
		lblNome.setBounds(10, 53, 98, 31);
		contentPane.add(lblNome);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(61, 95, 46, 14);
		contentPane.add(lblIdade);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(234, 129, 46, 14);
		contentPane.add(lblTipo);
		
		JLabel lblPreco = new JLabel("Preco");
		lblPreco.setBounds(73, 129, 46, 14);
		contentPane.add(lblPreco);
		
		JLabel lblDataDeEntrada = new JLabel("Data De Entrada");
		lblDataDeEntrada.setBounds(21, 169, 98, 14);
		contentPane.add(lblDataDeEntrada);
		
		JLabel lblDataDeSaida = new JLabel("Data De Saida");
		lblDataDeSaida.setBounds(200, 169, 80, 14);
		contentPane.add(lblDataDeSaida);
		
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.setBounds(96, 209, 89, 23);
		contentPane.add(btnSalvar);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancelar.setBounds(236, 208, 98, 24);
		contentPane.add(btnCancelar);
		
		JLabel lblNewLabel_6 = new JLabel("CACHORROS E GATOS");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(24, 11, 330, 28);
		contentPane.add(lblNewLabel_6);
	}
}
