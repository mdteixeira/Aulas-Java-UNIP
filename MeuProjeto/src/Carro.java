
public class Carro {

	String marca;
	String modelo;
	String placa;
	int ano;

	Carro(String marca, String modelo, String placa, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
	}

	public void MostrarCarro2() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
		System.out.println("Placa: " + placa);
	}

	public void MostrarCarro() {
		System.out.print(marca + " " + modelo + " " + ano + " - " + placa + "\n");
	}

}
