/**
* Ejercicio7 del capitulo 4
*
* @author German Zambrana Ruiz
*/
public class Ejercicio7{
 public static void main(String[] args) {
	 System.out.println("Dime la nota del primer tirmestre");
	 double e1;
	 double e2;
	 double e3;
	 e1 = Double.parseDouble(System.console().readLine());
	 
	 System.out.println("Dime la nota del segundo tirmestre");
	 
	 e2 = Double.parseDouble(System.console().readLine());

    System.out.println("Dime la nota del tercer tirmestre");
	 
	 e3 = Double.parseDouble(System.console().readLine());
	 
	 double media;
	 
	 media = (e1+e2+e3)/3;
	 System.out.println("La media del curso es de " + media);
 }
}
