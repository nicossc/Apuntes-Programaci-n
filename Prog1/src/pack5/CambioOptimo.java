package pack5;
import java.util.*;
public class CambioOptimo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int eur, c;
		char o;
		do {
			System.out.println("Introduce el valor en euros");
			eur = sc.nextInt();
			System.out.println("El cambio óptimo para esta cantidad es: ");
			if(eur>=500) {
				c=eur/500;
				eur%=500;
				System.out.println(c+ " billetes de 500€");
			}
			if(eur>=200) {
				c=eur/200;
				eur%=200;
				System.out.println(c+ " billetes de 200€");
			}
			if(eur>=100) {
				c=eur/100;
				eur%=100;
				System.out.println(c+ " billetes de 100€");
			}
			if(eur>=50) {
				c=eur/50;
				eur%=50;
				System.out.println(c+ " billetes de 50€");
			}
			if(eur>=20) {
				c=eur/20;
				eur%=20;
				System.out.println(c+ " billetes de 20€");
			}
			if(eur>=10) {
				c=eur/10;
				eur%=10;
				System.out.println(c+ " billetes de 10€");
			}
			if(eur>=5) {
				c=eur/5;
				eur%=5;
				System.out.println(c+ " billetes de 5€");
			}
			if(eur>=2) {
				c=eur/2;
				eur%=2;
				System.out.println(c+ " monedas de 2€");
			}
			if(eur>=1) {
				System.out.println("1 moneda de 1€");
			}
			System.out.println("¿Continuar(S/N)?");
			o=sc.next().charAt(0);
			o=Character.toUpperCase(o);
			while(o!='N' & o!='S') {
				System.out.println("Caracter inválido, introduce S o N.");
				o=sc.next().charAt(0); o=Character.toUpperCase(o);}
		}while(o=='S');
		System.out.println("Fin del proceso");

		}
		
	}
	
