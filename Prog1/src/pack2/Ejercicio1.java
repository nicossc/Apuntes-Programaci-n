package pack2;
import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Introduce el número");
		n = sc.nextInt();
		
		if (n>100)
			System.out.println("El número es mayor que 100");
		else if (n==100)
			System.out.println("El número es 100");
		else
			System.out.println("El número es menor que 100");
		
	}

}
