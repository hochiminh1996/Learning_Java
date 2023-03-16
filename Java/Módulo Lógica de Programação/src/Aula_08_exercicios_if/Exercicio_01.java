package Aula_08_exercicios_if;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		int number;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		number = sc.nextInt();
		
		sc.close();
		
		if(number >=0) {
			System.out.println("Número positivo");
		}else {
			System.out.println("Número negativo");
		}
		
		
	}

}
