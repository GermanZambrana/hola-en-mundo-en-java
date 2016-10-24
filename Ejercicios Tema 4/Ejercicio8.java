/**
* Ejercicio8 del capitulo 4
*
* @author German Zambrana Ruiz
*/
public class Ejercicio8{
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
	 
	 if (media !=5 && media<=5) {
		 System.out.println("Insuficiente");
	 } else if (media >=5 && media <6) { 
		 System.out.println("Suficiente");
	 } else if (media >=6 && media <7) { 
		 System.out.println("Bien");
	 } else if (media >=7 && media <9) { 
		 System.out.println("Notable");	 
	 } else if (media >=9 && media <=10) { 
		 System.out.println("Sobresaliente");
	 }
 }
}
