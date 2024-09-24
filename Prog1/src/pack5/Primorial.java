package pack5;
import java.util.*;
public class Primorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, primorial=1;
		do {
			System.out.println("Introduce un número positivo");
			n=sc.nextInt();
		}while(n<0);
		do {
			System.out.print(n+"#= ");
		for(int nume=2;nume<=n;nume++) {
			int c=0;
			for(int j=2;j<=(nume/2);j++) {
				if(nume%j==0)
					c++;											
			}
			if(c==0) {
				System.out.print(nume+" ");
				primorial=primorial*nume;
			}
		}
		System.out.println("= "+primorial);
		do {
			System.out.println("Introduce un número positivo, o -99 para terminar");
			n=sc.nextInt();
		}while(n<0 & n!=-99);
		primorial=1;
		
		}while(n!=-99);
	}

}
