public class divisores {

	public static void main(String[] args) {

		int a = 40;
		int contador = 0;
		
		while (contador < 40) {
			a = a - 1;
			contador = contador + 1;
		}
		
		for (int i = 0; i < 40; i++) {
			if(a % 2 == 1){
				System.out.println("a eh dividido por 3");
			}
			else{
				System.out.println("")
			}
		}
	}

}

//20 primeiros números divididos por 3//