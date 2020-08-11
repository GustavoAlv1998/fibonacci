package paquete;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int num1 = 0;
		int num2 = 1;
		int temp;
		int limite = 0;
		
		System.out.println("Ingrese un numero");
		limite = entrada.nextInt();
		
		System.out.println(num1);
		System.out.println(num2);
		
		while ( num2 + num1 <= limite) 
		{
			temp = num1;
			num1 = num2;
			num2 = temp + num1;
			System.out.println(num2);
		}
		
		
	}

}
