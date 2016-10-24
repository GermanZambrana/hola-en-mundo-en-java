/**
* Ejercicio11 del capitulo 4
*
* @author German Zambrana Ruiz
*/
public class Ejercicio12{
 public static void main(String[] args) {
	 System.out.println("Cuestionario sobre las asignaturas del grado superior del IES CAMPANILLAS, a continuación empezará el test:(Recuerda siempre escrubir la palabra correctamente con sus mayusculas y tildes");
	 
   String respuesta;
	 int puntuacion = 0;
	 System.out.println("1.¿Qué asignatura tenemos los lunes a primera hora?");
	 respuesta = System.console().readLine();
	 if(respuesta.equals("Sistemas informáticos")){
		 
		puntuacion++;} 
		
	System.out.println("2.¿Con que sistema operativo estamos trabajando?");
	 respuesta = System.console().readLine();
	 if(respuesta.equals("Linux")){
		 
		puntuacion++;} 
	System.out.println("3.¿Cómo se llama nuestro profesor de programación?");
	 respuesta = System.console().readLine();
	 if(respuesta.equals("Luis José")){
		 
		puntuacion++;} 	
	
		 System.out.println("4.¿A qué hora entramos a clase?");
	 respuesta = System.console().readLine();
	 if(respuesta.equals("8:15")){
		 
		puntuacion++;} 
		
			 System.out.println("5.¿Cómo se llama nuestro profesor de S.I?");
	 respuesta = System.console().readLine();
	 if(respuesta.equals("Juan Carlos")){
		 
		puntuacion++;} 
		
			 System.out.println("6.¿Cuańtos alumnos somos en clase?");
	 respuesta = System.console().readLine();
	 if(respuesta.equals("32")){
		 
		puntuacion++;} 
		
	System.out.println("7.¿Tenemos F.P dual?");
	 respuesta = System.console().readLine();
	 if(respuesta.equals("Si")){
		 
		puntuacion++;} 
	System.out.println("8.¿Cuántas horas de FOL tenemos a la semana?");
	 respuesta = System.console().readLine();
	 if(respuesta.equals("3")){
		 
		puntuacion++;} 	
	
		 System.out.println("9.¿A qué hora salimos de clase?");
	 respuesta = System.console().readLine();
	 if(respuesta.equals("2:15")){
		 
		puntuacion++;} 
		
			 System.out.println("10.¿Quién escribio el libro de aprende con Java");
	 respuesta = System.console().readLine();
	 if(respuesta.equals("Luis José")){
		 
		puntuacion++;} 
		
	
	System.out.println("Tu puntuación es de " + puntuacion);
 }
}
  


		
	 
