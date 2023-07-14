package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account ac1 = null;
		ArrayList<Account> list = new ArrayList<>();

		try {

			System.out.print("Quantas contas?");
			int n = sc.nextInt();
			System.out.println();
			for (int i = 0; i < n; i++) {

				sc.nextLine();
				System.out.printf("Conta #%d\n", i + 1);

				System.out.printf("Nome: ");
				String name = sc.nextLine();

				System.out.print("Número da conta: ");
				Integer nc = sc.nextInt();

				System.out.print("Saldo: ");
				Double balance = sc.nextDouble();

				System.out.print("Limite: ");
				Double limit = sc.nextDouble();

				System.out.print("Deseja realizar deposito [S/N]? ");
				char e = sc.next().charAt(0);

				ac1 = new Account(name, nc, balance, limit);

				if (e == 's') {
					System.out.print("Valor do deposito: ");
					Double v = sc.nextDouble();
					ac1.deposit(v);
				}

				System.out.print("Deseja realizar saque [S/N]? ");
				char e1 = sc.next().charAt(0);

				if (e1 == 's') {
					System.out.println("Valor do saque: ");

					Double v = sc.nextDouble();
					ac1.withdraw(v);
				}

				list.add(ac1);
			}

//			Account ac1 = new Account("Felippe", 1, 100.00, 1200.00);
//			ac1.withdraw(100.00);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}

		System.out.println("\nResultado: ");

		for (Account ac : list) {
			System.out.println("Nome: " + ac.getHolder() + "| Saldo: " + ac.getBalance());
		}
	}

}
