package punto7;
import java.util.Scanner;
import java.util.Scanner;

public class punto7b {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numero;
		int i;
		int resultado=1;
		System.out.println("ingrese un numero ");
		numero = sc.nextInt();
		for(i=1;i<=numero;i++) {
			resultado=resultado*i;

		}
		System.out.println("el factorial de "+numero+" es "+resultado);

	}

}
