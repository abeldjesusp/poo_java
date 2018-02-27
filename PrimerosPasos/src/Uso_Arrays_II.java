//import javax.swing.*;
public class Uso_Arrays_II {
	public static void main(String[] args) {
		//String [] paises = new String[8];

		// paises[0] = "España";
		// paises[1] = "Mexico";
		// paises[2] = "Colombia";
		// paises[3] = "Peru";
		// paises[4] = "Chile";
		// paises[5] = "Argentina";
		// paises[6] = "Ecuador";
		// paises[7] = "Venezuela";

		//String [] paises = {"España", "Mexico","Colombia","Peru","Chile","Argentina","Ecuador","Venezuela"};

		/*for(int i = 0; i < 8; i++){
			paises[i]=JOptionPane.showInputDialog("Introduce pais " + (i+1));
		}

		for(String elemento:paises){
			System.out.println("Pais: " + elemento);
		}*/

		int[] matriz_aleatorio = new int[150];

		for(int i = 0; i < matriz_aleatorio.length; i++){
			matriz_aleatorio[i] = (int)Math.round(Math.random()*100);
		}

		for(int numeros:matriz_aleatorio){
			System.out.print(numeros + " ");
		}
	}
}