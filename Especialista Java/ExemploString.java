public class ExemploString {
	public static void main(String[] args) {
		
		int idade = 30;
		int idade2 = 35;
		int somaIdade = idade + idade2;
		
		
		System.out.println ("A soma das idade é : " + somaIdade); // Estamos concatenando um String com um int, o complidador entende como
		//testo e imprime "A soma das idades é : 65.
		
		// Agora eu quero fazer a operação de soma das idades junto com a concatenação do String.
		System.out.println ("A soma das idade é : " + idade + idade2); // O resultado será "A soma das idades é : 3035. O compipador
		//não entende que queremos fazer um operação aritmetrica e sim concatenar Strings, Isso acontece pq o String está na frente.

		//Se fizermos assim funciona...
		System.out.println (idade + idade2 + " É a soma das idade"); // Funciona pq o complidador ver dois números inteiros na frente e fazer
		//o cálculo.
		
		//A forma correta de fazer é assim...
		
		System.out.println ("A soma das idade é : " + (idade + idade2));		
		
		
	}
	
}