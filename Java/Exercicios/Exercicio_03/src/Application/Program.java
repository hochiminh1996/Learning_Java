package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Funcionario;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dados do cliente:");
		Funcionario f = new Funcionario(sc.next(), sc.nextDouble(), sc.nextDouble());
		
		System.out.println("Registro : " + f.toString());
		
		System.out.println("Digite o aumento");
		f.salLiquido(sc.nextDouble());
		
		System.err.println(f.toString());
		
		sc.close();
	}
}
