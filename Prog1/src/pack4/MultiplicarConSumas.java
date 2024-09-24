package pack4;
import java.util.*;
public class MultiplicarConSumas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, v=1, m=0;
		System.out.println("Introduce el primer número");
		n1=sc.nextInt();
		System.out.println("Introduce el segundo número");
		n2=sc.nextInt();
		if(n1>n2) {
			m=n1;
		while(v<n2) {
			m+=n1;
			v++;
		}
		}
		if(n2>n1) {
			m=n2;
			while(v<n1) {
				m+=n2;
				v++;
			}
		}
		System.out.println("El resultado es: " +m);

	}

}
