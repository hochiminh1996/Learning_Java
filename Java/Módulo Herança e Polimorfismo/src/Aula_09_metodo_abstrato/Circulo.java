package Aula_09_metodo_abstrato;

public class Circulo extends Forma {

	private Double raio;

	public Circulo() {
		super();
	}

	public Circulo(Color color, Double raio) {
		super(color);
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public Double area() {
		return Math.PI * Math.pow(raio, 2);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(
				"Forma: Círculo | Cor: " + super.getColor() + " | Raio " + getRaio() + " | Área: " + String.format("%.2f", area()));

		return sb.toString();
	}

}
