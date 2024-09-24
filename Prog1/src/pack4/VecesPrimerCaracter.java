package pack4;
import java.util.*;
public class VecesPrimerCaracter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c, ci;
		int v=0;
		System.out.println("Introduce un caracter");
		ci=sc.next().charAt(0);
		for(int i=1;i<10;i++) {
			System.out.println("Introduce un caracter");
			c=sc.next().charAt(0);
			if(c==ci)
				v++;
		}
		System.out.println("El caracter " +ci+ " se ha repetido " +v+ " veces (sin contar la inicial)");

	}

}
