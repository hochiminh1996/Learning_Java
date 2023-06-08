package Associação;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Associação: É uma forma de relacionamento entre objetos em que o objeto
		// (todo) pode estar apenas associado a um objeto (parte), segundo a definição
		// do professor : "Na associação, o objeto (todo) só pode estar associado a um
		// único objeto (parte)". Além disso, esses objetos também são independentes
		// entre si.
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		// Temos um 2 scanner apenas para entradas do tipo String(nextLine). Os q for
		// char pode usar a entrada padrão.
		// Isso evita o problema do buffer enter

		// OBJETO PESSOA E ENDERECO
		Pessoa p = new Pessoa();// criando um objeto pessoa sem parâmetros

		Endereco end = new Endereco();

		System.out.print("Digite o nome: ");
		p.setName(scString.nextLine());

		System.out.print("Idade: ");
		p.setIdade(sc.nextInt());

		System.out.print("Sexo [f/m]: ");
		p.setSexo(sc.next().toUpperCase().charAt(0));

		System.out.print("Endereço: ");
		end.setLogradouro(scString.nextLine());

		System.out.print("Número: ");
		end.setNumero(sc.nextInt());

		System.out.print("Há complemento [s/n]? ");
		char q = sc.next().charAt(0);

		if (q == 's') {
			sc.nextLine();

			System.out.print("Digite o complemento: ");
			end.setComplemento(scString.nextLine());

		} else {
			end.setComplemento("");
		}

		System.out.print("CEP: ");
		end.setCep(scString.nextLine());

		p.setEnd(end);
		// O objeto endereço foi passado p/ o atributo endereço da classe pessoa.
		// Estabelecendo a associação

		System.out.println("\n" + p.imprimir());
		sc.close();
		scString.close();
	}

}
