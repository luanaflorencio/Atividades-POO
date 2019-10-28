//casa
//alterar número de quartos v
//alterar cor v
//ideal para familia? v


public class Casa {
	int quartos;
	float tamanho;
	String cor;

	void acrescentar(int quantidade) {
		this.quartos= this.quartos + quantidade;

	}
	void retirar(int quantidade) {
		this.quartos= this.quartos - quantidade;
	}

	void mudar(String nova) {
		this.cor= nova;
	}

	void familia(){
		
		if(quartos > 2){
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
	public static void main(String[] args){
		Casa c1 = new Casa();

		c1.quartos= 4;
		c1.tamanho= 17.5f;
		c1.cor= "Amarelo";
		c1.familia();

		System.out.println("Quantidade de quartos de c1: " + c1.quartos);
		System.out.println("O tamanho dos quartos de c1: " + c1.tamanho);
		System.out.println("A cor dos quartos são: " + c1.cor);

		c1.acrescentar(5);
		System.out.println("Quantidade de quartos de c1: " + c1.quartos);

		c1.retirar(1);
		System.out.println("quantidade de quartos de c1: " + c1.quartos);

		c1.mudar("Azul");
		System.out.println("A nova cor eh: " + c1.cor);
	}
}
