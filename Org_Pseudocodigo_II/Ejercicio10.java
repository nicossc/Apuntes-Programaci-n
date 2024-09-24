package pack2;
import java.util.*;
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("Introduce el primer número");
		n1 = sc.nextInt();
		System.out.println("Introduce el segundo número");
		n2 = sc.nextInt();
		System.out.println("Introduce el tercer número");
		n3 = sc.nextInt();
		
		if (n1>n2 & n1>n3) {
			if (n2>n3)
				System.out.println(n1 + " > " + n2 + " > " + n3);
			else
				System.out.println(n1 + " > " + n3 + " > " + n2);}
			else if (n2>n1 & n2>n3) {
				if (n1>n3)
					System.out.println(n2 + " > " + n1 + " > " + n3);
				else
					System.out.println(n2 + " > " + n3 + " > " + n1);}
			else if (n3>n1 & n3>n2) {
				if (n1>n2)
					System.out.println(n3 + " > " + n1 + " > " + n2);
				else
					System.out.println(n3 + " > " + n2 + " > " + n1);}
			else
				System.out.println("Hay dos o más números iguales");

	}

}