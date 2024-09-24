package pack6;
import java.util.*;
public class Root {
	public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 int num = 0, raiz = 0, prob=0;
		 char cont='s';
		
		 //Pedir y validar número
		 while (cont == 'S') {
		 	 System.out.println("Introduce un número positivo: ");
		 	 num = sc.nextInt(); 
		 	 while (num < 0) {
					 System.out.println("ERROR. Introduce un numero positivo: ");
		 			 num = sc.nextInt(); 
		 	 }
		 	 //Reiniciar el posible resultado
		 	 prob = 0;
		 	 //Comprobar número por número hasta que salga el resultado
		 	 do {
		 		prob++;
				raiz = prob * prob;
			 } while ( raiz <= num);
		 	 //Mostrar el resultado y el resto de la operación
		 	 System.out.println();
		 	 System.out.println("Raíz: " + (prob-1) + ". Resto: " + (num - ((prob-1) * (prob-1)) ));
			
		 	 //Preguntar nueva ejecucuón
		 	 System.out.println();
		 	 System.out.println("¿Continuar?(S/N)");
		 	 cont = sc.next().charAt(0);
		 	 cont = Character.toUpperCase(cont);
		 	 while(cont!='S' & cont!='N') {
		 		 System.out.println("ERROR. ¿Continuar?(S/N)");
		 		 cont = sc.next().charAt(0);
		 		 cont = Character.toUpperCase(cont);
		 	 }
		 	 
		 }
		 
	}

}
