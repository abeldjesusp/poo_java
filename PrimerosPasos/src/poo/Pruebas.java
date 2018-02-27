package poo;

public class Pruebas {

	public static void main(String[] args) {
		Empleados trabajador1 = new Empleados("Paco");
		Empleados trabajador2 = new Empleados("Ana");
		Empleados trabajador3 = new Empleados("Antonio");

		trabajador1.cambiaSeccion("RRHH");

		System.out.println(trabajador1.devuelveDatos() + "\n" + trabajador2.devuelveDatos()
			+ "\n" + trabajador3.devuelveDatos());

		System.out.println(Empleados.dameIdSiguiente());

	}
}

class Empleados{

	private final String nombre;
	private String seccion;
	private int Id;
	private static int IdSiguiente = 1;

	public Empleados(String nom){

		nombre = nom;
		seccion = "Administracion";
		Id = IdSiguiente;

		IdSiguiente++;
	}

	//setter
	public void cambiaSeccion(String seccion){

		this.seccion = seccion;
	}

	//getter
	public String devuelveDatos(){

		return "El nombre es : " + nombre + ", la seccion es " + seccion + " y el Id=" + Id;
	}

	//getter
	public static String dameIdSiguiente(){
		return "El Id siguiente es : " + IdSiguiente;
	}
}