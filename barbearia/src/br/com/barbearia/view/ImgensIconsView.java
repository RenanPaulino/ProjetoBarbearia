package br.com.barbearia.view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ImgensIconsView extends JPanel{
	
	ImageIcon iconAdmin = new ImageIcon(getClass().getResource("iconAdmin.png"));
	ImageIcon iconAgenda = new ImageIcon(getClass().getResource("iconAgenda.png"));
	ImageIcon iconCaixa = new ImageIcon(getClass().getResource("iconCaixa.png"));
	ImageIcon iconCliente = new ImageIcon(getClass().getResource("iconCliente.png"));
	ImageIcon iconFinanceiro = new ImageIcon(getClass().getResource("iconFinanceiro.png"));
	ImageIcon iconProduto = new ImageIcon(getClass().getResource("iconProduto.png"));
	ImageIcon iconPromocoes = new ImageIcon(getClass().getResource("iconPromocoes.png"));
	ImageIcon iconServico = new ImageIcon(getClass().getResource("iconServico.png"));
	
	//Icone Administrador
	public void iconAdmin(Graphics g) {
		
		super.paintComponent(g);
		iconAdmin.setImage(iconAdmin.getImage().getScaledInstance(WIDTH, HEIGHT, 1));
		Image imgAdmin = iconAdmin.getImage();
		g.drawImage(imgAdmin, 0,0,null);
	}
	
	//Icone Agenda
	public void iconAgenda(Graphics g) {
		
		super.paintComponent(g);
		iconAgenda.setImage(iconAdmin.getImage().getScaledInstance(WIDTH, HEIGHT, 1));
		Image imgAgenda = iconAdmin.getImage();
		g.drawImage(imgAgenda, 0,0,null);
	}
	
	//Icone Caixa
	public void iconCaixa(Graphics g) {
		
		super.paintComponent(g);
		iconCaixa.setImage(iconAdmin.getImage().getScaledInstance(WIDTH, HEIGHT, 1));
		Image imgCaixa = iconAdmin.getImage();
		g.drawImage(imgCaixa, 0,0,null);
	}
	

}

//ImagensView fundo;
//fundo = new ImagensView();
//setContentPane(fundo);
//fundo.setLayout(new GridLayout(8, 3));
//fundo.add(Box.createRigidArea(new Dimension()));