package poo;
import java.util.*;

//Clase principal
public class UsoEmpleado {
	public static void main(String[] args) {
		/*Empleado empleado1 = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		Empleado empleado2 = new Empleado("Ana Lopez", 95000, 1995, 6, 2);
		Empleado empleado3 = new Empleado("Maria Martin", 105000, 2002, 3, 15);

		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);

		System.out.println("Nombre : " + empleado1.dameNombre() + " Sueldo : " + empleado1.dameSueldo()
			+ " Fecha de alta " + empleado1.dameFechaContrato());

		System.out.println("Nombre : " + empleado2.dameNombre() + " Sueldo : " + empleado2.dameSueldo()
			+ " Fecha de alta " + empleado2.dameFechaContrato());

		System.out.println("Nombre : " + empleado3.dameNombre() + " Sueldo : " + empleado3.dameSueldo()
			+ " Fecha de alta " + empleado3.dameFechaContrato());*/

		Jefatura jefe_RRHH = new Jefatura("Juan", 55000, 2006, 9, 25);

		Empleado[] misEmpleados = new Empleado[6];

		jefe_RRHH.estableceIncentivo(2570);

		misEmpleados[0] = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("Ana Lopez", 95000, 1995, 6, 2);
		misEmpleados[2] = new Empleado("Maria Martin", 105000, 2002, 3, 15);
		misEmpleados[3] = new Empleado("Antonio Fernandez");
		misEmpleados[4] = jefe_RRHH; // Polimorfismo. Principio de sustitucion
		misEmpleados[5] = new Jefatura("Maria", 95000, 1999, 5, 26); // Polimorfismo

		Jefatura jefa_Finanzas = (Jefatura)misEmpleados[5];
		jefa_Finanzas.estableceIncentivo(50000);

		// Empleado director_comercial = new Jefatura("Sandra", 85000, 2012, 5, 5);

		// Comparable ejemplo = new Empleado("Elisabeth", 95000, 2011, 6, 7);

		// if(director_comercial instanceof Empleado){
		// 	System.out.println("Es de tipo Jefatura");
		// }

		// if(ejemplo instanceof Comparable){
		// 	System.out.println("Implementa la interfaz Comparable");
		// }

		/*for(int i = 0; i < 3; i++){
			misEmpleados[i].subeSueldo(5);
		}*/

		System.out.println(jefa_Finanzas.tomar_decisiones("Dar mas dias de vacaciones a los empleados"));
		System.out.println("El Jefe " + jefa_Finanzas.dameNombre() + " tiene un bonus de " + jefa_Finanzas.establece_bonus(500));
		System.out.println("El empleado " + misEmpleados[3].dameNombre() + " tiene un bonus de " + misEmpleados[3].establece_bonus(200));

		for(Empleado e: misEmpleados){
			e.subeSueldo(5);
		}

		/*for(int i = 0; i < 3; i++){
			System.out.println("Nombre: " + misEmpleados[i].dameNombre()
				+ " Sueldo: " + misEmpleados[i].dameSueldo()
				+ " Fecha de Alta: " + misEmpleados[i].dameFechaContrato());
		}*/

		Arrays.sort(misEmpleados);

		for(Empleado e: misEmpleados){
			System.out.println("Nombre: " + e.dameNombre()
				+ " Sueldo: " + e.dameSueldo()
				+ " Fecha de Alta: " + e.dameFechaContrato());
		}

	}
}

//Clase empleado
class Empleado implements Comparable, Trabajadores {

	//constructor
	public Empleado(String nom, double sue, int agno, int mes, int dia){
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		alta_contrato = calendario.getTime();
		Id = IdSiguiente;

		IdSiguiente++;
	}

	//Constructor 2
	public Empleado(String nom){
		this(nom, 30000, 2000, 1, 1);
	}

	public double establece_bonus(double gratificacion){
		return Trabajadores.bonus_base + gratificacion;
	}

	//getter
	public String dameNombre(){
		return nombre;
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

	private String nombre;
	private double sueldo;
	private Date alta_contrato;
	private static int IdSiguiente = 1;
	private int Id;

	public int compareTo(Object miObjeto){
		Empleado otroEmpledo = (Empleado)miObjeto;

		if(this.sueldo < otroEmpledo.sueldo){
			return -1;
		}else if(this.sueldo > otroEmpledo.sueldo){
			return 1;
		}else{
			return 0;
		}
	}
}

class Jefatura extends Empleado implements Jefes {
	private double incentivo;

	//constructor
	public Jefatura(String nom, double sue, int agno, int mes, int dia){
		super(nom, sue, agno, mes, dia);//Llama al constructor padre

	}

	//setter
	public void estableceIncentivo (double b){
		incentivo = b;
	}

	//getter
	public double dameSueldo(){
		double sueldoJefe = super.dameSueldo();

		return sueldoJefe + incentivo;
	}

	//Metodo interface Jefes
	public String tomar_decisiones(String decision){
		 return "Un miembro de la direccion ha tomado una decision. " + decision;
	}

	//Metodo interface Trabajadores
	public double establece_bonus(double gratificacion){
		double prima = 2000;

		return Trabajadores.bonus_base + gratificacion + prima;
	}


}