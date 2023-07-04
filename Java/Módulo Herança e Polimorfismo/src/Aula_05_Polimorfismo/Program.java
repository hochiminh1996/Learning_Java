package Aula_05_Polimorfismo;

import java.util.Locale;

public class Program {
	/*
	 * Polimorfismo (multiplas formas) é um dos pilares da programação, ao lado de herança e encapsulação 
	 * 
	 * Temos métodos, variáveis de mesmo tipo se comportando de formas diferentes.
	 * Os método e construtores são um bom exemplo de polimorfismo


		Os polimorfismos + conhecidos são de : sobreposição e sobrecarga
	 * */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Account x = new Account(1, "Lipe", 1000.00);
		Account y = new SavingsAccount(2, "Pedro", 1000.00, 0.02);
		//Observe que temos variáveis de msm tipo apontando p/ objetos diferentes, no caso a instância.
		//Por exemplo, Y é do tipo account, mas aponta p/ um objeto savingaccount.
		//Lembre-se também que nesse caso estamos fazendo uso do conceito de upcasting
		
		
		//observe q em cada classe possui uma implementação diferente de um mesmo método (polimorfismo)
		x.withdraw(50.00);
		y.withdraw(50.00);
		//nosso método withdraw é um exemplo de polimorfismo. Dependendo da classe, ela possui
		//característica diferentes e especificas.
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
		
		
		
		
		
		
		
		
	}

}
