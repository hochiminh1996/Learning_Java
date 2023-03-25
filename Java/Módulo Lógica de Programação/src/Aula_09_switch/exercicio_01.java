package Aula_09_switch;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		int day;

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira um número da semana [0-6]");
		day = sc.nextInt();

		// estrutura de controle de fluxo : switch. Quando sabemos a quantidade
		// exata de condições
		switch (day) {
		case 0:
			System.out.printf("[%d] - Domingo", day);
			break;

		case 1:
			System.out.printf("[%d] - Segunda-feira", day);
			break;

		case 2:
			System.out.printf("[%d] - Terça-feira", day);
			break;

		case 3:
			System.out.printf("[%d] - Quarta-feira", day);
			break;

		case 4:
			System.out.printf("[%d] - Quinta-feira", day);
			break;

		case 5:
			System.out.printf("[%d] - Sexta-feira", day);
			break;

		case 6:
			System.out.printf("[%d] - Sábado", day);
			break;

		default:
			System.out.println("Valor incorreto");

		}

		sc.close();

	}

}
