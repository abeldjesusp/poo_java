package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MultiplesFuentes {
	public static void main(String[] args) {
		ActionMarco mimarco = new ActionMarco();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class ActionMarco extends JFrame{
	public ActionMarco(){
		setVisible(true);
		setBounds(300,200,500,500);
		setTitle("Multiples Fuentes");
		
		add(new ActionPanel());
	}
}

class ActionPanel extends JPanel{

	public ActionPanel(){
		// JButton botonAmarillo = new JButton("Amarillo");
		// JButton botonAzul = new JButton("Azul");
		// JButton botonRojo = new JButton("Rojo");

		// add(botonAmarillo);
		// add(botonRojo);
		// add(botonAzul);

		ActionColor accionAmarillo = new ActionColor("Amarillo", Color.YELLOW);
		ActionColor accionAzul = new ActionColor("Azul", Color.BLUE);
		ActionColor accionRojo = new ActionColor("Rojo", Color.RED);

		/*JButton botonAmarillo = new JButton(accionAmarillo);
		add(botonAmarillo);*/

		add(new JButton(accionAmarillo));
		add(new JButton(accionAzul));
		add(new JButton(accionRojo));

		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		//KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl Y");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl Y"),"fondo_amarillo");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"),"fondo_azul");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"),"fondo_rojo");

		ActionMap mapaAccion = getActionMap();
		mapaAccion.put("fondo_amarillo", accionAmarillo);
		mapaAccion.put("fondo_rojo", accionRojo);
		mapaAccion.put("fondo_azul", accionAzul);
	}

	private class ActionColor extends AbstractAction{

		public ActionColor(String nombre, /*Icon icono,*/ Color color_boton){
			putValue(Action.NAME, nombre);
			// putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color " + nombre);
			putValue("color_de_fondo", color_boton);
		}

		public void actionPerformed(ActionEvent e){
			Color c = (Color)getValue("color_de_fondo");
			setBackground(c);
		}
	}
}