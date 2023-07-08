package Aula_09_metodo_abstrato;

public abstract class Forma {
	private Color color;

	public Forma() {

	}

	public Forma(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	//método abstrato exige classe abstratos
	public abstract Double area();

}
