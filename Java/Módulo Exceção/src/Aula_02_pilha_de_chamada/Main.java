package Aula_02_pilha_de_chamada;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		method01();
		System.out.println("\nPrograma encerrado...");

	}

	public static void method01() {
		System.out.println("*** Começo do método 01 ***");

		method02();

		System.out.println("*** Fim do método 01 ***");

	}

	public static void method02() {
		System.out.println("*** Começo do método 02 ***");
		Scanner sc = new Scanner(System.in);

		// bloco de exceção
		try {
			System.out.print("Vetor de String: ");
			String[] vet = sc.nextLine().split(" ");
			// vetor de string que criará uma posição a cada espaço de separação na string

			System.out.print("Posição: ");
			int position = sc.nextInt();

			System.out.printf("Posição:[%d] -> %s\n", position, vet[position]);

		} catch (Exception e) {
			System.out.println("\nErro: " + e.getMessage());
		}

		sc.close();
		System.out.println("*** Fim do método 02 ***");

	}
}
