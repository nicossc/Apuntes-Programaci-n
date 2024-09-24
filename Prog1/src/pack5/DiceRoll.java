package pack5;
import java.util.*;
public class DiceRoll {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int n, r, uno=0, dos=0, tres=0, cuatro=0, cinco=0, seis=0;
		
		System.out.println("¿Cuántas veces quieres lanzar el dado?");
		n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			r = rd.nextInt(6)+1;
			switch(r) {
			case 1:
				uno++;
				break;
			case 2:
				dos++;
				break;
			case 3:
				tres++;
				break;
			case 4:
				cuatro++;
				break;
			case 5:
				cinco++;
				break;
			case 6:
				seis++;
				break;
			}
			
			
			
		}
		System.out.println("Han salido los siguientes resultados");
		System.out.println("1: "+uno);
		System.out.println("2: "+dos);
		System.out.println("3: "+tres);
		System.out.println("4: "+cuatro);
		System.out.println("5: "+cinco);
		System.out.println("6: "+seis);

	}

}
