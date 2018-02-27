package graficos;

import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import java.io.*;

public class PruebaConImagenes {
	public static void main(String[] args) {
		MarcoConImagenes mimarco = new MarcoConImagenes();

		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoConImagenes extends JFrame{
	
	public MarcoConImagenes(){
		setTitle("Prueba con imagenes");
		setBounds(500,300,550,250);
		LaminaConImagenes milamina = new LaminaConImagenes();

		add(milamina);
	}
}

class LaminaConImagenes extends JPanel{

	private Image imagen;

	public void paintComponent(Graphics g){
	
		super.paintComponent(g);

		File miImagen = new File("/home/abel/Descargas/c04892080.png");

		try{
			imagen = ImageIO.read(miImagen);
		}catch(IOException e){
			System.out.println("La Imagen no se encuetra");
		}

		g.drawImage(imagen,0,0,null);

		/*for(int i = 0; i<300; i++){
			for(int j = 0; j<200; j++){
				g.copyArea(0,0,573,430,573*i,430*j);
			}
		}*/
		
	}
}