package pack6;
import java.util.*;
public class Tree {
public static void main(String[] args) {
		
		int alt, may = 0, may_num = 0, elev = 0, acu = 0, tot = 1;
		double med = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce la altura del arbol "+tot+": ");
		alt = sc.nextInt();
		
		// Comprobar altura
		while ((alt<190 || alt > 1225) && alt >= 0){
			System.out.print("ERROR. Introduce una altura válida: ");
			alt = sc.nextInt();
		}
		// Comprobar altura > 0
		while (alt >= 0){
			
			//Aumentar contador de altura elevada
			if (alt >= 500 && alt <= 900) {
				elev++;
			}
			
			//Registrar mayor altura
			if (alt > may) {
				may = alt;
				may_num = tot;
			}
			
			//Altura total de los árboles
			acu+=alt;
			tot++;
			
			//Datos del árbol
			System.out.print("Introduce la altura del arbol "+tot+": ");
			alt = sc.nextInt();
			while ((alt<190 || alt > 1225) && alt >= 0){
				System.out.print("ERROR. Introduce una altura válida: ");
				alt = sc.nextInt();
			}
			
		}
		
		
		//Visualizar datos si los hay
		if (tot != 0) {
			med = (double)acu/tot;
			System.out.println();
			System.out.println("Arbol más alto: Número: "+may_num+". Altura: "+may);
			System.out.println("Altura media: "+med);
			System.out.println("Árboles entre 500 y 900 de altura: "+elev);
		}
		
}

}
