package Aula_08_exercicios_if;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		double minutos;

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos minutos foram gasto?");
		minutos = sc.nextDouble();

		if (minutos >0 && minutos <= 100) {
			System.out.println("Plano de 100 minutos : R$ 50");
		} else {
			System.out.printf("Você excedeu o plano básico\n" + "Tempo excedente : %.2f\nConta : %.2f", minutos - 100,
					(minutos - 100) * 2 + 50);
		}
		
		sc.close();

	}

}
