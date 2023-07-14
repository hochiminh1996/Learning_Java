package application;

import java.util.Locale;

import entities.Account;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		try {
			Account ac1 = new Account("Felippe", 1, 1200.00, 2000.00);
			ac1.withdraw(1200.00);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
