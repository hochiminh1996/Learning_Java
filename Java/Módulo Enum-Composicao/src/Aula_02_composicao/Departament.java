package Aula_02_composicao;

public class Departament {
	private String name;
	
	public Departament() {}
	public Departament(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return "Nome do departamento: "+getName();
	}
	
	
	
}
