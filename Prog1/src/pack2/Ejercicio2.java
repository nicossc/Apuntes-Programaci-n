package pack2;
import java.util.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Introduce el n�mero");
		n = sc.nextInt();
		
		if (n==0)
			System.out.println("El n�mero es nulo");
		else if (n<0)
			System.out.println("El n�mero es negativo");
		else
			System.out.println("El n�mero es positivo");

	}

}
