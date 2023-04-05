package Entities;

public class Triangle {
	public double altura;
	public double largura;

	public Triangle(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}
	
	public double area() {
		return (this.largura * this.altura) / 2;
	}
	
	public double perimetro() {
		return 2 * (this.altura +this.largura);
	}
	
	public double diagonal() {
		return Math.sqrt(this.altura * this.altura + this.largura  * this.largura);
	}
	
	
	public String toString() {
		return "Área :" + String.format("%.2f", area()) + "\nPerimetro : "
	+ String.format("%.2f", perimetro()) + "\nDiagonal : "+String.format("%.2f", diagonal());
	}
}
