package punto3;
import java.util.Scanner;
public class punto3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		float numero;
		float Fare;
		System.out.println("ingrese un numero de grados centigrados ");
		numero = sc.nextInt();
		Fare = 9* numero;
		Fare = Fare/5;
		Fare = Fare+32;
		
		System.out.println(""+Fare);
				

	}

}
