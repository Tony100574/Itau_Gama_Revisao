import java.util.Scanner;

public class ExemploCaso {

	
	public static void main(String[] args) {
		
		int funcoes;
		Scanner teclado = new Scanner(System.in);
		System.out.println("================================");
		System.out.println("Opção aritimetica apresentadas:   ");
		System.out.println("1 - Adição");
		System.out.println("2- subtração");
		System.out.println("3- multiplicção");
		System.out.println("2- divisão");
		System.out.println("=================================");
		System.out.println("Escolha a opção aritimetica desejada  ");
		
		
		// criando os tipos de casos
		
		
		switch(funcoes) {
		case 1:
			System.out.println("Adição");
			break;
			
		case 2:
			System.out.println("Subtração");
			break;
			
		case 3:
			System.out.println("Multiplicção");
			break;
			
		case 4:
			System.out.println("Divisão");
			break;
			
			default:
				System.out.println("Sair");
		}
	}
}
