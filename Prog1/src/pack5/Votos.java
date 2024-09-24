package pack5;
import java.util.*;
public class Votos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int voto, v1=0, v2=0, v3=0;
		
		for(int i=1;i<=100;i++) {
			System.out.println("Introduce el voto: 1, 2 o 3");
			voto=sc.nextInt();
			while(voto!=1 & voto!=2 & voto!=3) {
				System.out.println("ERROR. Introduce un voto válido");
				voto=sc.nextInt();
			}
			switch(voto) {
			case 1:
				v1+=1;
				break;
			case 2:
				v2+=1;
				break;
			case 3:
				v3+=1;
				break;
			}
			
		}
		
		if(v1>v2 & v1>v3)
			System.out.println("Ganador: Candidato 1. Número de votos: "+v1);
		else if(v2>v1 & v2>v3)
			System.out.println("Ganador: Candidato 2. Número de votos: "+v2);
		else if(v3>v2 & v3>v1)
			System.out.println("Ganador: Candidato 3. Número de votos: "+v3);
		else if(v1==v2 & v1>v3)
			System.out.println("Han ganado empatando los candidatos 1 y 2. Numero de votos: "+v1);
		else if(v1==v3 & v1>v2)
			System.out.println("Han ganado empatando los candidatos 1 y 3. Numero de votos: "+v1);
		else if(v2==v3 & v2>v1)
			System.out.println("Han ganado empatando los candidatos 2 y 3. Numero de votos: "+v2);
	}

}
