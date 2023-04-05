package Aula_11_while;

import java.util.Locale;
import java.util.Scanner;

public class Aula_03_exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		double pass = 0, senha = 2002;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Digite a senha");
			pass = sc.nextDouble();

			if (pass != senha) {
				System.out.println("Senha incorreta!");
			} else {
				System.out.println("Senha correta.");
				break;
			}
		}

		sc.close();

	}

}
