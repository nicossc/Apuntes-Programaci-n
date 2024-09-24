package pack4;
import java.util.*;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c;
		int v;
		
		for (v=1;v<=5;v+=1) {
			System.out.println("Introduce un carácter");
			c=sc.next().charAt(0);
			System.out.println(c);
		}
	}

}