package Associação;

public class Endereco {
	private String logradouro;
	private String complemento;
	private int numero;
	private String cep;

	// construtor vazio
	public Endereco() {

	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String imprimir() {
		StringBuilder sb = new StringBuilder();
		sb.append("Logradouro: " + getLogradouro() + "\n");
		sb.append("Número: " + getNumero() + "\n");
		sb.append("Complemento: " + getComplemento() + "\n");
		sb.append("CEP: " + getCep());
		return sb.toString();
	}

}
