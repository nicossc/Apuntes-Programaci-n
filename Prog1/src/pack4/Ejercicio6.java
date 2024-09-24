package pack4;
import java.util.*;
public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, c, pos, neg;
		
		pos=0;
		neg=0;
		for (c=1;c<=10;c+=1) {
			System.out.println("Introduce un número");
			n=sc.nextInt();
			if(n<0) {
				System.out.println(n+ " es negativo");
				neg+=1;}
			else {
				System.out.println(n+ " es positivo");
			pos+=1;}
		System.out.println("Negativos: " +neg+ ". Positivos: " +pos);
		}

	}

}
