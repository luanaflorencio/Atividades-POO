public class JogoEletronico {
    private String nome;
    private String genero;
    private int ano;

    public JogoEletronico(String nome, String genero, int ano) {
        this.setNome(nome);
        this.setGenero(genero);
        this.setAno(ano);
    }

    private JogoEletronico(String nome, String genero) {
        this(nome, genero, 0);
    }
    
        public String getNome(){
            return this.nome;
        }
        public void setNome(String nome){
            if(nome == null || nome.length() == 0){
                return;
            } 
            this.nome = nome;
        }
        
        public String getGenero(){
             return this.genero;
        }
        public void setGenero(String genero){
            if(genero == null || genero.length() == 0){
                return;
            }
            this.genero = genero;
        }
        public int getAno(){
            return this.ano;
        }
        public void setAno(int ano){
            if(ano < 0){
                return;
            } 
            this.ano = ano;
        }
        
        
    public static void main(String[] args) {
        JogoEletronico j1 = new JogoEletronico("D&D", "Aventura", 1980);



        System.out.println("O nome desse jogo eh " + j1.nome);
        System.out.println("Seu genero eh " + j1.genero);
        System.out.println("Seu ano eh " + j1.ano);
    }
    
}
