
public class FabricaAnimal {
	public Animal criarAnimal(String tipo) {
		
		
		//identificando o tipo de animal e criando um objeto a partir dele.
		switch (tipo) {
		case "cachorro":
			return new Cachorro();
		case "gato":
			return new Gato();
		default:
			throw new IllegalArgumentException("Tipo de animal desconhecido: " + tipo);
		}
	}
}
