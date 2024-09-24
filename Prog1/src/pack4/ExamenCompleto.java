package pack4;
import java.util.*;
public class ExamenCompleto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, c, f;
		
		f=0;
		for(c=1;c<=10;c++) {
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

}