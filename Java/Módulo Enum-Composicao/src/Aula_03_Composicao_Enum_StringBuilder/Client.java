package Aula_03_Composicao_Enum_StringBuilder;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");//formatação da data passada

	private String name;
	private String email;
	private Date birthDate;

	public Client() {
		// construtor vazio
	}

	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
		// construtor com argumento
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setDate(Date date) {
		this.birthDate = date;
	}

	public Date getDate() {
		return birthDate;
	}

	public String toString() {
		// p/ informações totais da classe
		StringBuilder sb = new StringBuilder();

		sb.append("\nCliente:\n");
		sb.append("Nome: " + getName() + "\n");
		sb.append("Email: " + getEmail() + "\n");
		sb.append("Data de nascimento: " + sdf.format(getDate()) + "\n");//observe a formatação da data

		return sb.toString();

	}
}
