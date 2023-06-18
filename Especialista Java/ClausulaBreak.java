import java.util.Scanner;
public class ClausulaBreak {

	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println(" Digite um dia para ver o horário de funcionamento da loja");
	System.out.print(" seg - ter - qua - qui sex - sab - dom:");
	
	String diaSemana = entrada.nextLine();
	
	//System.out.printf("O valor digitado foi: %s%n",diaSemana);
	
	switch (diaSemana){
	case "seg":
		System.out.printf("%s - Fechado", diaSemana);
	break;
	
	case "ter":
	case "qua":
	case "qui":
	case "sext":
		System.out.printf("%s - 08:00 às 18:00", diaSemana);
	break;	
	
	case "sab":
	case "dom":
		System.out.printf("%s - 08:00 às 12:00", diaSemana);
	break;
	}
	
}
}