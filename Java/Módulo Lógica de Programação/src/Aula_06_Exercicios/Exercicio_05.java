package Aula_06_Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		int cod_peca, num_peca;
		double valor_unitario;

		Scanner sc = new Scanner(System.in);

		System.out.println("COD_PEÇA:");
		cod_peca = sc.nextInt();

		System.out.println("NUM_PEÇA:");
		num_peca = sc.nextInt();

		System.out.println("VALOR_UNITÁRIO:");
		valor_unitario = sc.nextFloat();
		
		sc.close();

		System.out.printf("Peça : %d\nValor a pagar : %.2f",cod_peca, num_peca * valor_unitario);

	}

}
