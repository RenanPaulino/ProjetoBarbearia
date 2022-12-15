package br.com.barbearia.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class TelaInicialView {

	private JFrame TelaInicial;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicialView window = new TelaInicialView();
					window.TelaInicial.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaInicialView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		TelaInicial = new JFrame();
		TelaInicial.setExtendedState(Frame.MAXIMIZED_BOTH);
		TelaInicial.setResizable(false);
		TelaInicial.setTitle("LinoSys");
		TelaInicial.setBounds(100, 100, 1386, 788);
		TelaInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TelaInicial.getContentPane().setLayout(null);
		
		//Painel Botoes e Logo
		JPanel painelEsq = new JPanel();
		painelEsq.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		painelEsq.setBackground(Color.DARK_GRAY);
		painelEsq.setBounds(0, 0, 300, 749);
		TelaInicial.getContentPane().add(painelEsq);
		painelEsq.setLayout(null);
		
		//Painel para Abrir Janelas
		JPanel painelJanelas = new JPanel();
		painelJanelas.setBackground(Color.LIGHT_GRAY);
		painelJanelas.setBounds(298, 0, 1072, 749);
		TelaInicial.getContentPane().add(painelJanelas);
		painelJanelas.setLayout(null);
		
		//janelas de outras classes
		TelaClienteView telaCliente = new TelaClienteView();
		TelaFuncionarioView telaFuncionario = new TelaFuncionarioView();
		TelaProdutoView telaProduto = new TelaProdutoView();
		TelaServicoView telaServico = new TelaServicoView();
		TelaCaixaView telaCaixa = new TelaCaixaView();
		TelaAgendaView telaAgenda = new TelaAgendaView();
		TelaPromocoesView telaPromocoes = new TelaPromocoesView();
		
		painelJanelas.add(telaCliente);
		painelJanelas.add(telaAgenda);
		painelJanelas.add(telaCaixa);
		painelJanelas.add(telaFuncionario);
		painelJanelas.add(telaProduto);
		painelJanelas.add(telaPromocoes);
		
		//Butões de menu
		JButton btnAgenda = new JButton("Agenda");
		btnAgenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaAgenda.setSize(painelJanelas.getWidth(), painelJanelas.getHeight() );
				
				telaFuncionario.setVisible(false);
				telaProduto.setVisible(false);
				telaServico.setVisible(false);
			    telaCliente.setVisible(false);
			    telaPromocoes.setVisible(false);
			    telaCaixa.setVisible(false);
			    telaAgenda.setVisible(true);
				
			}
		});
		btnAgenda.setForeground(Color.WHITE);
		btnAgenda.setBackground(Color.DARK_GRAY);
		btnAgenda.setFont(new Font("Segoe Print", Font.BOLD, 14));
		btnAgenda.setBounds(91, 343, 209, 23);
		painelEsq.add(btnAgenda);
		
		JButton btnCaixa = new JButton("Caixa");
		btnCaixa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaCaixa.setSize(painelJanelas.getWidth(), painelJanelas.getHeight() );
		
				telaFuncionario.setVisible(false);
				telaProduto.setVisible(false);
				telaServico.setVisible(false);
			    telaCliente.setVisible(false);
			    telaAgenda.setVisible(false);
			    telaPromocoes.setVisible(false);
			    telaCaixa.setVisible(true);
				
			}
		});
		btnCaixa.setForeground(Color.WHITE);
		btnCaixa.setBackground(Color.DARK_GRAY);
		btnCaixa.setFont(new Font("Segoe Print", Font.BOLD, 14));
		btnCaixa.setBounds(91, 396, 209, 23);
		painelEsq.add(btnCaixa);
		
		JButton btnCliente = new JButton("Cliente");
		
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				telaCliente.setSize(painelJanelas.getWidth(), painelJanelas.getHeight() );
				
				telaFuncionario.setVisible(false);
				telaProduto.setVisible(false);
				telaServico.setVisible(false);
				telaCaixa.setVisible(false);
				telaAgenda.setVisible(false);
				telaPromocoes.setVisible(false);
			    telaCliente.setVisible(true);
				
			}
		});
		btnCliente.setForeground(Color.WHITE);
		btnCliente.setBackground(Color.DARK_GRAY);
		btnCliente.setFont(new Font("Segoe Print", Font.BOLD, 14));
		btnCliente.setBounds(91, 447, 209, 23);
		painelEsq.add(btnCliente);
		
		JButton btnFuncionario = new JButton("Funcionário");
	
		btnFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaFuncionario.setSize(painelJanelas.getWidth(), painelJanelas.getHeight() );
				
				telaCliente.setVisible(false);
				telaProduto.setVisible(false);
				telaServico.setVisible(false);
				telaCaixa.setVisible(false);
				telaAgenda.setVisible(false);
				telaPromocoes.setVisible(false);
			    telaFuncionario.setVisible(true);
			}
		});
		btnFuncionario.setForeground(Color.WHITE);
		btnFuncionario.setBackground(Color.DARK_GRAY);
		btnFuncionario.setFont(new Font("Segoe Print", Font.BOLD, 14));
		btnFuncionario.setBounds(91, 498, 209, 23);
		painelEsq.add(btnFuncionario);
		
		JButton btnProduto = new JButton("Produto");
		btnProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaProduto.setSize(painelJanelas.getWidth(), painelJanelas.getHeight());
			
				telaCliente.setVisible(false);
				telaFuncionario.setVisible(false);
				telaServico.setVisible(false);
				telaCaixa.setVisible(false);
				telaAgenda.setVisible(false);
				telaPromocoes.setVisible(false);
				telaProduto.setVisible(true);
			}
		});
		btnProduto.setForeground(Color.WHITE);
		btnProduto.setBackground(Color.DARK_GRAY);
		btnProduto.setFont(new Font("Segoe Print", Font.BOLD, 14));
		btnProduto.setBounds(91, 550, 209, 23);
		painelEsq.add(btnProduto);
		
		JButton btnPromocoes = new JButton("Promoções");
		btnPromocoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaPromocoes.setSize(painelJanelas.getWidth(), painelJanelas.getHeight());
				
				telaCliente.setVisible(false);
				telaFuncionario.setVisible(false);
				telaServico.setVisible(false);
				telaCaixa.setVisible(false);
				telaAgenda.setVisible(false);
				telaProduto.setVisible(false);
				telaPromocoes.setVisible(true);
			}
		});
		btnPromocoes.setForeground(Color.WHITE);
		btnPromocoes.setBackground(Color.DARK_GRAY);
		btnPromocoes.setFont(new Font("Segoe Print", Font.BOLD, 14));
		btnPromocoes.setBounds(91, 602, 209, 23);
		painelEsq.add(btnPromocoes);
		
		JButton btnServicos = new JButton("Serviços");
		btnServicos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaServico.setSize(painelJanelas.getWidth(), painelJanelas.getHeight());
				painelJanelas.add(telaServico);
				telaCliente.setVisible(false);
				telaFuncionario.setVisible(false);
				telaProduto.setVisible(false);
				telaCaixa.setVisible(false);
				telaAgenda.setVisible(false);
				telaPromocoes.setVisible(false);
				telaServico.setVisible(true);
				
			}
		});
		btnServicos.setForeground(Color.WHITE);
		btnServicos.setBackground(Color.DARK_GRAY);
		btnServicos.setFont(new Font("Segoe Print", Font.BOLD, 14));
		btnServicos.setBounds(91, 652, 209, 23);
		painelEsq.add(btnServicos);
		
		JButton btnAdm = new JButton("Admin");
		btnAdm.setForeground(Color.WHITE);
		btnAdm.setFont(new Font("Segoe Print", Font.BOLD, 14));
		btnAdm.setBackground(Color.DARK_GRAY);
		btnAdm.setBounds(91, 701, 209, 23);
		painelEsq.add(btnAdm);
		
		
		//icones dos menus
		ImageIcon iconAgenda = new ImageIcon(getClass().getResource("iconAgenda.png"));
		JLabel lblIconAgenda = new JLabel(iconAgenda);
		lblIconAgenda.setBounds(20, 329, 51, 37);
		painelEsq.add(lblIconAgenda);
		iconAgenda.setImage(iconAgenda.getImage().getScaledInstance(lblIconAgenda.getHeight(),lblIconAgenda.getWidth(),1));
		
		ImageIcon iconCaixa = new ImageIcon(getClass().getResource("iconCaixa.png"));
		JLabel lblIconCaixa = new JLabel(iconCaixa);
		lblIconCaixa.setBounds(25, 377, 46, 42);
		painelEsq.add(lblIconCaixa);
		iconCaixa.setImage(iconCaixa.getImage().getScaledInstance(lblIconCaixa.getHeight(),lblIconCaixa.getWidth(),1));
		
		ImageIcon iconCliente = new ImageIcon(getClass().getResource("iconCliente.png"));
		JLabel lblIconCliente = new JLabel(iconCliente);
		lblIconCliente.setBounds(25, 430, 46, 40);
		painelEsq.add(lblIconCliente);
		iconCliente.setImage(iconCliente.getImage().getScaledInstance(lblIconCliente.getHeight(),lblIconCliente.getWidth(),1));
		
		ImageIcon iconFuncionario = new ImageIcon(getClass().getResource("iconFuncionario.png"));
		JLabel lblIconFuncionario = new JLabel(iconFuncionario);
		lblIconFuncionario.setBounds(25, 481, 46, 40);
		painelEsq.add(lblIconFuncionario);
		iconFuncionario.setImage(iconFuncionario.getImage().getScaledInstance(lblIconFuncionario.getHeight(),lblIconFuncionario.getWidth(),1));
		
		ImageIcon iconProduto = new ImageIcon(getClass().getResource("iconProduto.png"));
		JLabel lblIconProduto = new JLabel(iconProduto);
		lblIconProduto.setBounds(25, 532, 46, 41);
		painelEsq.add(lblIconProduto);
		iconProduto.setImage(iconProduto.getImage().getScaledInstance(lblIconProduto.getHeight(),lblIconProduto.getWidth(),1));
		
		ImageIcon iconPromocoes = new ImageIcon(getClass().getResource("iconPromocoes.png"));
		JLabel lblIconPromocoes = new JLabel(iconPromocoes);
		lblIconPromocoes.setBounds(25, 584, 46, 41);
		painelEsq.add(lblIconPromocoes);
		iconPromocoes.setImage(iconPromocoes.getImage().getScaledInstance(lblIconPromocoes.getHeight(),lblIconPromocoes.getWidth(),1));
		
		ImageIcon iconServicos = new ImageIcon(getClass().getResource("iconServico.png"));
		JLabel lblIconServicos = new JLabel(iconServicos);
		lblIconServicos.setBounds(25, 636, 46, 39);
		painelEsq.add(lblIconServicos);
		iconServicos.setImage(iconServicos.getImage().getScaledInstance(lblIconServicos.getHeight(),lblIconServicos.getWidth(),1));
		
		
		ImageIcon iconAdmin = new ImageIcon(getClass().getResource("iconAdmin.png"));
		JLabel lblIconAdmin = new JLabel(iconAdmin);
		lblIconAdmin.setBounds(25, 686, 46, 39);
		painelEsq.add(lblIconAdmin);
		iconAdmin.setImage(iconAdmin.getImage().getScaledInstance(lblIconAdmin.getHeight(),lblIconAdmin.getWidth(),1));
		
		ImageIcon logoMarca = new ImageIcon(getClass().getResource("logo.jpg"));
		JLabel lblLogo = new JLabel(logoMarca);
		lblLogo.setBounds(10, 11, 290, 307);
		painelEsq.add(lblLogo);
		logoMarca.setImage(logoMarca.getImage().getScaledInstance(lblLogo.getHeight(),lblLogo.getWidth(),1));
		
		
		
	}
}
