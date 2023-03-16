package Aula_08_exercicios_if;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inicial, fin;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a hora inicial : ");
		inicial = sc.nextInt();

		System.out.println("Digite a hora final : ");
		fin = sc.nextInt();

		sc.close();

		if (inicial == fin) {
			System.out.println("Durou 24h");
		} else if (fin > inicial) {
			System.out.printf("Durou %dh", fin - inicial);
		} else {
			System.out.printf("Durou %dh", 24 - inicial + fin);
		}

	}

}
