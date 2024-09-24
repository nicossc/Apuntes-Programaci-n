import java.util.Scanner;
public class Exa_1 {

	public static void main(String[] args) {
		double num, divi, acumula, pow;
		int n,conta;
		Scanner sc = new Scanner(System.in);
		/* Numero tope */
		System.out.print("Introduce un numero: ");
		num = sc.nextDouble();
		/* Potencia N */
		System.out.print("Introduce n: ");
		n = sc.nextInt();
		
		/* Comprueba que n sea entero positivo y 
		 * que no sea 0 */
		while (n<=0 && n != 0){
			System.out.print("Numero N no valido, introduce otro numero: ");
			n = sc.nextInt();
		}
		/* Si N es distinto de 0 entra al bucle */
		while (n != 0){
			/* Reinicio el contador y el acumulador
			 *  para la siguiente ronda */
			acumula = 1;
			conta = 2;
			
			/* Mientras el acumulador sea menor 
			 * que el tope, sigue */
			while (acumula <= num) {
				/* Utilizo un contador para el divisor */
				//divi = 1/conta;
				pow =1/Math.pow(conta, n);
				/* Acumulo el resultado de la potencia */
				acumula=acumula + pow;
				conta++;
			}
			System.out.println("Resultado: "+acumula);
			System.out.println();
			
			
			System.out.print("Introduce un numero: ");
			num = sc.nextDouble();
			System.out.print("Introduce n: ");
			n = sc.nextInt();
			while (n<=0 && n != 0){
				System.out.print("Numero N no valido, introduce otro numero: ");
				n = sc.nextInt();
			}
		}
		System.out.println("Fin programa");
		sc.close();
	}

}
