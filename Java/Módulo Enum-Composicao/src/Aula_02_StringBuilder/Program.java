package Aula_02_StringBuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		// formato da data

		// Criando meu post
		Post p1 = new Post(sdf.parse("21/06/2023 13:06:44"), "Traveling to New Zeland",
				"I'm going to visit this wonderful country!", 12);

		// comentários dos outros usuários
		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("Wow, that's aswsome");

		// adicionando os comentários ao meu post01
		p1.addComment(c1);
		p1.addComment(c2);

		System.out.println(p1);//exibindo os dados registrados no post
		
		
		//segundo post
		Post p2 = new Post(sdf.parse("03/06/2023 16:45:01"), "Introdução ao mundo Java", "Aplicando o StringBuilder", 300);
		
		
		//comentários do segundo post
		Comment c3 = new Comment("Boa, jovem");
		Comment c4 = new Comment("Parabéns");
		
		//adicionando comentários no segundo posto
		p2.addComment(c3);
		p2.addComment(c4);
		
		
		//exibindo as informações do segundo post já com o stringbuilder;
		System.out.println(p2);
		
		
		
		
		
		
		
		
		
		

	}
}
