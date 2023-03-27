package Aula_11_while;

import java.util.Scanner;

public class Aula_04_exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op = 0, alc = 0, gas = 0, die = 0;

		Scanner sc = new Scanner(System.in);

		System.out.printf("Posto de Gasolina\n\n1.Álcool\n2.Gasolina \n3.Diesel\n" + "4.Fim\n");

		while (true) {
			op = sc.nextInt();

			if (op == 1) {
				alc++;
			} else if (op == 2) {
				gas++;
			} else if (op == 3) {
				die++;
			} else if (op == 4) {
				System.out.printf("Obrigado\nAlcoól : %d\nGasolina : %d\n" + "Diesel : %d", alc, gas, die);
				break;
			} else {
				System.out.print("Opção inválida. Digite novamente:");
			}
		}

		sc.close();

	}

}
