import java.util.Scanner;

public class ImputarValores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Criando as variaveis
		
		int num1, num2,total = 0, opcao = 0;
		
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
		
		
		opcao = teclado.nextInt();
		
		
		
		
		
		switch(opcao) {
		
		case 1:
			System.out.println("Adição");
			Adicao adicao = new Adicao();
			adicao.Adicao(num1, num2, total);
			break;
			
		case 2:
			System.out.println("Subtração");
			Subtracao sub = new Subtracao();
			sub.Subtracao(num1, num2, total);
			break;
			
		case 3:
			System.out.println("Multiplicção");
			Multiplicacao x = new Multiplicacao();
			x.Multiplicao(num1, num2, total);
			break;
			
		case 4:
			System.out.println("Divisão");
			Divisao div = new Divisao();
			div.Divisao(num1, num2, total);
			break;
			
			default:
				System.out.println("Sair");
		}
		
		
		}
	

		while(opcao < 5||opcao > 0);
}
	
}
		
		








