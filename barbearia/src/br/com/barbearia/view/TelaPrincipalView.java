package br.com.barbearia.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;

@SuppressWarnings("serial")
public class TelaPrincipalView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipalView frame = new TelaPrincipalView();
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
	public TelaPrincipalView() {

		setBackground(SystemColor.desktop);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel painelMenu = new JPanel();
		painelMenu.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, new Color(128, 128, 128)));
		painelMenu.setToolTipText("Caixa");
		painelMenu.setBackground(SystemColor.activeCaptionBorder);
		painelMenu.setBounds(0, 0, 254, 731);
		contentPane.add(painelMenu);
		painelMenu.setLayout(null);

		JPanel painelFuncoes = new JPanel();
		painelFuncoes.setBackground(SystemColor.windowBorder);
		painelFuncoes.setBounds(0, 0, 249, 34);
		painelMenu.add(painelFuncoes);

		JLabel lblMenu = new JLabel("FUNÇÕES");
		lblMenu.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblMenu.setBackground(SystemColor.activeCaptionBorder);
		painelFuncoes.add(lblMenu);

		//Objetos Icones
	
		// Botões pra chamar funções

		JButton btnCaixa = new JButton("Caixa");
		btnCaixa.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(128, 128, 128)));
		btnCaixa.setBackground(SystemColor.activeCaptionBorder);
		btnCaixa.setFont(new Font("Dialog", Font.BOLD, 14));
		btnCaixa.setBounds(62, 45, 187, 23);
		painelMenu.add(btnCaixa);

		JButton btnAgenda = new JButton("Agendas");
		btnAgenda.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(128, 128, 128)));
		btnAgenda.setBackground(SystemColor.activeCaptionBorder);
		btnAgenda.setFont(new Font("Dialog", Font.BOLD, 14));
		btnAgenda.setBounds(0, 89, 249, 23);
		painelMenu.add(btnAgenda);

		JButton btnServico = new JButton("Serviços");
		btnServico.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(128, 128, 128)));
		btnServico.setBackground(SystemColor.activeCaptionBorder);
		btnServico.setFont(new Font("Dialog", Font.BOLD, 14));
		btnServico.setBounds(0, 133, 249, 23);
		painelMenu.add(btnServico);

		JButton btnCliente = new JButton("Clientes");
		btnCliente.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(128, 128, 128)));
		btnCliente.setBackground(SystemColor.activeCaptionBorder);
		btnCliente.setFont(new Font("Dialog", Font.BOLD, 14));
		btnCliente.setBounds(0, 175, 249, 23);
		painelMenu.add(btnCliente);

		JButton btnFinaceiro = new JButton("Financeiro");
		btnFinaceiro.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(128, 128, 128)));
		btnFinaceiro.setBackground(SystemColor.activeCaptionBorder);
		btnFinaceiro.setFont(new Font("Dialog", Font.BOLD, 14));
		btnFinaceiro.setBounds(0, 220, 249, 23);
		painelMenu.add(btnFinaceiro);

		JButton btnPromocoes = new JButton("Promoções");
		btnPromocoes.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(128, 128, 128)));
		btnPromocoes.setBackground(SystemColor.activeCaptionBorder);
		btnPromocoes.setFont(new Font("Dialog", Font.BOLD, 14));
		btnPromocoes.setBounds(0, 265, 249, 23);
		painelMenu.add(btnPromocoes);

		JButton btnProdutos = new JButton("Produtos");
		btnProdutos.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(128, 128, 128)));
		btnProdutos.setBackground(SystemColor.activeCaptionBorder);
		btnProdutos.setFont(new Font("Dialog", Font.BOLD, 14));
		btnProdutos.setBounds(0, 310, 249, 23);
		painelMenu.add(btnProdutos);

		JButton btnFuncionario = new JButton("Funcionário");
		btnFuncionario.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(128, 128, 128)));
		btnFuncionario.setBackground(SystemColor.activeCaptionBorder);
		btnFuncionario.setFont(new Font("Dialog", Font.BOLD, 14));
		btnFuncionario.setBounds(0, 354, 249, 23);
		painelMenu.add(btnFuncionario);

		JButton btnAdministrador = new JButton("Adminstrador");
		btnAdministrador.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(128, 128, 128)));
		btnAdministrador.setBackground(SystemColor.activeCaptionBorder);
		btnAdministrador.setFont(new Font("Dialog", Font.BOLD, 14));
		btnAdministrador.setBounds(0, 398, 249, 23);
		painelMenu.add(btnAdministrador);
		
		JPanel painelCaixa = new JPanel();
		
		painelCaixa.setBounds(10, 45, 42, 23);
		painelMenu.add(painelCaixa);
		painelCaixa.setLayout(null);
		
		JLabel lblIconCaixa = new JLabel("");
		lblIconCaixa.setBounds(0, 0, 46, 14);
	
		painelCaixa.add(lblIconCaixa);

		// Tela maior onde serão abertas as opçoes de acordo com o menu
		JPanel panel = new JPanel();
		panel.setBounds(261, 0, 1103, 731);
		contentPane.add(panel);
		panel.setLayout(null);
		
	
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 1103, 731);
		panel.add(lblNewLabel);
	}
}