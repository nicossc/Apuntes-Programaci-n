package pack5;
import java.util.*;
public class JuegoRandom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int n, m, im, i=0, g;
		char c;
		
		do {
		System.out.println("Se seleccionar� un n�mero al azar");
		System.out.println("�Hasta que valor puede llegar el n�mero?");
		m = sc.nextInt();
		System.out.println("�Cuantos intentos quieres?");
		im = sc.nextInt();
		n = rd.nextInt(m)+1;
		
		do {
			i+=1;
			System.out.println("Intenta adivinar el n�mero, intento " +i);
			g = sc.nextInt();
			if(g<n)
				System.out.println("Incorrecto. El n�mero es mayor");
			else if(g>n)
				System.out.println("Incorrecto. El n�mero es menor");
			else
				System.out.println("Correcto, has acertado el n�mero en " +i+ " intentos");
			if (i==im & g!=n) {
				System.out.println("El n�mero era " +n);
			}
		}while(i<im & g!=n);
		
		System.out.println("�Quieres jugar otra vez? (S/N)");
		c = sc.next().charAt(0);
		c = Character.toUpperCase(c);
		while(c!='N' & c!='S'){
			System.out.println("Car�cter inv�lido. �Quieres jugar otra vez? (S/N)");
			c = sc.next().charAt(0);
			c = Character.toUpperCase(c);
			}
		i=0;
		}while(c=='S');
	}

}
