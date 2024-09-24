import java.util.Scanner;

public class Exa_2 {

	public static void main(String[] args) {
		
		int alt, mayor = 0, mayor_id = 0, comprend = 0, acumu = 0, total = 0;
		double media = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce la altura del arbol "+total+" : ");
		alt = sc.nextInt();
		
		/* Comprobar que la altura esta entre 190-1225
		  y que no sea menor que 0 */
		while ((alt<190 || alt > 1225) && alt >= 0){
			System.out.print("Altura no valida, introduce otra altura: ");
			alt = sc.nextInt();
		}
		/* Si la altura es mayor que 0 entra al bucle */
		while (alt >= 0){
			
			/* Si la altura esta entre 500-900 aumenta
			  el contador */
			if (alt >= 500 && alt <= 900) {
				comprend++;
			}
			
			/* Si la altura es mayor a la mayor altura
			 * registrada, entra */
			if (alt > mayor) {
				mayor = alt;
				mayor_id = total;
			}
			
			/* Acumula la altura total de los arboles */
			acumu+=alt;
			total++;
			
			System.out.print("Introduce la altura del arbol "+total+" : ");
			alt = sc.nextInt();
			while ((alt<190 || alt > 1225) && alt >= 0){
				System.out.print("Altura no valida, introduce otra altura: ");
				alt = sc.nextInt();
			}
			
		}
		
		
		/* Si no se ha introducido ningun valor no entra */
		if (total != 0) {
			media = (double)acumu/total;
			System.out.println();
			System.out.println("Arbol de mayor altura: ID: "+mayor_id+" altura: "+mayor+"");
			System.out.println("Media alturas: "+media);
			System.out.println("500-900: "+comprend);
		}
		System.out.println("Fin programa");
		sc.close();
	}

}
