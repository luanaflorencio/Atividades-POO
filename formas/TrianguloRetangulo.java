package formas;

public class TrianguloRetangulo extends Triangulo {
	private int altura;

	public TrianguloRetangulo(String cor, int altura){
		super(cor);
		this.setAltura(altura);
	}

	public int getAltura(){
		return this.altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public static void main(String[] args) {
		TrianguloRetangulo t3 = new TrianguloRetangulo("Laranja", 2);
		Triangulo t = new TrianguloRetangulo("Vermelho", 1);
		TrianguloRetangulo t4 = (TrianguloRetangulo) u;
	}

}