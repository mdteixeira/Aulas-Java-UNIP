import java.util.Objects;

public class Calculadora {
	
	public Calculadora(double numero1, double numero2) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	double numero1;
	double numero2;
	

	public double retornaSoma() {
		return numero1 + numero2;
	}
	public double retornaSubtracao() {
		return numero1 - numero2;
	}
	public double retornaMultiplicacao() {
		return numero1 * numero2;
	}
	public double retornaDivisao() {
		return numero1 / numero2;
	}
	
	public void insereValoresAtributos(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

}
