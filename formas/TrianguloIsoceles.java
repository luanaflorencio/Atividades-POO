package formas;

public class TrianguloIsoceles extends Triangulo {
	private double base;

	public TrianguloIsoceles(String cor, double base) {
		super(cor);
		this.setBase(base);
	}

	public double getBase() {
		return this.base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public static void main(String[] args) {
		TrianguloIsoceles t2 = new TrianguloIsoceles("Amarelo", 2.8);
		t2.setBase(6.7);
		t2.setCor("Azul");
		Triangulo t = new TrianguloIsoceles("Branco", 5.3);
		TrianguloIsoceles t3 = (TrianguloIsoceles) t;
	}
}