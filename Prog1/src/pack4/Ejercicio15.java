package pack4;
import java.util.*;
public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		double x, pot;
		
		System.out.println("X^N");
		System.out.println("Introduce un valor de X");
		x = sc.nextDouble();
		while(x==0) {
			System.out.println("NUMERO NO VALIDO "+
					"Introduce un n�mero distinto de 0");
			x=sc.nextDouble();
		}
		System.out.println("Introduce un valor de N");
		n = sc.nextInt();
		while (n<0) {
			System.out.println("NUMERO NO V�LIDO ");
			System.out.println("Introduce un n�mero positivo");
			n=sc.nextInt();
		}
		
		pot=x;
		for(int i=1;i<n;i++) {
			pot=pot*x;
		}
		System.out.println("El resultado es: " +pot);

	}

}
