package graficos;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.event.*;

public class EventosDeTeclado {
	public static void main(String[] args) {
		MarcoConTeclas mimarco = new MarcoConTeclas();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoConTeclas extends JFrame{
	public MarcoConTeclas(){
		setVisible(true);
		setBounds(300,300,500,350);

		EventoDeTeclado tecla = new EventoDeTeclado();

		addKeyListener(tecla);
		
	}
}

class EventoDeTeclado implements KeyListener{

	public void keyPressed(KeyEvent e){
		//int codigo = e.getKeyCode()	;

		//System.out.println(codigo);
	}

	public void keyReleased(KeyEvent e){
		
	}

	public void keyTyped(KeyEvent e){
		char caracter = e.getKeyChar();
		System.out.println(caracter);
	}
}