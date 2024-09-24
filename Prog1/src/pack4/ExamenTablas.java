package pack4;
import java.util.*;
public class ExamenTablas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, c, f;
		
		System.out.println("Introduce la tabla de la que te quieras examinar");
		c=sc.nextInt();
		f=0;
		for (int i=1;i<=10;i++) {
			System.out.println(c+ " x " +i+ " = ");
			n=sc.nextInt();
			if(n==c*i) 
				System.out.println("Correcto");
			else {
				System.out.println("Incorrecto, el resultado es " +(c*i));
				f++;
			}
		}
			if(f<=2)
				System.out.println("Has aprobado la tabla del " +c);
			else
				System.out.println("Has suspendido la tabla del " +c+ ". Inténtalo de nuevo");
			
	}

}
