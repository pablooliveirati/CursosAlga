import java.util.Scanner;
public class CalculoIMC {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.print("Digite a sua altura: ");
		double altura = entrada.nextDouble();
		
		double imc =  peso / (altura * altura);		
		
		if (imc < 18.5) {
			System.out.println("Peso abaixo do ideal");
		} else if (imc < 25) {
			System.out.println("Peso ideal");
		} else if (imc < 30) {
			System.out.println("Acima do peso");
		}	
			System.out.println("Fim do Programa");				
			
	}
}