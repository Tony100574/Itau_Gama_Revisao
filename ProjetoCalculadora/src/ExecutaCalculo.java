import java.util.Scanner;

public class ExecutaCalculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Criando as variaveis
		
		int num1, num2,total, calculadora = 0;
		
		// pegando as informações
		Scanner teclado =new Scanner(System.in);
		
		do {
		System.out.println("Entre com primeiro valor:  ");
		num1 = teclado.nextInt();
		
		System.out.println("Entre com segundo numero:  ");
		num2 = teclado.nextInt();
		
		System.out.println("entre com opração desejada"); 
		System.out.println("1 - Adição");
		System.out.println("2- subtração");
		System.out.println("3- multiplicção");
		System.out.println("4- divisão");
		
		
		calculadora = teclado.nextInt();
		
		
		
		
		
		switch(calculadora) {
		
		case 1:
			System.out.println("Adição");
			total = num1 + num2;
			System.out.println(num1 + " + "+num2+" = "+total);
			break;
			
		case 2:
			System.out.println("Subtração");
			total = num1 - num2;
			System.out.println(num1 + " - "+ num2 +" = "+total);
			break;
			
		case 3:
			System.out.println("Multiplicção");
			total = num1 * num2;
			System.out.println(num1 + " X "+ num2 +" = "+total);
			break;
			
		case 4:
			System.out.println("Divisão");
			total = num1 / num2;
			System.out.println(num1 + " / "+ num2 +" = "+total);
			break;
			
			default:
				System.out.println("Sair");
		}
		
		
		}
	

		while(calculadora<5||calculadora>0);
}
	
}
		
		








