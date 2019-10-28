public class Camisa {
    String tamanho;
    String cor;
    Fabricante fabricante;

    public static void main(String[] args) {

         Fabricante f1 = new Fabricante();

         f1.nome = "Fila";
         f1.cidade = "NYC";


        Camisa c1 = new Camisa();

        c1.tamanho = "G";
        c1.cor = "Preta";
        c1.fabricante = f1;
       
        System.out.println("tamanho de c1: " + c1.tamanho);
        System.out.println("Cor de c1: " + c1.cor);
        System.out.println("fabricante de c1: " + c1.fabricante.nome);
    }

}