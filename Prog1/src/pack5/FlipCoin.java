package pack5;
import java.util.*;
public class FlipCoin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int n, r, c=0;
		
		System.out.println("¿Cuántas veces quieres lanzar la moneda?");
		n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			r = rd.nextInt(2);
			if(r==0) 
				c++;
		}
		System.out.println("Ha salido cara " +c+ " veces de un total de " +n);

	}

}
