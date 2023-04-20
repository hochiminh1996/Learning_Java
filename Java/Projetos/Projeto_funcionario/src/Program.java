

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
//		projeto funcionario
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("How many employees will be registered?");
		int n = sc.nextInt();

		List<Employees> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");

			System.out.print("ID:");
			Integer id = sc.nextInt();

			sc.nextLine(); // buffer do \n

			// verificando se o ID digitado já está registrado
			while (hasId(list, id)) {
				// Se entrar no while, significa que já há um id com esse número registrado
				

				System.err.println("\nID already taken! Try again...");
				System.out.print("Digite o ID novamente:");
				id = sc.nextInt();
				sc.nextLine(); // buffer do \n


			}

			System.out.print("Name:");
			String name = sc.nextLine();

			System.out.print("Salary:");
			Double salary = sc.nextDouble();

			// instanciando o object funcionario
			Employees emp = new Employees(id, name, salary);

			// adicionando o funcionario na lista
			list.add(emp);

		}

		System.out.println();
		System.out.println("Enter the employee id that will have salary increase:");
		int id = sc.nextInt();

		// função que verifica se existe o id informado.
//		Integer pos = position(list, id);

//		Podemos fazer isso sem precisar de uma função extra:
		Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		// buscando na lista a ocorrência de um ID digitado. Isso é pouco + complexo :
		// expressão lambda

		if (emp == null) {
			System.out.println("This ID doesn't exist!");
		} else {
			System.out.print("Enter the porcentage:");
			Double percent = sc.nextDouble();

			emp.increaseSalary(percent);
		}

		// lista de funcionários
		System.out.println("List of employees:");

		for (Employees listOfEmployees : list) {
			System.out.println(listOfEmployees);
		}

		sc.close();
	}

	// função para validar se há o id solicitado. Passamos uma lista e um id como
	// parâmetro
	public static Integer position(List<Employees> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

	// Vai verificar se há o id digitado no momento que pedir o id, lá no escopo do
	// dados de entrada
	public static boolean hasId(List<Employees> list, int id) {
		Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		//retorna o objeto especifico da lista se for encontrado.

		return emp != null;
		// se for diferente de null, significa que o id foi encontrado. 
	}

}
