package pack2;
import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Introduce el n�mero");
		n = sc.nextInt();
		
		if (n>100)
			System.out.println("El n�mero es mayor que 100");
		else if (n==100)
			System.out.println("El n�mero es 100");
		else
			System.out.println("El n�mero es menor que 100");
		
	}

}
