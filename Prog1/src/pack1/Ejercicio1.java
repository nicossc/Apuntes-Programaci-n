package pack1;
import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.println("Introduce el primer número");
		n1 = sc.nextInt();
		System.out.println("Introduce el segundo número");
		n2 = sc.nextInt();
		
		System.out.println("La suma de los números es: " + (n1+n2));
		System.out.println("La resta de los números es: " + (n1-n2));
		System.out.println("La multiplicación de los números es: " + (n1*n2));
		System.out.println("La división de los números es: " + (n1/n2));

	}

}
