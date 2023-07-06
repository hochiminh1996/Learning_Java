package Aula_06_Exercicio;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> lista = new ArrayList<>();

		Employee fun = null;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Quantos funcionários?");
		int quant = sc.nextInt();

		for (int i = 0; i < quant; i++) {
			sc.nextLine();// enter no buffer

			System.out.printf("Tipo de Funcionário %d -> [L/T]: ", i + 1);
			String t = sc.nextLine();

			if(!t.equals("t") && !t.equals("l")) {
				System.err.println("Erro. Tente novamente...");
				return;
			}

			System.out.print("Nome: ");
			String name = sc.nextLine();

			System.out.print("Hora:");
			Integer hours = sc.nextInt();

			System.out.print("Valor/hora: ");
			Double valuePerHour = sc.nextDouble();

			if (t.equals("l")) {
				fun = new Employee(name, hours, valuePerHour);
			} else if (t.equals("t")) {
				System.out.print("Adicional: ");
				Double additional = sc.nextDouble();
				fun = new OutsourcedEmployee(name, hours, valuePerHour, additional);
			}

			lista.add(fun);

			System.out.println();
		}
		sc.close();
		
		
		System.err.println("[Lista de funcionários]:");

		for (Employee l : lista) {
			System.out.println(l);
		}

	}

}
