package punto1;

import java.util.Scanner;

public class punto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num1;
		int num2;
		int num3;
		int num4;
		System.out.println("ingrese los 4 numeros");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		System.out.println("imprimiendo numeros en orden inverso ");
		System.out.println(" " +num4 );
		System.out.println(" " +num3 );
		System.out.println(" " +num2 );
		System.out.println(" " +num1 );
		sc.close();
		
		
	}

}
