public class Carro {
	String tamanho;
	String cor;
	Fabricantes fabricantes;

	public static void main(String[] args) {

		Fabricantes f1 = new Fabricantes();

			f1.país= "Ítalia";
			f1.idade= 150;
			f1.nome= "Fiat";

			Carro c1 = new Carro();

			c1.tamanho= "Grande";
			c1.cor= "Vermelho";
			c1.fabricantes= f1;

		System.out.println("Tamanho de c1: " + c1.tamanho);
		System.out.println("Cor de c1: " + c1.cor);
		System.out.println("Fabricante de c1: " + c1.fabricantes.nome);
	}
}
