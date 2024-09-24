package pack4;
import java.util.*;
public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		
		System.out.println("Introduce números positivos, para terminar, introduce el -99");
		n=sc.nextInt();
		
		while(n<=0 & n!=-99) {
			System.out.println("NUMERO NO VALIDO");
			System.out.println("Introduce un número entero positivo distinto de 0, o -99 para terminar");
			n=sc.nextInt();
		}
		m=n;
		while(n!=-99) {
			n=sc.nextInt();
			if(n>m)
				m=n;
		}
		System.out.println("El mayor de los números introducidos es: " +m);

	}

}
