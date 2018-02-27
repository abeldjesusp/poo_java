package poo;

import javax.swing.*;
import javax.swing.Timer;
import java.awt.event.*;
import java.util.*;
import java.awt.Toolkit;


public class PruebaTemporizador2 {
	public static void main(String[] args) {
		
		//Reloj mireloj = new Reloj(3000, true);
		Reloj mireloj = new Reloj();

		mireloj.enMarcha(3000, true);

		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");

		System.exit(0);
	}
}

class Reloj {
	private int intervalo;
	private boolean sonido;

	//constructor
	// public Reloj(int intervalo, boolean sonido){
	// 	this.intervalo = intervalo;
	// 	this.sonido = sonido;
	// }

	public void enMarcha(int intervalo, final boolean sonido){
		//Clase interna local
		class DameLaHora2 implements ActionListener{

			public void actionPerformed(ActionEvent evento){
				Date ahora = new Date();

				System.out.println("Te pongo la hora cada 3 sg: " + ahora);

				if(sonido){
					Toolkit.getDefaultToolkit().beep();
				}
			}
		}

		ActionListener oyente =  new DameLaHora2();

		Timer mitemporizador = new Timer(intervalo, oyente);

		mitemporizador.start();
	}
	//clase interna
	/*private class DameLaHora2 implements ActionListener{

		public void actionPerformed(ActionEvent evento){
			Date ahora = new Date();

			System.out.println("Te pongo la hora cada 3 sg: " + ahora);

			if(sonido){
				Toolkit.getDefaultToolkit().beep();
			}
		}
	}*/
}