import java.util.Scanner;
public class ExamenA1 {
 public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	 int num = 0, raiz = 0, prob=0;
	 char r='s';
	 
	 System.out.println("Aplicaci�n para calcular la Ra�z Cuadrada por Aproximaciones");
	 System.out.println("************************************************************");
	
	 		while (r == 's') {
	 			 System.out.println("Introducir un n�mero: ");
	 			 num = sc.nextInt(); 
	 			 while (num < 0) {
	 				 System.out.println("N�mero incorrecto. Introducir un numero positivo: ");
	 				 num = sc.nextInt(); 
	 			 }
	 			 prob = 0;
	 		  do {
	 			  prob++;
				  raiz = prob * prob;
				
			 } while ( raiz <= num);
			 System.out.println();
			 System.out.println("El resultado es " + (prob-1) + ", con resto " + (num - ((prob-1) * (prob-1)) ));
			
		    System.out.println();
	 		System.out.println("Desea continuar?(S/N)");
		 	r = sc.next().charAt(0);
		 	r = Character.toLowerCase(r);
		 }
	 	 System.out.println("Fin de Programa.");
	 	}	 	
	 }

