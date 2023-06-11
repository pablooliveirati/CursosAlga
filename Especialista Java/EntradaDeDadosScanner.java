import java.util.Scanner;
public class EntradaDeDados {

	public static void main(String[] args) {
	 
	 Scanner entrada = new Scanner(System.in);
	 
	 System.out.print("Digite o seu nome: ");
	 String nome = entrada.nextLine();
	 
	 System.out.print("Digite o seu peso: ");
	 int peso = entrada.nextInt();
	 
	 System.out.print("Digite a sua Altura: ");
	 double altura = entrada.nextDouble();
	 
	 double imc = peso / (altura * altura);
	 
	 System.out.printf("IMC de %s: %.2f%n", nome, imc);
	 
	 
	 
	}
}
	