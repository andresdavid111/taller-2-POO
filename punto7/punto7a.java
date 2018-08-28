package punto7;
import java.util.Scanner;

public class punto7a {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numero;
		int resultado;
		int i;
		System.out.println("ingrese un numero ");
		numero = sc.nextInt();
		for(i=1;i<13;i++) {
			resultado=numero*i;
			System.out.println(""+numero+" x "+i+" = "+resultado);

			
		}
		
	}

}
