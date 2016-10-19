/**
* Ejercicio1 del capitulo 4
*
* @author German Zambrana Ruiz
*/
public class Ejercicio1{
 public static void main(String[] args) {
	 System.out.print("Por favor, dime el dia de la semana (L, M, X, J, V): ");
String ds = System.console().readLine();
 if (ds.toUpperCase().equals("L")) {
	 System.out.println("Sistemas informaticos");
 } else if (ds.toUpperCase().equals("M")) {
	 System.out.println("Programación");
 } else if (ds.toUpperCase().equals("X")) {
	 System.out.println("Programacion"); 
 } else if (ds.toUpperCase().equals("J")) {
	 System.out.println("Base de datos");
 } else if (ds.toUpperCase().equals("V")) {
	 System.out.println("Lenguaje de marcas");
 } else { System.out.println("Ese dia de la semana no existe");
    } 
  }
} 
	 
