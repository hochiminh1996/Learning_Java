package Aula_10_Exercicio;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ArrayList<Taxpayer> lista = new ArrayList<>();
		Taxpayer taxPayer = null;

		System.out.println("Quantos contribuintes?");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.printf("Contribuinte #%d\n", i + 1);

			System.out.print("Pessoa Física[i]/Pessoa Jurídica[c]: ");
			char e = sc.next().charAt(0);

			if (!(e == 'i') && !(e == 'c')) {
				System.out.println("Opção inválida");
				return;
			}

			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();

			System.out.print("Renda Anual: R$ ");
			Double renda = sc.nextDouble();

			if (e == 'c') {
				System.out.println("Pessoa Jurídica...");
				System.out.print("Número de funcionários: ");
				Integer q = sc.nextInt();

				taxPayer = new Company(name, renda, q);

			} else if (e == 'i') {
				System.out.println("Pessoa Física...");
				System.out.print("Gastos com saúde: ");
				Double heath = sc.nextDouble();

				taxPayer = new Individual(name, renda, heath);

			}

			if (taxPayer != null) {
				lista.add(taxPayer);
			}
			System.out.println();
		}


		System.out.println("CONTRIBUINTES:");
		Double sum = 0.0;

		for (Taxpayer t : lista) {
			System.out.println(t);
		}

		for (Taxpayer t : lista) {
			sum += t.tax();
		}

		System.out.println("Imposto total:" + String.format("%.2f", sum));

		sc.close();

	}
}
