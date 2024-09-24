package pack5;
import java.util.*;
public class Aleatorio {

	public static void main(String[] args) {
		int valor;
		Random ran = new Random();
		valor = ran.nextInt(1000)+1;
		for(int i=1;i<=20;i++) {
			System.out.println(valor);
			valor = ran.nextInt(1000)+1;
		}

	}

}
