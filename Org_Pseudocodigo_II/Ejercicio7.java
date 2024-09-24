package pack2;
import java.util.*;
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
		System.out.println("Introduce el primer número");
		n1 = sc.nextInt();
		System.out.println("introduce el segundo número");
		n2 = sc.nextInt();
		
		if (n1%n2==0)
			System.out.println(n1 + " es divisible por " + n2);
		else
			System.out.println(n1 + " no es divisible por " + n2);
		System.out.println("El cociente entero de la división es " + n1/n2);

	}

}
