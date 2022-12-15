package br.com.barbearia.view;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaClienteView extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textNome;
	private JTextField textTelefone;
	private JTextField textEndereco;
	private JTextField textField;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public TelaClienteView() {
		//setVisible(true);
		setBackground(Color.LIGHT_GRAY);
		setBounds(298, 0, 1072, 749);
		setLayout(null);
		
		JLabel lblNome = new JLabel("Nome*");
		lblNome.setFont(new Font("Segoe Print", Font.BOLD, 11));
		lblNome.setBounds(23, 82, 214, 14);
		add(lblNome);
		
		textNome = new JTextField();
		textNome.setBounds(23, 107, 272, 20);
		add(textNome);
		textNome.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone*");
		lblTelefone.setFont(new Font("Segoe Print", Font.BOLD, 11));
		lblTelefone.setBounds(23, 138, 214, 14);
		add(lblTelefone);
		
		textTelefone = new JTextField();
		textTelefone.setBounds(23, 165, 272, 20);
		add(textTelefone);
		textTelefone.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endereço");
		lblEndereco.setFont(new Font("Segoe Print", Font.BOLD, 11));
		lblEndereco.setBounds(23, 196, 214, 14);
		add(lblEndereco);
		
		textEndereco = new JTextField();
		textEndereco.setBounds(23, 221, 272, 20);
		add(textEndereco);
		textEndereco.setColumns(10);
		
		JLabel lblDataNasc = new JLabel("Data Nascimento");
		lblDataNasc.setFont(new Font("Segoe Print", Font.BOLD, 11));
		lblDataNasc.setBounds(23, 252, 121, 14);
		add(lblDataNasc);
		
		textField = new JTextField();
		textField.setBounds(23, 277, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(306, 82, 582, 440);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setForeground(Color.WHITE);
		btnAdicionar.setBackground(Color.DARK_GRAY);
		btnAdicionar.setFont(new Font("Segoe Print", Font.BOLD, 11));
		btnAdicionar.setBounds(23, 336, 89, 23);
		add(btnAdicionar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setForeground(Color.WHITE);
		btnEditar.setBackground(Color.DARK_GRAY);
		btnEditar.setFont(new Font("Segoe Print", Font.BOLD, 11));
		btnEditar.setBounds(23, 415, 89, 23);
		add(btnEditar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setForeground(Color.WHITE);
		btnBuscar.setBackground(Color.DARK_GRAY);
		btnBuscar.setFont(new Font("Segoe Print", Font.BOLD, 11));
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscar.setBounds(165, 336, 89, 23);
		add(btnBuscar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setForeground(Color.WHITE);
		btnExcluir.setBackground(Color.DARK_GRAY);
		btnExcluir.setFont(new Font("Segoe Print", Font.BOLD, 11));
		btnExcluir.setBounds(165, 415, 89, 23);
		add(btnExcluir);

	}
}
