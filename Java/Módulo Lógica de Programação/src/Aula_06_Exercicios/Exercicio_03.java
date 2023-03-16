package Aula_06_Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		int a, b, c, d;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();

		sc.close();

		System.out.printf("Resultado : %d ", (a * b - c * d));

	}

}
