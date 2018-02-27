package graficos;

import javax.swing.*;
import java.awt.Frame.*;
import java.awt.event.*;

public class CambiaEstado {
	public static void main(String[] args) {
		MarcoEstado mimarco = new MarcoEstado();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoEstado extends JFrame{
	public MarcoEstado(){
		setVisible(true);
		setBounds(300,300,500,350);
		CambiandoEstado nuevoEstado = new CambiandoEstado();

		addWindowStateListener(nuevoEstado);
	}
}

class CambiandoEstado implements WindowStateListener{
	public void windowStateChanged(WindowEvent e){
		//System.out.println("La ventana ha cambiado");
		// System.out.println(e.getNewState());

		if(e.getNewState()==Frame.MAXIMIZED_BOTH){
			System.out.println("La ventana esta a pantalla completa");
		}else if(e.getNewState()== Frame.NORMAL){
			System.out.println("La ventana esta normal");
		}
	}
}