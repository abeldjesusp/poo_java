package graficos;

import javax.swing.*;
import java.awt.event.*;

public class EventosDeVentana {
	public static void main(String[] args) {
		MarcoConEventosDeVentana mimarco = new MarcoConEventosDeVentana();
		MarcoConEventosDeVentana mimarco2 = new MarcoConEventosDeVentana();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setTitle("Ventana 1");
		mimarco.setBounds(300,300,500,350);
		
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mimarco2.setTitle("Ventana 2");
		mimarco2.setBounds(900,300,500,350);

	}
}

class MarcoConEventosDeVentana extends JFrame{
	public MarcoConEventosDeVentana(){
		//setTitle("Eventos de ventana");
		//setBounds(500,300,550,200);
		setVisible(true);

		//M_Ventana oyenteVentana = new M_Ventana();

		//addWindowListener(oyenteVentana);

		addWindowListener(new M_Ventana());
	}
}

class M_Ventana extends WindowAdapter{
	
	public void windowIconified(WindowEvent e){
		System.out.println("Ventana minimizada");
	}
}