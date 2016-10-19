/**
* Ejercicio2 del capitulo 4
*
* @author German Zambrana Ruiz
*/
public class Ejercicio2{
 public static void main(String[] args) {
	 System.out.print("Hola, ¿Qué hora es?: ");
	 
int hora = Integer.parseInt(System.console().readLine());
  
    if (hora >= 6 && hora <= 12) {
		System.out.println("Buenos días");
	} else if (hora >= 13 && hora <= 20) {
		System.out.println("Buenas tardes");
	} else if (hora >= 21 && hora <= 24) {
		System.out.println("Buenas noches");
    } else { System.out.println("Esa hora no existe");
	}
 }
}
