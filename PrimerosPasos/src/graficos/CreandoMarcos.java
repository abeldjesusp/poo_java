package graficos;

import javax.swing.*;

public class CreandoMarcos {
	public static void main(String[] args) {
		MiMarco marco1 = new MiMarco();

		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MiMarco extends JFrame {

	public MiMarco(){

		//setSize(500, 300); dar tamanio
		//setLocation(500, 300); dar una locacion a la ventana
		setBounds(500,300,550,250); //Da tamanio y location a la vez

		//setResizable(false); // para no cambiar de tamanio

		// setExtendedState(JFrame.MAXIMIZED_BOTH); //Para ventana completa

		setTitle("Mí ventana");
	}
}