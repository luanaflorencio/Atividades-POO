public class User{
	String nickname;
	String username;
	Post[] posts;
}
	public static void main (String[] args){
		Post p1 = new Post ();

		p1.curtidas = 954;
		p1.data = 09.24.2019;
		p1.cometário = "massa";

		System.out.println("Quantidade de curtidas de p1: " + p1.curtidas);
		System.out.println("Data do post de p1: " + p1.data);
		System.out.println("Comentário do post de p1: " + p1.comentário);
	}
