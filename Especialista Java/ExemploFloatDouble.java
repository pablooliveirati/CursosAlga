public class ExemploFloatDouble {

	public static void main (String[] args) {
	
	double peso = 84.9d; // "d" é opcional. O sistema toda vez que colocamos um . de forma literal, ele entende que é double.
		
	System.out.println (peso);	
	
	// float taxa = 1_294.93; // Não compila pq o sistema entende que é um double.
	float taxa = 1_294.93f;
	
	System.out.println (taxa);
	
	}
	
}
		
	