import java.util.Scanner;
public class EstruturaDoWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int qtdNumerosJogos = 0;
		int numeroAtual = 1;
		String numerosEscolhidos = "";
		
		do {
			
		System.out.print("Digite a quantidade de números: ");
		
		qtdNumerosJogos = entrada.nextInt();
		
		if (qtdNumerosJogos < 6 || qtdNumerosJogos > 10 ) {
			
			System.out.println("O número deve ser de 6 a 10");			
			
		} else {
			
			do {	
			System.out.printf("Digite o número %d/%d: ", numeroAtual, qtdNumerosJogos);	
			
			int numero = entrada.nextInt();		
			
			
			numerosEscolhidos += numero + " ";
			
			numeroAtual++;		
			
			
		} while (numeroAtual <= qtdNumerosJogos); 						
		} 	
		
	} while (qtdNumerosJogos < 6 || qtdNumerosJogos > 10);
	
	System.out.printf("Numeros escolhidos %s%n", numerosEscolhidos);
}
}

