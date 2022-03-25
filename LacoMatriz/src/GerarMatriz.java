import java.util.Scanner;

public class GerarMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//criando a variavel da nossa matriz
		
		String[] nomeFuncionario = new String[5];
		
		//Criando o nosso laço de repetição com For
		
		for( int contador = 0 ; contador <= 2; contador++) {
			
			Scanner teclado = new Scanner (System.in);
			
			System.out.println("Entre com o " + (contador+1 ) + "º Funcionario : ");
			nomeFuncionario[contador] = teclado.next();
			
						
			
		}
		for(int i =0 ; i <3 ;i++) {
			System.out.println((i+1) + "  Funcionario  :  " +nomeFuncionario[i]);
		}
		
		
	}

}
