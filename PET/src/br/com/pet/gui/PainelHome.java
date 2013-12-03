package br.com.pet.gui;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.annotation.Resource;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PainelHome extends JPanel {

	private static final long serialVersionUID = -1045421666221440186L;
	
	private Icon backgroundIcon;
	
	/**
	 * @param 
	 * 		imagePath - Caminho da imagem que ficar� 
	 * como background no JPanel.
	 */
	public PainelHome() {
		backgroundIcon = new ImageIcon("img/background.jpg" );
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		backgroundIcon.paintIcon(this, g, 0, 0);
	}
	
	@Override
	public Dimension getPreferredSize() {
		// TODO Auto-generated method stub
		return new Dimension(backgroundIcon.getIconWidth(), backgroundIcon.getIconHeight());
	}

}
