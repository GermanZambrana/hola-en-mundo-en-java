/**
* Ejercicio10 del capitulo 4
*
* @author German Zambrana Ruiz
*/
public class Ejercicio10{
 public static void main(String[] args) {
	 System.out.println("Dime el dia y el mes de tu nacimiento para decirte tu horóscopo: Ejemplo 8 enter 1 que seria 8 de Enero");
	int d = Integer.parseInt(System.console().readLine());
	 int m = Integer.parseInt(System.console().readLine());
	 
		 if (d >=1 && d <=31) {
			 switch(m) {
		     case 1:
				    if (d >=1&& d <=19){System.out.println("Eres capricornio");}
				    else if (d >=20&& d <=31){System.out.println("Eres acuario");}
				    else {System.out.println("Error");}
				    break;
				 
			 case 2:
                    if(d>=1&&d<=18){System.out.println("Eres acuario");}
                    else if(d>=19&&d<=31){System.out.println("Eres piscis");}
                    else{System.out.println("Error.");}
                    break;
                case 3:
                    if(d>=1&&d<=20){System.out.println("Eres piscis");}
                    else if(d>=21&&d<=31){System.out.println("Eres aries");}
                    else{System.out.println("Error.");}
                    break;
                case 4:
                    if(d>=1&&d<=19){System.out.println("Eres aries");}
                    else if(d>=20&&d<=31){System.out.println("Eres tauro");}
                    else{System.out.println("Error.");}
                    break;
                case 5:
                    if(d>=1&&d<=20){System.out.println("Eres tauro");}
                    else if(d>=21&&d<=31){System.out.println("Eres géminis");}
                    else{System.out.println("Error.");}
                    break;
                case 6:
                    if(d>=1&&d<=20){System.out.println("Eres géminis");}
                    else if(d>=21&&d<=31){System.out.println("Eres cáncer");}
                    else{System.out.println("Error.");}
                    break;
                case 7:
                    if(d>=1&&d<=22){System.out.println("Eres cáncer");}
                    else if(d>=23&&d<=31){System.out.println("Eres leo");}
                    else{System.out.println("Error.");}
                    break;
                case 8:
                    if(d>=1&&d<=22){System.out.println("Eres leo");}
                    else if(d>=23&&d<=31){System.out.println("Eres virgo");}
                    else{System.out.println("Error.");}
                    break;
                case 9:
                    if(d>=1&&d<=22){System.out.println("Eres virgo");}
                    else if(d>=23&&d<=31){System.out.println("Eres libra");}
                    else{System.out.println("Error.");}
                    break;
                case 10:
                    if(d>=1&&d<=22){System.out.println("Eres libra");}
                    else if(d>=23&&d<=31){System.out.println("Eres escoripio");}
                    else{System.out.println("Error.");}
                    break;
                case 11:
                    if(d>=1&&d<=21){System.out.println("Eres escorpio");}
                    else if(d>=22&&d<=31){System.out.println("Eres sagitario");}
                    else{System.out.println("Error.");}
                    break;
                case 12:
                    if(d>=1&&d<=21){System.out.println("Eres sagitario");}
                    else if(d>=22&&d<=31){System.out.println("Eres capricorio");}
                    else{System.out.println("Error.");}
                    break;
                default:
                    System.out.println("El mes introducido no existe: ");
                    break;
            }
        } else {
            System.out.println("El día de nacimiento tiene que estar dentro del mes");
        }
    }
}
			 
			
