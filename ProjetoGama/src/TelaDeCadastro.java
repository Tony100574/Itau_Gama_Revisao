import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaDeCadastro extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5746898893894438480L;

	/**
	 * 
	 */
	

	Dados dados = new Dados();

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeCadastro frame = new TelaDeCadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaDeCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lbTitulo = new JLabel("Cadastro de Clientes");
		lbTitulo.setBackground(Color.ORANGE);
		lbTitulo.setForeground(Color.BLUE);
		panel.add(lbTitulo, "4, 2, center, default");
		
		JLabel lbAg = new JLabel("Agencia:");
		panel.add(lbAg, "2, 4, right, default");
		
		textField = new JTextField();
		panel.add(textField, "4, 4, fill, default");
		textField.setColumns(10);
		
		JLabel lbNome = new JLabel("Conta:");
		panel.add(lbNome, "2, 6, right, default");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		panel.add(textField_1, "4, 6, fill, default");
		
		JLabel lbNome_1 = new JLabel("Nome:");
		panel.add(lbNome_1, "2, 8, right, default");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel.add(textField_2, "4, 8, fill, default");
		
		JLabel lbEmail= new JLabel("E-mail:");
		panel.add(lbEmail, "2, 10, right, default");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		panel.add(textField_3, "4, 10, fill, default");
		
		JLabel lbTelefone = new JLabel("Telefone:");
		panel.add(lbTelefone, "2, 12, right, default");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		panel.add(textField_4, "4, 12, fill, default");
		
		JLabel lbSaldo = new JLabel("Saldo:");
		panel.add(lbSaldo, "2, 14, right, default");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		panel.add(textField_5, "4, 14, fill, default");
		
		JLabel lbTotalClientes = new JLabel("0 Clientes Cadastrados");
		panel.add(lbTotalClientes, "4, 16");
		
		JButton btnNewButton = new JButton("Adicionar Cliente");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String ag = textField.getText();
				String conta = textField_1.getText();
				String nome = textField_2.getText();
				String email = textField_3.getText();
				String telefone = textField_4.getText();
				String saldo = textField_5.getText();
				
				Clientes c = new Clientes(ag,conta,nome,email,telefone,saldo);
				
				dados.cadastrarCliente(c);
				
				lbTotalClientes.setText(dados.numeroDeContas());
				
				System.out.println(c);
			}
		});
		panel.add(btnNewButton, "4, 18, right, default");
	}

}
