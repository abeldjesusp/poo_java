package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PruebaConEventos {
	public static void main(String[] args) {
		MarcoConEventos mimarco = new MarcoConEventos();

		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoConEventos extends JFrame{
	
	public MarcoConEventos(){
		setTitle("Prueba con Botones");
		setBounds(500,300,550,250);
		LaminaConEventos milamina = new LaminaConEventos();

		add(milamina);
	}
}

class LaminaConEventos extends JPanel {
	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");

	public LaminaConEventos(){
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);

		ColorFondo Amarillo = new ColorFondo(Color.YELLOW);
		ColorFondo Azul = new ColorFondo(Color.BLUE);
		ColorFondo Rojo = new ColorFondo(Color.RED);

		botonAzul.addActionListener(Azul);
		botonAmarillo.addActionListener(Amarillo);
		botonRojo.addActionListener(Rojo);
	}

	private class ColorFondo implements ActionListener{
		private Color colorDeFondo;

		public ColorFondo(Color c){
			colorDeFondo = c;
		}

		public void actionPerformed(ActionEvent e){
			setBackground(colorDeFondo);
		}
	}	
}

