package pack2;
import java.util.*;
public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		char oper;
		System.out.println("�Qu� operaci�n quieres hacer? (+ suma - resta * multiplicaci�n / divisi�n r resto)");
		oper = sc.next().charAt(0);
		System.out.println("Introduce el primer n�mero");
		n1 = sc.nextInt();
		System.out.println("Introduce el segundo n�mero");
		n2 = sc.nextInt();
		
		if (oper == '+')
			System.out.println(n1 + " + " + n2 + " = " +(n1+n2));
		else if (oper == '-')
			System.out.println(n1 + " - " + n2 + " = " +(n1-n2));
		else if (oper == '*')
			System.out.println(n1 + " * " + n2 + " = " +(n1*n2));
		else if (oper == '/')
			System.out.println(n1 + " / " + n2 + " = " +(n1/n2));
		else if (oper == 'r')
			System.out.println("El resto de la operaci�n " + n1 + " / " + n2 + " es " +(n1%n2));
		else System.out.println("Por favor, selecciona un operador v�lido");
		

	}

}
