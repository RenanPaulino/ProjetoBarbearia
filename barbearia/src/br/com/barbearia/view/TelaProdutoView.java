package br.com.barbearia.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;

@SuppressWarnings("serial")
public class TelaProdutoView extends JPanel {
	private JTextField textNome;
	private JTextField textValorPago;
	private JTextField textValorVenda;
	private JTextField textQuantidade;
	private JTextField textDataCompra;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public TelaProdutoView() {
		setBackground(Color.LIGHT_GRAY);
		setBounds(298, 0, 1072, 749);
		setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Segoe Print", Font.BOLD, 11));
		lblNome.setBounds(10, 11, 155, 20);
		add(lblNome);
		
		textNome = new JTextField();
		textNome.setBounds(10, 42, 168, 20);
		add(textNome);
		textNome.setColumns(10);
		
		JLabel lblValorPago = new JLabel("Valor Pago");
		lblValorPago.setFont(new Font("Segoe Print", Font.BOLD, 11));
		lblValorPago.setBounds(10, 73, 168, 14);
		add(lblValorPago);
		
		textValorPago = new JTextField();
		textValorPago.setBounds(10, 98, 170, 20);
		add(textValorPago);
		textValorPago.setColumns(10);
		
		JLabel lblValorVenda = new JLabel("Valor de Venda");
		lblValorVenda.setFont(new Font("Segoe Print", Font.BOLD, 11));
		lblValorVenda.setBounds(10, 129, 168, 14);
		add(lblValorVenda);
		
		textValorVenda = new JTextField();
		textValorVenda.setBounds(10, 154, 172, 20);
		add(textValorVenda);
		textValorVenda.setColumns(10);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setFont(new Font("Segoe Print", Font.BOLD, 11));
		lblQuantidade.setBounds(10, 185, 119, 14);
		add(lblQuantidade);
		
		textQuantidade = new JTextField();
		textQuantidade.setBounds(10, 210, 86, 20);
		add(textQuantidade);
		textQuantidade.setColumns(10);
		
		JLabel lblDataCompra = new JLabel("Data de Compra");
		lblDataCompra.setFont(new Font("Segoe Print", Font.BOLD, 11));
		lblDataCompra.setBounds(10, 241, 119, 14);
		add(lblDataCompra);
		
		textDataCompra = new JTextField();
		textDataCompra.setBounds(10, 269, 86, 20);
		add(textDataCompra);
		textDataCompra.setColumns(10);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setFont(new Font("Segoe Print", Font.BOLD, 11));
		btnAdicionar.setBackground(Color.DARK_GRAY);
		btnAdicionar.setForeground(Color.WHITE);
		btnAdicionar.setBounds(185, 209, 89, 23);
		add(btnAdicionar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Segoe Print", Font.BOLD, 11));
		btnEditar.setBackground(Color.DARK_GRAY);
		btnEditar.setForeground(Color.WHITE);
		btnEditar.setBounds(185, 255, 89, 23);
		add(btnEditar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Segoe Print", Font.BOLD, 11));
		btnBuscar.setBackground(Color.DARK_GRAY);
		btnBuscar.setForeground(Color.WHITE);
		btnBuscar.setBounds(321, 209, 89, 23);
		add(btnBuscar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Segoe Print", Font.BOLD, 11));
		btnExcluir.setBackground(Color.DARK_GRAY);
		btnExcluir.setForeground(Color.WHITE);
		btnExcluir.setBounds(321, 255, 89, 23);
		add(btnExcluir);
		
		table = new JTable();
		table.setBounds(185, 14, 255, 185);
		add(table);

	}
}
