package pack4;
import java.util.*;
public class NotasIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=1, n, sus=0, apr=0, bien=0, not=0, sob=0;
		while(a<=20) {
			System.out.println("Introduce la nota del alumno n�mero " +a);
			n=sc.nextInt();
			while (n<0 || n>10) {
				System.out.println("Nota erronea, por favor, introduce una nota v�lida");
				System.out.println("Introduce la nota del alumno n�mero " +a);
				n=sc.nextInt();
			}
			if(n<5)
				sus+=1;
			else if(n==5)
				apr+=1;
			else if(n==6)
				bien+=1;
			else if(n<9)
				not+=1;
			else
				sob+=1;
			a++;
		}
		System.out.println("Suspensos: "+(sus*100/20)+"%");
		System.out.println("Aprobados: "+(apr*100/20)+"%");
		System.out.println("Bienes: "+(bien*100/20)+"%");
		System.out.println("Notables: "+(not*100/20)+"%");
		System.out.println("Sobresalientes: "+(sob*100/20)+"%");
		
		System.out.println("Han superado el m�dulo: "+(100-(sus*100/20))+"%");
		
	}

}
