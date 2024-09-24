package pack4;
import java.util.*;
public class NotasModulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=1, n, sus=0, apr=0, bien=0, not=0, sob=0;
		while(a<=20) {
			System.out.println("Introduce la nota del alumno número " +a);
			n=sc.nextInt();
			while (n<0 || n>10) {
				System.out.println("Nota erronea, por favor, introduce una nota válida");
				System.out.println("Introduce la nota del alumno número " +a);
				n=sc.nextInt();
			}
			switch(n) {
			case 0,1,2,3,4:
				sus+=1;
				break;
			case 5:
				apr+=1;
				break;
			case 6:
				bien+=1;
				break;
			case 7,8:
				not+=1;
			break;
			case 9,10:
				sob+=1;
			break;
			}
			a++;
		}
			System.out.println("Suspensos: "+(sus*100/20)+"%");
			System.out.println("Aprobados: "+(apr*100/20)+"%");
			System.out.println("Bienes: "+(bien*100/20)+"%");
			System.out.println("Notables: "+(not*100/20)+"%");
			System.out.println("Sobresalientes: "+(sob*100/20)+"%");
			
			System.out.println("Han superado el módulo: "+(100-(sus*100/20))+"%");
		
	}

}
