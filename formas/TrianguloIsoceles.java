package formas;

public class TrianguloIsoceles extends Triangulo {
	private float base;

	public TrianguloIsoceles(String cor, float base) {
		super(cor);
		this.setBase(base);
	}

	public float getBase() {
		return this.base;
	}

	public void setCurso(float base) {
		this.base = base;
	}

	public static void main(String[] args) {
		TrianguloIsoceles t2 = new TrianguloIsoceles("Amarelo", 2.8);
		t2.setBase("6.7");
		t2.setCor("Azul");
		Triangulo t = new TrianguloIsoceles("Branco", 5.3);
		TrianguloIsoceles t5 = (TrianguloIsoceles) u;
	}
}