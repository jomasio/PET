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
	private JTextField textField_5;
	private final JLabel lblNewLabel = new JLabel("Nome");
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
		
		textField_5 = new JTextField();
		textField_5.setBounds(274, 166, 80, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		lblNewLabel.setBounds(10, 53, 98, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Idade");
		lblNewLabel_1.setBounds(61, 95, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tipo");
		lblNewLabel_2.setBounds(234, 129, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Preco");
		lblNewLabel_3.setBounds(73, 129, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Data De Entrada");
		lblNewLabel_4.setBounds(21, 169, 98, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Data De Saida");
		lblNewLabel_5.setBounds(200, 169, 80, 14);
		contentPane.add(lblNewLabel_5);
		
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
