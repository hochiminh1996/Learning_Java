package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Account conta;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Número da Conta : ");
		int numero = sc.nextInt();

		System.out.println("Nome do Titular : ");

		sc.nextLine();// consumindo o enter que foi digitado anteriormente
		String nome = sc.nextLine();

		System.out.println("Deseja realizar um deposito inicial?[s/n]");
		char op = sc.next().charAt(0);

		if (op == 's') {
			System.out.println("Digite o valor a ser depositado :");
			double dep = sc.nextDouble();
			conta = new Account(numero, nome, dep);
			
			System.err.println("--------------------------");
			System.err.println(conta);
			System.err.println("--------------------------");

		} else {
			conta = new Account(numero, nome);
			System.err.println("--------------------------");
			System.err.println(conta.toString());
			System.err.println("--------------------------");
		}

		

		
		System.out.println("\nInsira um deposito:");
		double novoDep = sc.nextDouble();

		conta.depositar(novoDep);

		System.out.println("Deseja sacar algum valor?[s/n]");
		String esc = sc.next();

		if (esc.equals("s")) {
			System.out.println("Quanto você deseja sacar?");
			double sac = sc.nextDouble();

			if (sac + 5 > conta.getSaldo()) {
				System.err.println("IMPOSSÍVEL SACAR : SALDO INSUFICIENTE...");
			} else {
				conta.retirar(sac);

				System.err.println("\n--------------------------");
				System.err.println(conta.toString() + "\nValor do Saque : " + sac + "\nTaxa de Saque : R$ 5.00");

				System.err.println("--------------------------");

			}

		} else {
			System.err.println("--------------------------\n" + conta.toString() + "\n--------------------------");
		}

		sc.close();
	}

}
