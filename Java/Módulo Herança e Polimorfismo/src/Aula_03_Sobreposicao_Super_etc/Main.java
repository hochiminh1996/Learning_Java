package Aula_03_Sobreposicao_Super_etc;

import java.util.Locale;

public class Main {
	/*
	 * Sobreposição ou sobrescrita
	 * 
	 * - É a implementação de um método de uma superclasse na subclasse
	 * 
	 * - É fortamente recomendável utilizar a nomeclatura @Override em um método
	 * sobrescrito
	 * 
	 * - O super, além de indicar que estamos usando setando valores no construtor da classe mãe.
	 * também nos permite chamar métodos da classe mãe.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		//Conta padrão
		Account c = new Account(12, "Felippe", 1000.00);
		c.withdraw(200.00);//saque. Tem que sair 10 (taxa de 5)
		
		Account sv = new SavingsAccount(123, "Pedro", 1000.00, 0.2);
		sv.withdraw(200.0);//saque. Tem que sair apenas 5
		
		
		Account ba = new BusinessAccount(1234, "Luana", 1000.00, 2000.00);
		ba.withdraw(200.00);
		
		System.out.println(c);
		System.out.println(sv);
		System.out.println(ba);

	}

}
