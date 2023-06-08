package Agregacao;

import java.util.ArrayList;

public class Universidade {
	private String name;
	private ArrayList<Estudante> estudante = new ArrayList<>();

	public Universidade() {

	}

	public Universidade(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void adicionar_estudante(Estudante estudante) {
		this.estudante.add(estudante);
	}

	public Integer getNumeroEstudante() {
		return this.estudante.size();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		int i = 1;
		sb.append("Universidade: " + getName() + "\n\n");

		for (Estudante estudantes : estudante) {
			sb.append("Matrícula: "+i+"\n");
			sb.append("Nome: "+estudantes.getName() + "\n");
			sb.append("Curso: "+estudantes.getCurso() + "\n\n");
			i++;
		}

		return sb.toString();

	}

}
