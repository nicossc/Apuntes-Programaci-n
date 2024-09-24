package pack3;
import java.util.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		char oper;
		System.out.println("¿Qué operación quieres hacer? (+ suma - resta * multiplicación / división)");
		oper = sc.next().charAt(0);
		System.out.println("Introduce el primer número");
		n1 = sc.nextInt();
		System.out.println("Introduce el segundo número");
		n2 = sc.nextInt();
		
		if (oper == '+')
			System.out.println(n1 + " + " + n2 + " = " +(n1+n2));
		else if (oper == '-')
			System.out.println(n1 + " - " + n2 + " = " +(n1-n2));
		else if (oper == '*')
			System.out.println(n1 + " * " + n2 + " = " +(n1*n2));
		else if (oper == '/')
			System.out.println(n1 + " / " + n2 + " = " +(n1/n2));
		else System.out.println("Por favor, selecciona un operador válido");

	}

}
