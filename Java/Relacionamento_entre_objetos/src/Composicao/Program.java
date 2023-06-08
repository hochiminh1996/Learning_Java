package Composicao;

public class Program {

	public static void main(String[] args) {
		// Composição: é uma forma de relacionamento entre objetos em que um objeto é
		// composto por outros. Esses objetos componentes são partes essenciais do
		// objeto todo e não existem de forma independente. Em outras palavras, o objeto
		// todo é responsável pela criação e destruição dos objetos parte. Se o objeto
		// (todo) for excluído, os objetos (parte) também serão. Vale ressaltar que esse
		// tipo de relacionamento é, geralmente, 1 -> N, sendo o objeto (parte) um
		// arraylist do tipo especificado. Por exemplo, duas classes : Funcionário(todo)
		// e Dependentes(parte). Nesse cenário, teremos um atributo chamado dependentes,
		// sendo um arraylist do tipo Dependentes, dentro da classe Funcionário. Se o
		// todo (funcionário) for excluído, as partes (dependentes) também serão.

		Pessoa p = new Pessoa("Felippe", new Telefone("11-94505852"));
		//observe que passamos o objeto telefone aq. Você poderia passar uma string tb e, dentro do 
		//construtor da classe pessoa, fazer um this.telefone = new Telefone(telefone); e passava o telefone
		

		System.out.println(p);

		System.out.println("Removendo o objeto");
		p = null;

		System.out.println(p);
		//Observe que o objeto telefone deixará de existir no contexto da classe pessoa

	}

}
