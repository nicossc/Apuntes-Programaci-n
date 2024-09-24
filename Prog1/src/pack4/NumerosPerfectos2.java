package pack4;

public class NumerosPerfectos2 {

	public static void main(String[] args) {
		int n=2, s=0, d=1;
		while(n<=10000) {
		while(d<=(n/2)) {
			
			if(n%d==0) {
				s+=d;
			}
			d++;
		}
		if(s==n) {
			System.out.println(n+ " es un número perfecto");
		}
		s=0;
		d=1;
		n++;
		}
		

	}

}
