package br.com.barbearia.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;

@SuppressWarnings("serial")
public class TelaServicoView extends JPanel {
	private JTextField textNome;
	private JTextField textValor;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public TelaServicoView() {
		setForeground(Color.WHITE);
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Segoe Print", Font.BOLD, 11));
		lblNome.setBounds(10, 31, 46, 14);
		add(lblNome);
		
		textNome = new JTextField();
		textNome.setBounds(10, 72, 158, 20);
		add(textNome);
		textNome.setColumns(10);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setFont(new Font("Segoe Print", Font.BOLD, 11));
		lblValor.setBounds(10, 124, 135, 14);
		add(lblValor);
		
		textValor = new JTextField();
		textValor.setBounds(10, 149, 158, 20);
		add(textValor);
		textValor.setColumns(10);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setFont(new Font("Segoe Print", Font.BOLD, 11));
		btnAdicionar.setForeground(Color.WHITE);
		btnAdicionar.setBackground(Color.DARK_GRAY);
		btnAdicionar.setBounds(10, 197, 89, 23);
		add(btnAdicionar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Segoe Print", Font.BOLD, 11));
		btnEditar.setForeground(Color.WHITE);
		btnEditar.setBackground(Color.DARK_GRAY);
		btnEditar.setBounds(10, 254, 89, 23);
		add(btnEditar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Segoe Print", Font.BOLD, 11));
		btnBuscar.setForeground(Color.WHITE);
		btnBuscar.setBackground(Color.DARK_GRAY);
		btnBuscar.setBounds(134, 197, 89, 23);
		add(btnBuscar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Segoe Print", Font.BOLD, 11));
		btnExcluir.setForeground(Color.WHITE);
		btnExcluir.setBackground(Color.DARK_GRAY);
		btnExcluir.setBounds(134, 254, 89, 23);
		add(btnExcluir);
		
		table = new JTable();
		table.setBounds(276, 31, 379, 341);
		add(table);

	}

}
