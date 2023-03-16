package Aula_06_Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		double a, b, c, tri, circle, trap, square, re;

		Scanner sc = new Scanner(System.in);

		System.out.println("VALOR A:");
		a = sc.nextDouble();

		System.out.println("VALOR B:");
		b = sc.nextDouble();

		System.out.println("VALOR B:");
		c = sc.nextDouble();

		sc.close();

		tri = a * c / 2;
		circle = 3.14159 * Math.pow(c, 2);
		trap = (a + b) / 2 * c;
		square = b * b;
		re = a * b;

		System.out.printf("Triangulo : %.3f\n", tri);
		System.out.printf("Circulo : %.3f\n", circle);
		System.out.printf("Trapézio : %.3f\n", trap);
		System.out.printf("Quadrado : %.3f\n", square);
		System.out.printf("Retângulo : %.3f\n", re);

	}

}
