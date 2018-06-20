package cpjLabfinal;

import java.util.Scanner;
import com.adp.peliculas.negocio.*;

public class CpjLabFinal {
    private static final Scanner scan = new Scanner(System.in);
    private static int option = -1;
    private static final  String nombreArchivo = "C:\\Users\\anyi\\Documents\\Abel\\Java\\cpjLabFinal\\dist\\peliculas.txt";
    private static final iCatalogoPeliculas catalogoPeliculas = new CatalogoPeliculasImpl();
    
    public static void main(String[] args) {
       while(option != 0){
           try{
                System.out.println("Eliga una opción\n1.- Iniciar catálogo de peliculas"
                        + "\n2.- Agregar pelicula"
                        + "\n3.- Listar peliculas"
                        + "\n4.- Buscar pelicula"
                        + "\n0.- Salir");

                option = Integer.parseInt(scan.nextLine());

                switch(option){
                    case 1:
                        catalogoPeliculas.iniciarPelicula(nombreArchivo);
                        break;
                    case 2:
                        System.out.print("Ingresa el nombre de una pelicula : ");
                        String nombrePelicula = scan.nextLine();
                        catalogoPeliculas.agregarPeliculas(nombrePelicula, nombreArchivo);
                        break;
                    case 3:
                        catalogoPeliculas.listarPeliculas(nombreArchivo);
                        break;
                    case 4:
                        System.out.print("Ingresa el nombre de la pelicula que desea buscar : ");
                        String buscarPelicula = scan.nextLine();
                        catalogoPeliculas.buscarPelicula(nombreArchivo, buscarPelicula);
                        break;
                    case 0:
                         System.out.print("Hasta pronto!!!");
                         break;
                    default:
                        System.out.print("Opción no reconocida");
                        break;
                }
                System.out.print("\n");
           }catch(Exception e){
               System.out.print("Error!!!");
           }
           
       }
    }
    
}
