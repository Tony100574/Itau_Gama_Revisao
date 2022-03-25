import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CadastroFuncionario {
	
	



		public static void main(String[] args)throws IOException {
			// TODO Auto-generated method stub
			
		
			
			String[] Nome_Funcionario = new String[4];
			String[] Idade_Funcionario = new String[4];
			String[] Email_Funcionario = new String[4];
			
			
		
			
			for( int contador = 0 ; contador <= 3; contador++) {
				
				Scanner teclado = new Scanner (System.in);
				
				System.out.println("Entre com o Nome do " + (contador+1 ) + "º Funcionario : ");
				Nome_Funcionario[contador] = teclado.next();
				
				System.out.println("Entre com a Idade " + (contador+1 ) + "º Funcionario : ");
				Idade_Funcionario[contador] = teclado.next();
				
				System.out.println("Entre com o  E mail " + (contador+1 ) + "º Funcionario : ");
				Email_Funcionario[contador] = teclado.next();
				
				System.out.println("* Proximo *\n");
				
				
			}
			
			FileWriter arquivo = new FileWriter("/Users/tonysilva/Desktop/ProjetoFuncionarios.txt");
			PrintWriter gravaArquivo = new PrintWriter(arquivo);
			
			
			for(int i =0 ; i < 4;i++) {
				System.out.println("Funcionario " + (i+1) +" : "+ Nome_Funcionario[i] + "  Idade:  " + Idade_Funcionario[i] + "  E-mail: "+ Email_Funcionario[i]+"\n" );
				gravaArquivo.print(Nome_Funcionario[i]);
				
				//System.out.println( "Funcionario "+(i+1)  +"  Idade  : " +);
				//System.out.println( "  Funcionario " +(i+1) + "  E-mail: ");
			}
			arquivo.close();
			System.out.println("O arquivo está sendo gravado em /Users/tonysilva/Desktop/Funcionarios.txt");

			
		}

		
		/*FileWriter arquivo = new FileWriter("/Users/tonysilva/Desktop/ProjetoFuncionarios.txt");
		PrintWriter gravaArquivo = new PrintWriter(arquivo);
		
			//gravaArquivo.printf("Registro de funcionarios\n");
			//gravaArquivo.printf("Nome de Funcionarios \n");
		
		for (int contador = 0; contador < 3; contador++) {
			gravaArquivo.print(Nome_Funcionario[contador]);*/
			
		}

	



