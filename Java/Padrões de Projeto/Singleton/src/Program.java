
/*No exemplo que apresentei, as classes Configuracao e Conexao são implementadas como Singleton, 
ou seja, há apenas uma instância dessas classes em toda a aplicação.
*/
public class Program {

	public static void main(String[] args) {
		/*
		 * criamos duas instâncias da classe Servico e chamamos o método executar() em
		 * ambas. Como a classe Conexao é Singleton, ambas as instâncias de Servico
		 * usarão a mesma instância de Conexao para se conectar ao servidor e executar
		 * suas tarefas.
		 */

		Servico servico1 = new Servico();
		Servico servico2 = new Servico();

		servico1.executar();
		servico2.executar();

		servico1.imprimirIdSessao();
		servico2.imprimirIdSessao();
	}

}
