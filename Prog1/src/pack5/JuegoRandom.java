package pack5;
import java.util.*;
public class JuegoRandom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int n, m, im, i=0, g;
		char c;
		
		do {
		System.out.println("Se seleccionará un número al azar");
		System.out.println("¿Hasta que valor puede llegar el número?");
		m = sc.nextInt();
		System.out.println("¿Cuantos intentos quieres?");
		im = sc.nextInt();
		n = rd.nextInt(m)+1;
		
		do {
			i+=1;
			System.out.println("Intenta adivinar el número, intento " +i);
			g = sc.nextInt();
			if(g<n)
				System.out.println("Incorrecto. El número es mayor");
			else if(g>n)
				System.out.println("Incorrecto. El número es menor");
			else
				System.out.println("Correcto, has acertado el número en " +i+ " intentos");
			if (i==im & g!=n) {
				System.out.println("El número era " +n);
			}
		}while(i<im & g!=n);
		
		System.out.println("¿Quieres jugar otra vez? (S/N)");
		c = sc.next().charAt(0);
		c = Character.toUpperCase(c);
		while(c!='N' & c!='S'){
			System.out.println("Carácter inválido. ¿Quieres jugar otra vez? (S/N)");
			c = sc.next().charAt(0);
			c = Character.toUpperCase(c);
			}
		i=0;
		}while(c=='S');
	}

}
