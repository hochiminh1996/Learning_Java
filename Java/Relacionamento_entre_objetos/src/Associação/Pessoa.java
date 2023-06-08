package Associação;

public class Pessoa {
	private String name;
	private int idade;
	private char sexo;
	private Endereco end;

	public Pessoa() {
		this.end = new Endereco();// criando uma instância vazia de endereço. P/ possibilitar a inicialização e
									// não dar erro de inicialização
	}

	public Pessoa(String name, int idade, char sexo) {
		this.name = name;
		this.idade = idade;
		this.sexo = sexo;
		this.end = new Endereco();//irá criar uma instância vazia de endereço
	}

	public Pessoa(String name, int idade, char sexo, Endereco end) {
		this.name = name;
		this.idade = idade;
		this.sexo = sexo;
		this.end = end;//aqui irá recepcionar um endereço
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Endereco getEnd() {
		return end;
	}

	public void setEnd(Endereco end) {
		this.end = end;
	}

	public String imprimir() {
		StringBuilder sb = new StringBuilder();
		
		String sexo = getSexo() == 'M' ? "Masculino" : "Feminino";
		//ternario
		
		
		
		sb.append("Nome: " + getName() + "\n");
		sb.append("Idade: " + getIdade() + "\n");
		sb.append("Sexo: "+sexo+ "\n");
		sb.append("\nENDEREÇO\n" + getEnd().imprimir());

		return sb.toString();
	}

}
