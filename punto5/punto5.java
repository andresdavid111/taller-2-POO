package punto5;
import java.util.Scanner;

public class punto5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		float velocidad;
		float resultado;
		
		System.out.println("ingrese la velocidad en km/h para convertirla en m/s");
		velocidad  = sc.nextFloat();
		resultado= (float) (velocidad/3.6);
		System.out.println(""+resultado);

	}

}
