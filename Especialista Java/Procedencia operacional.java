// Desejável: Acima de 20 ng/ML
// Grupo de risco: 30 a 60 ng/ML

import java.util.Scanner;
public class PrecedenciaOperadores {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Grupo de risco: ");
		boolean grupoDeRisco = entrada.nextBoolean();
		
		System.out.print("Vitamina D: ");
		double vitaminaD = entrada.nextDouble();
		
		boolean resultadoNormal = (grupoDeRisco &&  vitaminaD >= 30 && vitaminaD <= 60) || (!grupoDeRisco && vitaminaD > 20);
		
		System.out.printf("Resultado Normal: %b%n", resultadoNormal);
		
	}
	
}