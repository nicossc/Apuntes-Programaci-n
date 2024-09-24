package pack5;
import java.util.*;
public class Floyd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m=1, v=1;
		System.out.println("¿Cuántas filas quieres mostrar?");
		n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			while(v<=i) {
			System.out.print(m);
			m++;
			v++;
			}
			v=1;
			System.out.println("");
		}

	}

}
