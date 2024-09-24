package pack5;
import java.util.*;
public class Capicua {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, aux, inv=0, dig;
		do {
			System.out.println("Introduce un número mayor o igual que 10");
			n=sc.nextInt();
		}while(n<10);
		
		do {
		aux=n;
		while(aux!=0) {
			dig=aux%10;
			inv=inv*10+dig;
			aux=aux/10;
		}
		if(inv==n)
			System.out.println("El número "+n+" es capicúa");
		else
			System.out.println("El número "+n+" no es capicúa");
		do {
			System.out.println("Introduce otro número mayor o igual que 10, o 0 para terminar");
			n=sc.nextInt();
		}while(n<=10 && n!=0);
		inv=0;
		}while(n!=0);
	}

}
