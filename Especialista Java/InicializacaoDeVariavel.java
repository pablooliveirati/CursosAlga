import java.util.Scanner;

public class ValorFrete {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o preço do produto: ");
		double precoProduto = entrada.nextDouble();
		
		System.out.print("Paga frete: ");
		boolean frete = entrada.nextBoolean();
		
		double valorFrete = 0;
		
		if (frete) {
			System.out.print("Digite o valor do frete: ");
			valorFrete = entrada.nextDouble();
			precoProduto += valorFrete;
			System.out.printf("Preco do produto R$%.2f%n", precoProduto);
		} else {			
			System.out.printf("Valor da compra: R$%.2f%n", precoProduto );
		}			
	}
	
}