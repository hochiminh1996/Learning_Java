package Agregacao;

public class Program {

	public static void main(String[] args) {
		// Agregação: Na agregação, você tem um objeto (todo) que contém outros objetos
		// (parte) como atributos, mas esses objetos (parte) podem existir de forma
		// independente do objeto (todo). Em outras palavras, o objeto (parte) pode
		// pertencer a vários objetos todo ao mesmo tempo e não é destruído quando um
		// objeto (todo) é excluído. Vale ressaltar, assim como na composição, que esse
		// tipo de relacionamento é, geralmente, 1 -> N, sendo o objeto (parte) um
		// arraylist do tipo especificado. Porém, diferente da composição, ao excluir o
		// objeto (todo), as (partes) permancem existindo. Por exemplo, duas classes :
		// Cesta de Produtos(todo) e Produtos(parte). Uma cesta de produto é,
		// geralmente, constituida de 1 -> N produtos. No entanto, ambas funcionam como
		// entidades autônomas. Logo, um produto pode existir em diversas cestas e, se
		// eu excluir o mesmo da Cesta de Produto, ele apenas será removido; não será
		// uma exclusão do objeto em si. Observação: o produto será adicionado por
		// métodos específicos (add) dentro da classe Cesta de Produtos, já que o mesmo
		// não é criado no momento da instanciação (via construtor) da classe Cesta, mas
		// feito à parte. 

		Universidade universidade = new Universidade("Universidade XTI");

		Estudante estudante = new Estudante("Felippe Marques", "Análise e Desenvolvimento de Sistemas");
		Estudante estudante1 = new Estudante("Lucas Silva", "Ciências da Computação");

		universidade.adicionar_estudante(estudante1);
		universidade.adicionar_estudante(estudante);

		System.out.println(universidade);
		
		System.out.println("APAGANDO O OBJETO:");
		universidade = null;
		
		
		System.out.println(universidade);
		
		//observe que ainda podemos utilizar os objetos estudantes
		System.out.println(estudante.getName());
		
		
		//observe que há uma independência dos objetos
		

	}

}
