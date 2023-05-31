
public class Servico {
	private Conexao conexao;

	public Servico() {
		conexao = Conexao.getInstance();
	}

	public void executar() {
		conexao.conectar();
		System.out.println("Executando serviço...");
		conexao.desconectar();
	}

	public void imprimirIdSessao() {
		System.out.println("ID de sessão: " + conexao.getIdSessao());
	}
}
