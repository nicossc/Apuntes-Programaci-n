package pack6;
import java.util.*;
public class Pot {
	public static void main(String[] args) {
		double num, div, acu, pow;
		int n,cont;
		Scanner sc = new Scanner(System.in);
		//Número máximo
		System.out.print("Introduce un numero: ");
		num = sc.nextDouble();
		//Potencia N
		System.out.print("Introduce n: ");
		n = sc.nextInt();
		
		//Comprobar valor N positivo
		while (n<=0 && n != 0){
			System.out.print("Numero N no valido, introduce otro numero: ");
			n = sc.nextInt();
		}
		//Comprobar N distinto de 0
		while (n != 0){
			//Reiniciar contador y acumulador
			acu = 1;
			cont = 2;
			
			//Comprobar acumulador menor que tope
			while (acu <= num) {
				//Contador divisor
				div = 1/cont;
				pow =1/Math.pow(cont, n);
				//Acumular potencia
				acu=acu + pow;
				cont++;
			}
			System.out.println("Resultado: "+acu);
			System.out.println();
			
			//Repetir
			System.out.print("Introduce un numero: ");
			num = sc.nextDouble();
			System.out.print("Introduce n: ");
			n = sc.nextInt();
			while (n<=0 && n != 0){
				System.out.print("Numero N no valido, introduce otro numero: ");
				n = sc.nextInt();
			}
			
		}
		
	}

}
