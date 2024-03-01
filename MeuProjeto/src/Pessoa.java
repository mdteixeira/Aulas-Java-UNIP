
public class Pessoa {

	String nome;
	int idade;
	double altura;
	double peso;

	public Pessoa(String string, double d, double e, int i) {
		// TODO Auto-generated constructor stub
	}

	public double CalculaIMC() {
		return peso / (altura * altura);
	}
}
