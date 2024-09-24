package pack5;
import java.util.*;
public class DoWhile1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		char o;
		do {
			System.out.print("Introduce un número: ");
			n=sc.nextInt();
			System.out.println(n);
			System.out.println("¿Continuar(S/N)?");
			o=sc.next().charAt(0);
			o=Character.toUpperCase(o);
			while(o!='N' & o!='S') {
				System.out.println("Caracter inválido, introduce S o N.");
				o=sc.next().charAt(0); o=Character.toUpperCase(o);
			}
		}while(o=='S');

	}

}
