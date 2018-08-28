package punto2;
import java.util.Scanner;

public class punto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int numero;
		int doble;
		int cuadruple;
		int quintuple;
		
		System.out.println("ingrese un numero");
		numero = sc.nextInt();
		doble=numero*numero;
		System.out.println("doble:"+doble);
		cuadruple=doble*numero*numero;
		System.out.println("cuadruple:"+cuadruple);
		quintuple=cuadruple*numero;
		System.out.println("quintuple:"+quintuple);
		sc.close();
		
		
		

	}

}
