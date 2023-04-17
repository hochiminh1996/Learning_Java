package Aula_04_vetor_ex3;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme
		 * exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar também
		 * a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas
		 * pessoas caso houver.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas? ");
		int n = sc.nextInt();

		Person[] pessoas = new Person[n];

		for (int i = 0; i < pessoas.length; i++) {
			sc.nextLine();

			System.out.printf("%dº Nome :", i + 1);
			String nome = sc.nextLine();

			System.out.printf("Altura :", i + 1);
			double altura = sc.nextDouble();

			System.out.printf("Idade :", i + 1);
			int idade = sc.nextInt();

			pessoas[i] = new Person(nome, altura, idade);
			System.out.println();

		}

		System.out.println("\nPessoas:");

		for (int i = 0; i < pessoas.length; i++) {
			System.out.printf("\nPessoa nº%d\nNome : %s\nIdade : %d\nAltura : %.2f", i + 1, pessoas[i].getName(),
					pessoas[i].getIdade(), pessoas[i].getAltura());
			System.out.println();
		}

		double avg = 0;
		int count = 0;

		System.out.println("\nPessoas com idade < 16");
		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i].getIdade() < 16) {
				count++;

				System.out.printf("Nome : %s\n", pessoas[i].getName());
			}

			avg += pessoas[i].getAltura();
		}
		double por = (100.0 / pessoas.length) * count;

		System.out.printf("\nMédia de Altura : %.2f\n", avg / pessoas.length);
		System.out.printf("Porcentagem  de pessoas com menos de 16 anos: %.2f ", por);

		sc.close();
	}

}
