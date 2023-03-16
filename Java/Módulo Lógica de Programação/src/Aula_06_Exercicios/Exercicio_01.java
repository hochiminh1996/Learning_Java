package Aula_06_Exercicios;

import java.util.Scanner;

public class Exercicio_01 {
	public static void main(String[] args) {
		int n1, n2; 
		
		Scanner sc = new Scanner(System.in);
		//objecto que irá capturar dados de entrada via teclado.
		
		System.out.println("Valor A:");
		n1 = sc.nextInt();
		
		System.out.println("Valor B:");
		n2 = sc.nextInt();

		
		sc.close();
		
		System.out.printf("%d + %d = %d",n1, n2, n1+n2);
		
		
	}
}
