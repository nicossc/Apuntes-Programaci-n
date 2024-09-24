package pack5;
import java.util.*;
public class CuboDigitos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=100, dig, m, res=0;
		
		while(n<1000) {
		m=n;
		while(m>0) {
			dig=m%10;
			res+=Math.pow(dig, 3);
			m=m/10;
		}
		if(n==res)
			System.out.println(n);
		n++;
		res=0;
		}

	}

}
