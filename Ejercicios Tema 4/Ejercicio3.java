/**
* Ejercicio3 del capitulo 4
*
* @author German Zambrana Ruiz
*/

public class Ejercicio3{
 public static void main(String[] args) {
	 System.out.print("Dime un número del 1 al 7: ");
	 
int n = Integer.parseInt(System.console().readLine());
  
    if (n==1) {
		System.out.println("Lunes");
	} else if (n==2) {
		System.out.println("Martes");
	} else if (n==3) {
		System.out.println("Miercoles");
	} else if (n==4) {
		System.out.println("jueves");
	} else if (n==5) {
		System.out.println("Viernes");
	} else if (n==6) {
		System.out.println("Sabado");
	} else if (n==7) {
		System.out.println("Domingo");
    } else { System.out.println("Ese número no existe");
	}
 }
}
