package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class PruebaConFuentes {
	public static void main(String[] args) {
		MarcoConFuentes mimarco = new MarcoConFuentes();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoConFuentes extends JFrame{
	public MarcoConFuentes(){
		setTitle("Fuentes");
		setSize(400,400);
		LaminaConFuenes milamina = new LaminaConFuenes();
		add(milamina);

		milamina.setForeground(Color.BLUE);
	}
}

class LaminaConFuenes extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		Font miFuente = new Font("Courier", Font.BOLD, 26);
		//g2.setColor(Color.BLUE);
		g2.setFont(miFuente);

		g2.drawString("Abel", 100,100);

		g2.setFont(new Font("Arial", Font.ITALIC,24));
		//g2.setColor(new Color(128,90,50));
		g2.drawString("Curso de Java", 100,200);
	}
}