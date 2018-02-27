import java.util.*;

public class Uso_Tallas{

	// enum Talla {MINI, MEDIANO, GRANDE, MUY_GRANDE}; // tipo enumerado

	enum Talla {
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");

		private String abreviatura;

		private Talla(String abreviatura){
			this.abreviatura = abreviatura;
		}

		public String dameAbreviatura(){
			return abreviatura;
		}

	}

	public static void main(String[] args) {
		Scanner entrada = new
		 Scanner(System.in);

		System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, muy");

		String entrad_datos = entrada.next().toUpperCase();

		Talla la_talla = Enum.valueOf(Talla.class, entrad_datos);

		System.out.println("Talla= " + la_talla);

		System.out.println("Abreviarura= " + la_talla.dameAbreviatura());
	}
}