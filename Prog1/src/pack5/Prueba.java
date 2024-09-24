package pack5;
import java.util.*;
public class Prueba {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, dig, aux, inv=0;
		n=sc.nextInt();
		aux=n;
		while(aux!=0) {
			dig=aux%10;
			inv=inv*10+dig;
			aux=aux/10;
		}
		while(inv!=0) {
			dig=inv%10;
			inv=inv/10;
			System.out.println(dig);
		}

	}

}
