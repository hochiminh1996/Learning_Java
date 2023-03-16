package Aula_07_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double hora;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a hora");
		hora = sc.nextDouble();

		sc.close();

		if (hora < 6 || hora == 24) {
			System.out.println("Boa Madrugada");
		} else if (hora >= 6 && hora <= 12) {
			System.out.println("Bom dia");
		} else if (hora > 12 && hora <= 18) {
			System.out.println("Boa tarde");
		} else if (hora > 18 && hora < 24) {
			System.out.println("Boa noite");
		}

	}

}
