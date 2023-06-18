public class OperadoresDeComparacao {

	public static void main(String[] args) {
		int pesoCarga = 700;
		int limiteCarga = 1000;
		
		boolean liberado = pesoCarga <= limiteCarga; // Se pesoCarga for menor ou igual a limiteCarga será retornado True caso contrário False
		boolean liberad2 = limiteCarga >= pesoCarga;
		
		System.out.printf("Carga liberada: %b%n", liberado);
		System.out.printf("Carga liberada: %b%n", liberad2);
	}
	
}