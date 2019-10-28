/**
 *
 * @author luana
 */
public class Filme {
    private String nome;
    private String diretor;
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        if(nome == null || nome.length() == 0){
            return;
        }
        this.nome= nome;
    }
    public String getDiretor(){
        return this.diretor;
    }
    public void setDiretor(String diretor) {
        if(diretor == null || diretor.length() == 0){
            return;
        }
        this.diretor=diretor;    
    }
    public static void main(String[] args) {
        Filme f1 = new Filme();
        
        f1.setNome ("Bastardos Inglórios");
        f1.setDiretor ("Tarantino");
        
        System.out.println("Nome do filme f1: " + f1.nome);
        System.out.println("Diretor do filme f1: " + f1.diretor);
    }
    
}
