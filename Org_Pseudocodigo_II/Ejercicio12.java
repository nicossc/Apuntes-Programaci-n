package pack2;
import java.util.*;
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Introduce un número distinto de 0");
		n = sc.nextInt();
		
		if (n%2==0)
			System.out.println("El número es par");
		else
			System.out.println("El número es impar");

	}

}
