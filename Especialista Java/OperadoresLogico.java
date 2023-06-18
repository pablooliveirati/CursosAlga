import java.util.Scanner;
public class CalculoCortisol {

	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Digite o seu cortisol: ");
	double cortisol = entrada.nextDouble();
	
	boolean resultadoNormal = cortisol >= 6 && cortisol <= 18.4;
	System.out.printf("Resultado normal: %b%n", resultadoNormal);
	
	boolean resultadoAnormal = cortisol < 6 || cortisol > 18.4;
	System.out.printf("Resultado anormal: %b%n", resultadoAnormal);
	
		
		
	}
}