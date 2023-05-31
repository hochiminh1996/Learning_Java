import java.util.ArrayList;
import java.util.List;

public class Observavel {
	private List<Observador> observadores = new ArrayList<Observador>();
	//array list de observadores (carros da polícia)

	// adicionando um observador na lista
	public void adicionarObservador(Observador observador) {
		observadores.add(observador);
	}

	// remove um observador
	public void removerObservador(Observador observador) {
		observadores.remove(observador);
	}

	
	//notificando os observadores a partir da ação dos observados
	public void notificarObservadores() {
		for (Observador observador : observadores) {
			observador.update();
		}
	}
}
