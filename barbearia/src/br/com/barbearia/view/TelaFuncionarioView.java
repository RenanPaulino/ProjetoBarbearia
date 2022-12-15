package br.com.barbearia.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTable;

@SuppressWarnings("serial")
public class TelaFuncionarioView extends JPanel {
	private JTextField textNome;
	private JTextField textCpf;
	private JTextField textEndereco;
	private JTextField textTelefone;
	private JTextField textFuncao;
	private JTextField textRg;
	private JTextField textCtps;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public TelaFuncionarioView() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		setBounds(300, 0, 1070, 749);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Segoe Print", Font.BOLD, 11));
	//	lblNome.setBounds(45, 98, 46, 14);
		add(lblNome);
		
		textNome = new JTextField();
		textNome.setBounds(45, 113, 189, 20);
		add(textNome);
		textNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Segoe Print", Font.BOLD, 11));
		lblCpf.setBounds(45, 144, 46, 14);
		add(lblCpf);
		
		textCpf = new JTextField();
		textCpf.setBounds(45, 159, 189, 20);
		add(textCpf);
		textCpf.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endereço");
		lblEndereco.setFont(new Font("Segoe Print", Font.BOLD, 11));
		lblEndereco.setBounds(45, 190, 46, 14);
		add(lblEndereco);
		
		textEndereco = new JTextField();
		textEndereco.setBounds(45, 204, 189, 20);
		add(textEndereco);
		textEndereco.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setFont(new Font("Segoe Print", Font.BOLD, 11));
		lblTelefone.setBounds(45, 235, 46, 14);
		add(lblTelefone);
		
		textTelefone = new JTextField();
		textTelefone.setBounds(45, 250, 189, 20);
		add(textTelefone);
		textTelefone.setColumns(10);
		
		JLabel lblFuncao = new JLabel("Função");
		lblFuncao.setFont(new Font("Segoe Print", Font.BOLD, 11));
		lblFuncao.setBounds(45, 281, 46, 14);
		add(lblFuncao);
		
		textFuncao = new JTextField();
		textFuncao.setBounds(45, 297, 189, 20);
		add(textFuncao);
		textFuncao.setColumns(10);
		
		JLabel lblRg = new JLabel("Numero Registro (RG)");
		lblRg.setFont(new Font("Segoe Print", Font.BOLD, 11));
		lblRg.setBounds(45, 328, 123, 14);
		add(lblRg);
		
		textRg = new JTextField();
		textRg.setBounds(45, 342, 189, 20);
		add(textRg);
		textRg.setColumns(10);
		
		JLabel lblCtps = new JLabel("CTPS");
		lblCtps.setFont(new Font("Segoe Print", Font.BOLD, 11));
		lblCtps.setBounds(45, 373, 46, 14);
		add(lblCtps);
		
		textCtps = new JTextField();
		textCtps.setBounds(45, 387, 189, 20);
		add(textCtps);
		textCtps.setColumns(10);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setForeground(Color.WHITE);
		btnAdicionar.setBackground(Color.DARK_GRAY);
		btnAdicionar.setFont(new Font("Segoe Print", Font.BOLD, 11));
		btnAdicionar.setBounds(45, 471, 89, 23);
		add(btnAdicionar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setForeground(Color.WHITE);
		btnBuscar.setBackground(Color.DARK_GRAY);
		btnBuscar.setFont(new Font("Segoe Print", Font.BOLD, 11));
		btnBuscar.setBounds(207, 471, 89, 23);
		add(btnBuscar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setForeground(Color.WHITE);
		btnEditar.setBackground(Color.DARK_GRAY);
		btnEditar.setFont(new Font("Segoe Print", Font.BOLD, 11));
		btnEditar.setBounds(45, 548, 89, 23);
		add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setForeground(Color.WHITE);
		btnExcluir.setBackground(Color.DARK_GRAY);
		btnExcluir.setFont(new Font("Segoe Print", Font.BOLD, 11));
		btnExcluir.setBounds(207, 548, 89, 23);
		add(btnExcluir);
		
		table = new JTable();
		table.setBounds(405, 98, 616, 309);
		add(table);

	}
}
