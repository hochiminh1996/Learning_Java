package Aula_08_Classe_Abstrata;

import java.util.ArrayList;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// São classes que não podem ser instanciadas, apenas suas filhas. Servem de
		// base p/ outras
		// Há classes abstratas e métodos também.

		ArrayList<Account> list = new ArrayList<>();
		// Observe que estamos criando uma lista com o tipo genérico de conta.
		// O que vai permitir tb todas as subclasses, já que são filhas

		list.add(new SavingsAccount(1, "Felippe", 500.00, 0.1));
		list.add(new BusinessAccount(2, "Pedro", 1000.00, 500.00));
		list.add(new SavingsAccount(3, "Mayra", 300.00, 0.1));
		list.add(new BusinessAccount(4, "Ana", 500.00, 500.00));

		// verificando o valor total de todas as contas na lista
		double sum = 0;

		for (Account c : list) {
			sum += c.getBalance();
		}

		System.out.println("Valor total:" + sum);

		// depositando R$ em cada conta

		for (Account c : list) {
			c.deposit(10.00);
		}

		System.out.println();
		sum = 0;
		for (Account c : list) {
			System.out.printf("Nome: %s | Conta: %d | Saldo: %.2f", c.getHolder(), c.getNumber(), c.getBalance());
			sum+=c.getBalance();
			System.out.println();
		}
		
		System.out.println("\nNovo saldo: "+sum);
	}

}
