package pack2;
import java.util.*;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Introduce el n�mero");
		n = sc.nextInt();
		
		if (n>=0)
			System.out.println("El cuadrado del n�mero introducido es " +Math.pow(n, 2));
		else
			System.out.println("El n�mero es negativo");

	}

}
