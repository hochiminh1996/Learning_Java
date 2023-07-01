package Aula_02_Upcasting_DownCasting;

import java.util.Locale;

public class Main {
	/*
	 * UPCASTING : Casting (conversão) da subclasse para a superclasse. Basicamente,
	 * você atribui a um objeto (tipo inferior) o tipo da classe superior. Uso comum
	 * : Polimorfismo
	 * 
	 * DOWNCASTING : Casting (conversão) da superclasse para a subclasse
	 * Basicamente, você atribui a um objeto (tipo superior) o tipo da classe
	 * inferior.
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Account acc = new Account(1001, "Felippe", 1000.50);// classe mãe
		BusinessAccount bacc = new BusinessAccount(1002, "Pedro", 1000000.00, 20.000);// clase filha

		// UPCASTING : Pegar um objeto do tipo inferior e converte-lo para uma versão
		// superior.
		// Em melhores palavras, estamos pegando um objeto da subclasse e atribuido a um
		// tipo da superclasse

		Account acc1 = bacc;
		System.out.println(acc1.getBalance());

		Account acc2 = new BusinessAccount(12, "Jonas", 1200.00, 2000.00);
		System.out.println(acc2.getHolder());

		Account acc3 = new SavingsAccount(123, "Diego", 5000.00, 0.1);

		// essa atribuição não apresenta erro porque uma BusinessAccount também é um
		// Account

		// DOWNCAST -> CONVERTER DA SUPERCLASSE P/ A SUBLCASSE

		// Essa linha produzirá um erro, pois é impossível fazer a conversão :
		// BusinessAccount acc4 = acc2;

		// Temos que realizar a seguinte ordem

		BusinessAccount acc4 = (BusinessAccount) acc2;
		// Agora sim é possível converter um objeto do tipo superclasse(acc2), em um
		// novo obj do tipo BusinessAccount

		// É necessário colocar o tipo da subclasse, entre parênteses, ao lado do obj
		// que é do tipo superclasse.
		// Só assim a conversão funcionará

		acc4.loan(100.00);// agora podemos acessar o método (loan) específico da subclasse.

		// Um exemplo em que haverá um erro no downcast.

		//BusinessAccount acc5 = (BusinessAccount) acc3;// o compilador não mostrará o erro apenas ao executar o cod

		// Isso vai acontecer porque, embora acc3 seja do tipo Account, ele está
		// instanciando uma SavingAccount
		// Para resolver temos que usar uma outra estratégia

		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
		}else if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			System.out.println("Objeto SavingAccount criado");
		}

	}

}
