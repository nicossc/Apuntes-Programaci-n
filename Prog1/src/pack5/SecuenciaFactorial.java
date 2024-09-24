package pack5;
import java.util.*;
public class SecuenciaFactorial {

	public static void main(String[] args) {
		int n, m;
		float fac, s=0;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Introduce el número máximo del factorial");
		n=sc.nextInt();
		do {
			System.out.print("1/1! ");
			for(int i=2;i<=n;i++) {
				System.out.print("+ ");
				System.out.print("1/"+i+"!");
			}
		
			System.out.print(" = ");
		
			for(m=1;m<=n;m++) {
				fac=1;
				for(int i=1;i<=m;i++) {
					fac = fac * i;
				}
				s=s+1/fac;
			}
			System.out.println(s);
			
			System.out.println("Introduce otro número (negativo para terminar)");
			n=sc.nextInt();
			s=0;
		}while(n>=0);
	}

}
