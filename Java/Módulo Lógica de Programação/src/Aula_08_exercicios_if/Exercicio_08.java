package Aula_08_exercicios_if;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double salario = 0, imposto=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o salário");
		salario = sc.nextDouble();

		if (salario < 0) {
			System.out.println("Inválido");
		} else if (salario >= 0 && salario <= 2000) {
			System.out.printf("%.2f : isento", salario);
		} else if (salario <= 3000) {
//			8%
			imposto = (salario - 2000) * 0.08;

			System.out.println("8%");
		} else if (salario <= 4500) {
//			18
			imposto = (salario - 3000) * 0.18 + 1000 * 0.08 ;
			//-3000 é da faixa anterior, ou seja, a diferença entre uma faixa e aoutra

		} else if (salario > 4500) {
			//28
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
//			4500 é a faixa anterior, 1500 é diferença entre 4500-3000, e 
			//1000 é a diferença entre a faixa 1 3000 e a isenção 2000 = 3000-2000 = 100
		}

		sc.close();
		System.out.printf("Imposto : %.2f", imposto);
	}

}
