package Aula_09_metodo_abstrato;

public class Retangulo extends Forma {
	private Double largura;
	private Double altura;

	public Retangulo() {
		super();
	}

	public Retangulo(Color color, Double largura, Double altura) {
		super(color);
		this.altura = altura;
		this.largura = largura;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public Double area() {
		return largura * altura;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("Forma: Retângulo | Cor: " + super.getColor() + " | Largura :" + getLargura() + " | Altura: "
				+ getAltura() + " | Área: " + String.format("%.2f", area()));

		return sb.toString();
	}
}
