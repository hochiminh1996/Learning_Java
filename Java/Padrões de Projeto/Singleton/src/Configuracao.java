
public class Configuracao {
	private static Configuracao instance;

	private String urlServidor;
	private String usuario;
	private String senha;

	private Configuracao() {
		// Configurações padrão
		urlServidor = "localhost";
		usuario = "admin";
		senha = "1234";
	}

	public static Configuracao getInstance() {
		if (instance == null) {
			instance = new Configuracao();
		}
		return instance;
	}

	public String getUrlServidor() {
		return urlServidor;
	}

	public void setUrlServidor(String urlServidor) {
		this.urlServidor = urlServidor;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
