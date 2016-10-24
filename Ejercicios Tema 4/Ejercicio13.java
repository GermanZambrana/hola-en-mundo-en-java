/**
* Ejercicio11 del capitulo 4
*
* @author German Zambrana Ruiz
*/
public class Ejercicio13{
 public static void main(String[] args) {
  System.out.println("Dime tres números enteros para así poder ordenarlos");
   int n1 = Integer.parseInt(System.console().readLine());
   int n2 = Integer.parseInt(System.console().readLine());
   int n3 = Integer.parseInt(System.console().readLine());
   
    if((n1 > n2) && (n1 > n3)) {
   System.out.println("Ordenados de mayor a menor " + n1 + "" + n2 + "" + n3);}
   
    if((n2 > n3) && (n1 < n2)) {
   System.out.println("Ordenados de mayor a menor " + n2 + "" + n1 + "" + n3);}
   
    if((n3 > n2) && (n3 > n3)) {
   System.out.println("Ordenados de mayor a menor " + n1 + "" + n2 + "" + n3);}
}
}
   
  
