package pack4;
import java.util.*;
public class SumaContinuar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,s=0;
		char o='S';
		while(o == 'S') {
			System.out.println("Introduce un n�mero");
			n=sc.nextInt();
			s+=n;
			System.out.println("N�mero registrado. �Continuar? (S/N)");
			o=sc.next().charAt(0);
			o=Character.toUpperCase(o);
			while(o!='S' & o!='N') {
				System.out.println("Por favor, introduce una opci�n v�lida. �Continuar? (S/N)");
				o=sc.next().charAt(0);
			}
		}
		System.out.println("La suma resultante es: " +s);

	}

}
