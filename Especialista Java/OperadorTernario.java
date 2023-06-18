public class OperadorTernario {
	
	public static void main(String[] args) {
		
		char produtoOuServico = 'P';
		double valorProdutoOuServico = 100;
		double imposto = 0;
		double imposto2 = 0;
		/*
		if (produtoOuServico == 'S') {
			imposto = valorProdutoOuServico * 0.15;
		} else {
				imposto = valorProdutoOuServico * 0.35;
			}	
		*/
		
		// A expressão abaixo corresponde ao mesmo que o código a cima:		
		imposto = produtoOuServico == 'S' ? valorProdutoOuServico * 0.15 : valorProdutoOuServico * 0.35;
		
		//Também podemos colocar tenário dentro de tenário, por exemplo:		
		imposto2 = produtoOuServico == 'S' ? valorProdutoOuServico * 0.15 
				: valorProdutoOuServico > 99 
					? valorProdutoOuServico * 0.20
					: valorProdutoOuServico * 0.35;
		
		System.out.println("O valor do imposto é: " + imposto);
		System.out.print("O valor do imposto é: " + imposto2);
	}
	
}