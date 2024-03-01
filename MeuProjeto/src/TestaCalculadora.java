
public class TestaCalculadora {

	public static void main(String[] args) {

		// Cria calculadora
		Calculadora calculadora = new Calculadora(1, 2);

		// Printa o resultado da soma
		System.out.println(calculadora.retornaSoma());
		
		// Define novos calores para a calculadora
		calculadora.insereValoresAtributos(2, 3);

		// Printa o resultado da soma
		System.out.println(calculadora.retornaMultiplicacao());

	}

}
