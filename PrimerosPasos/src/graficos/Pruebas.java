package graficos;

import java.awt.*;

public class Pruebas  {
	public static void main(String[] args) {
		String[] nombresDeFuentes = GralphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

		for(String nombreDeLaFuente: nombresDeFuentes){
			System.out.println(nombreDeLaFuente);
		}
	}
}