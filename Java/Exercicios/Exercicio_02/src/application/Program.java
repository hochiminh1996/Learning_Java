package application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com as medidas do triângulo:");
		
		System.out.println("Largura : ");
		Triangle t = new Triangle(sc.nextDouble(), sc.nextDouble());
		
		
		System.out.println(t.toString());
		sc.close();
		
	}

}
