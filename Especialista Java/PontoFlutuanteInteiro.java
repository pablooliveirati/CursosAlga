public class Conversao {
	
	public static void main(String[] args) {
		
		double a = 10.4;
		// int b = a; // Não compila, deve-se fazer um casting.
		int b = (int) a; //O casting é obrigatório já que o compitador não converte de forma implicita.
		
		System.out.println(b);		
		
	}
}