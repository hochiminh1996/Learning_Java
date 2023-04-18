package Aula_10_vetor_ex9;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas?");

		int n = sc.nextInt();

		Person[] pessoas = new Person[n];

		for (int i = 0; i < pessoas.length; i++) {
			System.out.printf("Dados da %dº pessoa \n", i + 1);
			sc.nextLine();

			System.out.printf("Nome:");
			String name = sc.nextLine();

			System.out.printf("Idade:");
			int age = sc.nextInt();

			pessoas[i] = new Person(name, age);

			System.out.println();

		}

		System.out.println();
		Person mAgeRef = null;// armazena uma referência ao objt com maior idade
		int maiorIdade = 0;// maiorIdade p/ titulo de comparacao

		for (int i = 0; i < pessoas.length; i++) {
			System.out.printf("%dº Pessoa  \nNome : %s\nIdade : %d\n\n", i + 1, pessoas[i].getName(),
					pessoas[i].getAge());

			if (pessoas[i].getAge() >= maiorIdade) {
				maiorIdade = pessoas[i].getAge();
				mAgeRef = pessoas[i];
			}
		}

		System.out.printf("\nPessoa mais velha : %s\nIdade : %d", mAgeRef.getName(), mAgeRef.getAge());

		sc.close();
	}

}
