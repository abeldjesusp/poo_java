package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.Toolkit;

public class CreandoMarcoCentrado {
	public static void main(String[] args) {
		MarcoCentrado  mimarco = new MarcoCentrado();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}
}

class MarcoCentrado extends JFrame{

	public MarcoCentrado(){
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Dimension tamanioPantalla = miPantalla.getScreenSize();

		int alturaPantalla = tamanioPantalla.height;
		int anchoPantalla = tamanioPantalla.width;

		setSize(anchoPantalla / 2, alturaPantalla / 2);
		setLocation(anchoPantalla / 4, alturaPantalla / 4);
		setTitle("Marco Centrado!");
		Image miIcono = miPantalla.getImage("icono.jpg");
		setIconImage(miIcono);
	}
}