
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteDoBanco cliente = new ClienteDoBanco("Maria Campos Rodrigues");
		ContaBancaria conta = new ContaBancaria("1365-9");

		Fachada facade = new Fachada();
		facade.fazerDeposito(150, cliente, conta);
	}

}
