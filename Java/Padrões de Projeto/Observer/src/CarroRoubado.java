
public class CarroRoubado extends Observavel implements Carro {

	// temos os métodos que o carro roubado executa
	public void frente() {
		System.out.println("Carro roubado está indo para frente.");
		notificarObservadores();
		// notificando os nossos observadores
	}

	public void direita() {
		System.out.println("Carro roubado está indo para direita.");
		notificarObservadores();
		// notificando os nossos observadores

	}

	public void esquerda() {
		System.out.println("Carro roubado está indo para esquerda.");
		notificarObservadores();
		// notificando os nossos observadores

	}

	public void para() {
		System.out.println("Carro roubado parou.");
		notificarObservadores();
		//notificando os nossos observadores
	}

}
