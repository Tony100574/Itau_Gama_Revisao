import java.util.Scanner;

public class CalculoTabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tabuada;
		System.out.println("Entre com numero tabuada"); 
		
		Scanner  teclado = new Scanner(System.in);
		tabuada = teclado.nextInt();
		
		for(int i = 1 ; i <= 10 ; i++) {
			
			
			
			System.out.println(i+ " x " + i * tabuada + " = "+ (i*tabuada));
			
		}

	}

}
