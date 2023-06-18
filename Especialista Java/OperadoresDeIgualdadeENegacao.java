public class OperadoresDeIgualdadeENegacao {

	public static void main(String[] args) {
		
		int numero = 10;
		int numero2 = 11;
		int numero3 = 10;
		
		boolean ehIgual = numero == numero3; // != ??numero é igual de numero3??
		boolean ehIgual2 = !(numero == numero3); // O ! nega o resultado da operação booleanda. 
		boolean ehIgaul3 = numero != numero2; // != ??numero é diferente de numero2??
		
		System.out.printf("São Iguais: %b%n", ehIgual);
		System.out.printf("São Iguais: %b%n", ehIgual2);		
		System.out.printf("São Iguais: %b%n", ehIgaul3);		
	}
}