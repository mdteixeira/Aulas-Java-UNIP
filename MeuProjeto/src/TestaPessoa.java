
public class TestaPessoa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Matheus", 1.65, 55.5, 19);

		Pessoa p2 = new Pessoa("Renato", 1.92, 86, 32);

		System.out.format("IMC de %s: %.2f", p1.nome, p1.CalculaIMC());
		System.out.format("\nIMC de %s: %.2f", p2.nome, p2.CalculaIMC());

	}

}
