package pack4;
public class Ejercicio12 {

	public static void main(String[] args) {
		int n=1, sum=0;
		while(n<=200) {
			sum+=n;
			n+=2;
		}
		System.out.println("La suma de todos los impares hasta el 200 es: " +sum);
		n=2;
		sum=0;
		while(n<=200) {
			sum+=n;
			n+=2;
		}
		System.out.println("La suma de todos los pares hasta el 200 es: " +sum);

	}

}
