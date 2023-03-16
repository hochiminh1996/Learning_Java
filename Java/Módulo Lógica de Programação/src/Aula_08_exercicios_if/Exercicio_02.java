package Aula_08_exercicios_if;

import java.util.Scanner;

public class Exercicio_02 {
	public static void main(String[] args) {
		int number;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		number = sc.nextInt();
		
		sc.close();
		
		if(number % 2 ==0) {
			System.out.printf("%d é par", number);
		}else {
			System.out.printf("%d é impar", number);
		}
		
	}
}
