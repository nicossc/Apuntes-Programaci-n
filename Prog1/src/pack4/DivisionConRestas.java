package pack4;
import java.util.*;
public class DivisionConRestas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, div, res, coc=0;
		
		System.out.println("Introduce el número a dividir");
		n = sc.nextInt();
		System.out.println("Introduce el divisor");
		div = sc.nextInt();
		res=n;
		
		while(res>=div) {
			res-=div;
			coc++;
		}
		System.out.println("El cociente es : " +coc);
		System.out.println("El resto es : " +res);

	}

}
