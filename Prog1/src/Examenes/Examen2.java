package Examenes;
import java.util.*;
public class Examen2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, dig, cpar=0, pos=0, may=0, maypos=0;
		System.out.print("Introduce un n�mero que tenga 5 cifras: ");
		n = sc.nextInt();
		while(n<10000 || n>100000) {
			System.out.println("ERROR. Introduce un n�mero v�lido (5 cifras)");
			n = sc.nextInt();
		}
		do {
			System.out.println("");
			System.out.print(n+": ");
			for(int i=1;i<=5;i++) {
				pos++;
				dig=n%10;
				n=n/10;
				if(dig%2==0) 
					cpar++;
				if(dig>may) {
					may=dig;
					maypos=pos;
				}
			}
		
			System.out.println("Total de cifras pares: "+cpar+". Total de cifras impares: "+(5-cpar));
			System.out.println("D�gito mayor: "+may+". Posici�n desde el final: "+maypos);
			
			System.out.println("");
			System.out.println("Introduzca un nuevo n�mero de 5 cifras para realizar otra ejecuci�n, o introduce 0 para terminar el programa");
			n = sc.nextInt();
			while((n<10000 || n>100000) && n!=0) {
				System.out.println("ERROR. Introduce un n�mero de 5 cifras para realizar otra ejecuci�n, o introduce 0 para terminar el programa");
				n = sc.nextInt();
			}
		
		}while(n!=0);
		
		System.out.println("Programa finalizado");
	}

}
