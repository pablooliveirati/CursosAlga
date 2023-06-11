public class PromocaoAritmetrica {
	
	public static void main(String[] args) {
		
		byte a = 10;
		int b = 2;
		//byte resultadoAB = a + b; //Na soma de um byte com um int, temos a promoção do int, uma vez que o int é maior que o byte.
		//Para resolver, podemos mudar o tipo da variável, ou fazer um casting no resultado da operação aritmética, conforme abaixo.
		
		int resultadoAB = a + b;
		byte resultadoAB2 = (byte) (a + b);
			
		
		System.out.println(resultadoAB);
		System.out.println(resultadoAB2);
		
		//A promoção de uma operação aritmetrica entre um ponto flutuando e um número inteiro, sempre será promovido o valor do ponto flutuante,
		// mesmo no caso do número inteiro ser maior que o ponto flutuando como vemos no exemplo abaixo.
		long valor = 145L;
		float preco = 50f;
		
		long resultadoPontoFlutuante = (long) (valor + preco);
		
		System.out.println(resultadoPontoFlutuante);		
		
	}
}