public class SaidaComPrintf {

	public static void main(String[] args) {
		
		//Quero imprimir "Eu tenho 31 anos"
		int idade = 31; 
		System.out.printf("Eu tenho %d anos %n ", idade); // usamos o %d para aceitar um parametro de números inteiros e o %n para pular a linha.
		
		//Quero imprimir "Meu nome é: Pablo
		String nome = "Pablo";
		System.out.printf("Meu nome é: %s%n", nome); // Usamos o %s para aceitar um parametro de String.
		
		//Quero imprimir Eu vou ganhar 200.000.00 por mês em 2 anos;
		double salario = 200_000.00D;
		System.out.printf("Eu vou ganhar %2.3f por mês em 2 anos", salario); // O 2 siginfica que quero minimamente 2 casas.
		//O 3 quer dizer que quero 3 casas decimais depois da virgula. %f para aceitar um parametro de ponto flutuante.
		
		
		
	}
	
}