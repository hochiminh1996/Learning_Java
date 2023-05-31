public class Conexao {
    private static Conexao instance;

    private Configuracao configuracao;
    private String idSessao;

    private Conexao() {
        configuracao = Configuracao.getInstance();
        idSessao = "ABC123";
    }

    public static Conexao getInstance() {
        if (instance == null) {
            instance = new Conexao();
        }
        return instance;
    }

    public void conectar() {
        System.out.println("Conectando ao servidor em " + configuracao.getUrlServidor() + " com o usuário " +
                configuracao.getUsuario() + " e a senha " + configuracao.getSenha() + "...");
        // Cria a conexão com o servidor usando as configurações da instância de Configuracao
    }

    public void desconectar() {
        System.out.println("Desconectando do servidor...");
        // Fecha a conexão com o servidor
    }

    public String getIdSessao() {
        return idSessao;
    }
}