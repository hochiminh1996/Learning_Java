package Aula_08_exercicios_if;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_10_bhaskara {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double a, b, c, delta, x1, x2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Lado A:");
		a = sc.nextDouble();

		System.out.println("Lado B:");
		b = sc.nextDouble();

		System.out.println("Lado C:");
		c = sc.nextDouble();

		delta = Math.pow(b, 2) - 4 * a * c;
		// delta

		if (a == 0 || delta < 0) {
			System.out.println("Não foi possível calcular");
		} else {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);

			System.out.printf("Delta : %.2f\n", delta);
			System.out.printf("x1 = %.5f\nx2 = %.5f", x1, x2);
		}

		sc.close();

	}

}
