package poo;
import java.util.*;

public class UsoPersona {
	public static void main(String[] args) {
		Persona[] lasPersonas = new Persona[2];

		lasPersonas[0] = new Empleado2("Luis Conde", 50000,2009, 2, 25);
		lasPersonas[1] = new Alumno("Ana Lopez", "Biológicas");

		for(Persona p: lasPersonas){
			System.out.println(p.dameNombre() + " " + p.dameDescripcion());
		}
	}
}

//Clase Persona
abstract class Persona{
	private String nombre;

	//constructor
	public Persona(String nom){
		nombre = nom;
	}

	//getter
	public String dameNombre(){
		return nombre;
	}

	//metodo abstracto
	public abstract String dameDescripcion();
}

//Clase empleado
class Empleado2 extends Persona{

	private double sueldo;
	private Date alta_contrato;
	private static int IdSiguiente = 1;
	private int Id;

	//constructor
	public Empleado2(String nom, double sue, int agno, int mes, int dia){
		
		super(nom);

		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		alta_contrato = calendario.getTime();
		Id = IdSiguiente;

		IdSiguiente++;
	}

	public String dameDescripcion(){
		return "Este empleado tiene un ID= " + Id + " con un sueldo= " + sueldo;
	}

	//getter
	public double dameSueldo(){
		return sueldo;
	}

	//getter
	public Date dameFechaContrato(){
		return alta_contrato;
	}

	//setter
	public void subeSueldo(double porcentaje){

		double aumento = sueldo * porcentaje / 100;

		sueldo += aumento;
	}
}

class Alumno extends Persona{
	private String carrera;

	public Alumno(String nom, String car){
		
		super(nom);

		carrera = car;
	}

	public String dameDescripcion(){
		return "Este alumno esta estudiando la carrera de " + carrera;
	}
}