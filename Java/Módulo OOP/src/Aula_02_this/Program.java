package Aula_02_this;

import java.util.Locale;

public class Program {
/*
 * A palavra this faz referência ao próprio objeto.
 * Por exemplo, se tivermos parâmetros e atributos com o msm nome, podemos
 * usar a palavra this para referência-los. No caso, ele irá referenciar o
 * atributo da classe. Sem o this, ele referência ao parâmetro do método.
 * Além disso, podemos passar o próprio obj como parâmetro utilizando a palavra this
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		Pessoa p = new Pessoa("Felippe", 25, 1.78);
		
		System.out.println(p);
		
	}

}
