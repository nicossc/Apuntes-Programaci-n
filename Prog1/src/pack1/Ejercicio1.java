package pack1;
import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.println("Introduce el primer n�mero");
		n1 = sc.nextInt();
		System.out.println("Introduce el segundo n�mero");
		n2 = sc.nextInt();
		
		System.out.println("La suma de los n�meros es: " + (n1+n2));
		System.out.println("La resta de los n�meros es: " + (n1-n2));
		System.out.println("La multiplicaci�n de los n�meros es: " + (n1*n2));
		System.out.println("La divisi�n de los n�meros es: " + (n1/n2));

	}

}
