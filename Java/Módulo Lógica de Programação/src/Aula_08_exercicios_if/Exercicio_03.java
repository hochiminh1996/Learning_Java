package Aula_08_exercicios_if;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, number2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número:");
		number = sc.nextInt();
		
		System.out.println("Digite um número:");
		number2 = sc.nextInt();
		
		sc.close();
		
		if(number % number2 == 0 || number2 % number ==0) {
			System.out.println("São números múltiplos");
		}else {
			System.out.println("Não são números múltiplos");
		}
		
	}

}
