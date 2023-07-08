package Aula_09_metodo_abstrato;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// método abstrato é aquele que não possui implementação na classe mãe.
		// Além disso, se houver um método abstrato, a classe precisa ser abstrata tb
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		Forma f = null;
		ArrayList<Forma> lista = new ArrayList<>();
		
		System.out.print("Quantidade de formas: ");
		Integer n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Forma #%d\n", i + 1);
			System.out.print("Retângulo[r] ou Circulo(c)?");
			char e = sc.next().charAt(0);

			System.out.print("PRETO/AZUL/VERMELHO:");
			Color cor = Color.valueOf(sc.next());
			//passando uma string p/ ENUM

			if (e == 'r') {

				System.out.print("Altura: ");
				Double altura = sc.nextDouble();

				System.out.print("Largura: ");
				Double largura = sc.nextDouble();

				f = new Retangulo(cor, largura, altura);

			} else if (e == 'c') {
				System.out.print("Raio: ");
				Double raio = sc.nextDouble();

				f = new Circulo(cor, raio);
			}

			System.out.println();
			
			lista.add(f);
		}

		
		
		System.out.println("Resultado:");
		
		for(Forma forma:lista) {
			System.out.println(forma);
		}
		
		sc.close();
		
	}

}
