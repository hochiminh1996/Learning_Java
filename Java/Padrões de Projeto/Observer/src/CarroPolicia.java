
public class CarroPolicia implements Observador {
	private String nome;

	public CarroPolicia(String nome) {
		this.nome = nome;
	}

	public void update() {
		System.out.println("Carro de polícia " + nome + " está perseguindo o carro roubado!");
	}
	
	
}
