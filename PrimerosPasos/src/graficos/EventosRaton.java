package graficos;

import javax.swing.JFrame;
import java.awt.event.*;

public class EventosRaton {
	public static void main(String[] args) {
		MarcoConRaton mimarco = new MarcoConRaton();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoConRaton extends JFrame{
	public MarcoConRaton(){
		setVisible(true);
		setBounds(300,300,500,350);

		EventoDeRaton raton = new EventoDeRaton();

		addMouseListener(raton);
		
	}
}

// class EventoDeRaton implements MouseListener{

// 	public void mouseClicked(MouseEvent e){
// 		System.out.println("Haz echo click");
// 	}

// 	public void mouseEntered(MouseEvent e){}

// 	public void mouseExited(MouseEvent e){}

// 	public void mousePressed(MouseEvent e){}

// 	public void mouseReleased(MouseEvent e){}
// }

class EventoDeRaton extends MouseAdapter{
	/*public void mouseClicked(MouseEvent e){
		//System.out.println("Haz echo click");
		//System.out.println("Coordenada X : " + e.getX() + " Coordenada Y : " + e.getY());
		System.out.println(e.getClickCount());
	}*/

	public void mousePressed(MouseEvent e){

		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK)
			System.out.println("Haz puslsado el boton izquierdo");
		else if(e.getModifiersEx()== MouseEvent.BUTTON2_DOWN_MASK)
			System.out.println("Haz la rueda del raton");
		else if (e.getModifiersEx()== MouseEvent.BUTTON3_DOWN_MASK)
			System.out.println("Haz puslsado el boton derecho");

	}
}