package pack2;
import java.util.*;
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Introduce un n�mero distinto de 0");
		n = sc.nextInt();
		
		if (n%2==0)
			System.out.println("El n�mero es par");
		else
			System.out.println("El n�mero es impar");

	}

}
