/**
 * Ejercicio4 Tema 1
 *
 * @Author Germán Zambrana
 */




public class HolaMundo5 { // Clase principal
  public static void main(String[] args) {

   String r = "\033[31m";
   String v = "\033[32m";
   String n = "\033[33m";
   String a = "\033[34m";
   String m = "\033[35m"; 
   String b = "\033[37m";
  
   System.out.printf("Lunes Martes Miércoles Jueves Viernes");
   System.out.printf("------------------------------------------");
   System.out.printf(r + "%12s" + v + "%12s" + v + "%12s" + n + "%12s" + a + "%12s\n", "S.INF", "PROG", "PROG", "B.D",   "L.M");
   System.out.printf(r + "%12s" + v + "%12s" + v + "%12s" + n + "%12s" + a + "%12s\n", "S.INF", "PROG", "PROG", "B.D",   "L.M");
   System.out.printf(r + "%12s" + v + "%12s" + a + "%12s" + n + "%12s" + m + "%12s\n", "S.INF", "PROG", "L.M" , "B.D",   "E.D");
   System.out.printf("              RECREO                 ");
   System.out.printf(b + "%12s" + n + "%12s" + a + "%12s" + v + "%12s" + r + "%12s\n", "FOL",   "B.D",  "L.M",  "PROG",  "S.INF");
   System.out.printf(b + "%12s" + n + "%12s" + m + "%12s" + v + "%12s" + r + "%12s\n", "FOL",   "B.D",  "L.M",  "PROG",  "S.INF");
   System.out.printf(b + "%12s" + n + "%12s" + m + "%12s" + v + "%12s" + r + "%12s\n", "FOL",   "B.D",  "L.M",  "PROG",  "S.INF");
  
    
       }
}


