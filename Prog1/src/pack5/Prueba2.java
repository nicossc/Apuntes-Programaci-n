package pack5;
import java.util.*;
public class Prueba2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int n, p, cpr=0, cant, may=0, c=0;
		
		System.out.println("Introduce la cantidad de números");
		cant = sc.nextInt();
		
		for(int i=1;i<=cant;i++) {
			n = rd.nextInt(99999-10000+1)+10000;
			for(int j=2;j<=(n/2);j++) {
				if(n%j==0)
					c++;
			}
			if(c==0)
				cpr++;
			if(n>may)
				may=n;
		}

	}

}
