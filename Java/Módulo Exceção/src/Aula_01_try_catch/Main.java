package Aula_01_try_catch;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Uma exceção é qualquer condição de erro ou comportamento inesperado
		// encontrado por um programa em execução.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// bloco de exceção
		try {
			System.out.print("Vetor de String: ");
			String[] vet = sc.nextLine().split(" ");
			// vetor de string que criará uma posição a cada espaço de separação na string

			System.out.print("Posição: ");
			int position = sc.nextInt();

			System.out.printf("Posição:[%d] -> %s", position, vet[position]);

		} catch (Exception e) {
			System.out.println("\nErro: " + e.getMessage());
		}

		System.out.println("\nPrograma encerrado...");

		sc.close();
	}

}
