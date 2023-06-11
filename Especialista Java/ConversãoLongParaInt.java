public class Conversao {

	public static void main (String[] args) {
		
		long a = 10;
		//int b = a; // Não é possível converter implicitamente.
		int b = (int) a;
		
		System.out.println(b);
		
		long c = 4587454454587L;
		int d = (int) c;
		
		System.out.println(d);
		
		int e = 10;
		long f = e; //Instrução de casting é opcional
		
		System.out.println(f);
	}
	
	
	
}