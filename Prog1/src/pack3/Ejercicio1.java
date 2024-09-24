package pack3;
import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Introduce un número entero entre 1 y 3");
		n = sc.nextInt();
		
		switch(n) {
		case 1:
			System.out.println("Uno");
			break;
		case 2:
			System.out.println("Dos");
			break;
		case 3:
			System.out.println("Tres");
			break;
		default:
			System.out.println("Ha introducido un número no válido");
		}

	}

}
