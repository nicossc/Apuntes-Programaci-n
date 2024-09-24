package pack5;
import java.util.*;
public class Bolas {

	public static void main(String[] args) {
		int b, p;
		char o;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		System.out.println("Introduce el precio inicial");
		p = sc.nextInt();
		while(p<=0) {
			System.out.println("ERROR. Introduce el precio inicial");
			p = sc.nextInt();
		}
		
		do {
			b = rd.nextInt(5)+1;
			switch(b) {
			case 1:
				System.out.println("Ha salido una bola blanca");
				System.out.println("Descuento del 0%, el precio final es "+p);
				break;
			case 2:
				System.out.println("Ha salido una bola verde");
				System.out.println("Descuento del 10%, el precio final es "+(p-(p*0.1)));
				break;
			case 3:
				System.out.println("Ha salido una bola amarilla");
				System.out.println("Descuento del 25%, el precio final es "+(p-(p*0.25)));
				break;
			case 4:
				System.out.println("Ha salido una bola azul");
				System.out.println("Descuento del 50%, el precio final es "+(p-(p*0.5)));
				break;
			case 5:
				System.out.println("Ha salido una bola roja");
				System.out.println("Descuento del 100%, el precio final es "+(p-(p*1)));
				break;
			}
			
			System.out.println("Introduce el precio inicial de la compra (0 para terminar)");
			p = sc.nextInt();
			while(p<0) {
				System.out.println("ERROR, NUMERO NEGATIVO. Introduce el precio inicial");
				p = sc.nextInt();
			}
			
		}while(p!=0);

	}

}
