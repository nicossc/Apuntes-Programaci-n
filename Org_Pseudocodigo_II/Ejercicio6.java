package pack2;
import java.util.*;
public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("Introduce el primer n�mero");
		n1 = sc.nextInt();
		System.out.println("Introduce el segundo n�mero");
		n2 = sc.nextInt();
		System.out.println("Introduce el tercer n�mero");
		n3 = sc.nextInt();
		
		if (n1<0)
			System.out.println(n1 + " * " + n2 + " * " + n3 + " = " + (n1*n2*n3));
		else
			System.out.println(n1 + " + " + n2 + " + " + n3 + " = " + (n1+n2+n3));

	}

}
