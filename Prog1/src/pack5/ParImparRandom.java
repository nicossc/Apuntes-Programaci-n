package pack5;
import java.util.*;
public class ParImparRandom {

	public static void main(String[] args) {
		int valor, p=0, im=0;
		Random ran = new Random();
		for(int i=1;i<=100;i++) {
			valor = ran.nextInt(10);
			System.out.print(valor+" ");
			if(valor%2==0) 
				p++;
			else
				im++;
		}
		System.out.println("Pares : "+p);
		System.out.println("Impares : "+im);

	}

}
