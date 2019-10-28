public class Musica {
    String nome; 
    String genero; 
    Autor autor; 

    public static void main(String[] args) {
        Autor a1 = new Autor();

        a1.nome = "Vinicius de Moraes";
        a1.país = "Brasil";
        a1.idade = "70";

    
        Musica m1 = new Musica();

        
        m1.nome = "Campo";
        m1.genero = "mpb";
        m1.autor = a1;

        System.out.println("Nome de m1: " + m1.nome);
        System.out.println("Genero de m1: " + m1.genero);
        System.out.println("Autor de m1: " + m1.autor.nome);

    }

}