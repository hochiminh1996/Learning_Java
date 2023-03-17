package Aula_08_exercicios_if;

import java.util.Locale;
import java.util.Scanner;
/*
Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a 


 */

public class Exercicio_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		double x, y;

		Scanner sc = new Scanner(System.in);

		System.out.println("X:");
		x = sc.nextDouble();

		System.out.println("Y:");
		y = sc.nextDouble();
		if (x == 0 && y == 0) {
			System.out.printf("Origem : \nX : %.1f\nY : %.1f", x, y);

		} else if (x > 0 && y < 0) {
			System.out.printf("Quadrante : Q4\nX : %.1f\nY : %.1f", x, y);
		} else if (x < 0 && y < 0) {
			System.out.printf("Quadrante : Q3\nX : %.1f\nY : %.1f", x, y);
		} else if (x < 0 && y > 0) {
			System.out.printf("Quadrante : Q2\nX : %.1f\nY : %.1f", x, y);
		} else if (x > 0 && y > 0) {
			System.out.printf("Quadrante : Q1\nX : %.1f\nY : %.1f", x, y);

		}

		sc.close();

	}

}
