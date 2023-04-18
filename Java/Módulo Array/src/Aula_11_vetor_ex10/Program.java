package Aula_11_vetor_ex10;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Rent[] vect = new Rent[10];

		System.out.println("Quantos quartos serão alugados?");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.printf("Aluguel %d#\n", i);
			sc.nextLine();

			System.out.printf("Nome :");
			String name = sc.nextLine();

			System.out.print("Email :");
			String email = sc.nextLine();

			System.out.print("Quarto :");
			int room = sc.nextInt();

			vect[room] = new Rent(name, email);

		}

		System.out.println("\nRegistro:");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.printf("%d -> %s\n", i, vect[i]);
			}
		}

		sc.close();
	}

}
