package Composicao;

public class Pessoa {
	private String name;
	private Telefone telefone;

	public Pessoa() {
	}

	public Pessoa(String name, Telefone telefone) {

		this.name = name;
		this.telefone = telefone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome : " + getName() + "\n");
		sb.append("Telefone: " + getTelefone().getTelefone());

		return sb.toString();
	}

}
