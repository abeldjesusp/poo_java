package graficos;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FocoEvento {
	public static void main(String[] args) {
		MarcoConFoco mimarco = new MarcoConFoco();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoConFoco extends JFrame{
	public MarcoConFoco(){
		setTitle("Evento Foco");
		setBounds(300,300,500,350);
		setVisible(true);
		
		add(new LaminaconFoco());
	}
}

class LaminaconFoco extends JPanel{

	JTextField cuadro1;
	JTextField cuadro2;

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		setLayout(null);

		cuadro1 = new JTextField();
		cuadro2 = new JTextField();

		cuadro1.setBounds(120,10,150,20);
		cuadro2.setBounds(120,50,150,20);

		add(cuadro1);
		add(cuadro2);

		LanzaFocos elFoco = new LanzaFocos();

		cuadro1.addFocusListener(elFoco);
	}

	private class LanzaFocos implements FocusListener{

		public void focusGained(FocusEvent e){

		}

		public void focusLost(FocusEvent e){

			String email = cuadro1.getText();
			boolean comprobacion = false;

			for(int i = 0; i < email.length(); i++){
				if(email.charAt(i)=='@'){
					comprobacion = true;
					break;
				}
			}

			if(comprobacion)
				System.out.println("Correcto");
			
			else
				System.out.println("Incorrecto");
			
		}
	}

}
