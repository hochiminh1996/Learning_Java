package entities;

public class Aluno {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;

	public Aluno(String nome, double nota1, double nota2, double nota3) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	public double finalGrade() {
		return nota1 + nota2 + nota3;
	}

	public double pontoFaltante() {
		if (finalGrade() <= 60) {
			return 60 - finalGrade();
		} else {
			return 0;
		}
	}

	public String toString() {
		return "Nota final : " + finalGrade();
	}

}
