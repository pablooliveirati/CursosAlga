//Quando usar for e quando usar while?? 
//O for vamos usar quando sabemos exatamente a quantidade de execução antes de entrar na interação.
//O while vamos usar quando não sabemos a quantidade de execução antes de entrar na interação.

import java.util.Scanner;
public class EstruturaFor {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double pesoAeronave = 0;		
		
		System.out.print("Quantidade de passageiros: ");		
		int quantidadePassageiros = entrada.nextInt();	
		
		System.out.print("Peso Máximo Aeronave: ");		
		int pesoMaximoPermitido = entrada.nextInt();	
		
		
		for (int i = 1 ; i <= quantidadePassageiros ; i++) {
			System.out.print("Peso Passageiro #: ");		
			double peso = entrada.nextDouble();
			pesoAeronave += peso;
		
		}						
		
		System.out.printf("Peso total Aeronave %.2f%n", pesoAeronave);
		System.out.printf("Peso Permitido %d%n", pesoMaximoPermitido);
		System.out.printf("Peso Permitido %s%n", pesoAeronave <= pesoMaximoPermitido
			? "Aeronave Apta para Vôo" : "Peso Excedido");	
		
		
	}
	
}