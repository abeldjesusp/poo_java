package poo;
//import javax.swing.*;

public class UsoVehiculo {
	public static void main(String[] args) {
		
		//Coche miCoche = new Coche(); // instanciar una clase. Ejemplar de clase

		// System.out.println(miCoche.dime_datos_generales());

		// miCoche.establece_color(JOptionPane.showInputDialog("Introduce color"));

		// System.out.println(miCoche.dime_color());

		// miCoche.configura_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));

		// System.out.println(miCoche.dime_asientos());

		// miCoche.configura_climatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));

		// System.out.println(miCoche.dime_climatizador());

		// System.out.println(miCoche.dime_peso_coche());

		// System.out.println("El precio final del coche es " + miCoche.precio_coche());


		Coche miCoche1 = new Coche();

		miCoche1.establece_color("Rojo");

		Furgoneta miFurgoneta1 = new Furgoneta(7, 580);

		miFurgoneta1.establece_color("Azul");
		miFurgoneta1.configura_asientos("Si");
		miFurgoneta1.configura_climatizador("Si");

		System.out.println(miCoche1.dime_datos_generales() + " " + miCoche1.dime_color());
		System.out.println(miFurgoneta1.dime_datos_generales() + " " + miFurgoneta1.dime_color()
			+ " " + miFurgoneta1.dimeDatosFurgoneta());

	}
}