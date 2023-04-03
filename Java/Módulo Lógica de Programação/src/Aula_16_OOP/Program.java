package Aula_16_OOP;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double xA, xB, xC, yA, yB, yC;

		System.out.println("Entre com os valores do triângulo X:");

		System.out.print("xA:");
		xA = sc.nextDouble();

		System.out.print("xB:");
		xB = sc.nextDouble();

		System.out.print("xC:");
		xC = sc.nextDouble();

		System.out.println("Entre com os valores do triângulo Y:");

		System.out.print("yA:");
		yA = sc.nextDouble();

		System.out.print("yB:");
		yB = sc.nextDouble();

		System.out.print("yC:");
		yC = sc.nextDouble();

		double p = (xA + xB + xC) / 2;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

		p = (yA + yB + yC) / 2;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

		System.out.printf("Área do triângulo X : %.2f\n", areaX);

		System.out.printf("Área do triângulo Y : %.2f\n", areaY);

		if (areaX > areaY) {
			System.out.println("Triângulo X tem área maior");
		} else {
			System.out.println("Triângulo Y tem área maior");
		}
		
		
		sc.close();
	}

}
