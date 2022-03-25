import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExemploArquivo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		String[] nomes = {"Marcos", "Pedro","Rogerio","Regina"};
		
		FileWriter arquivo = new FileWriter("/Users/tonysilva/Desktop/Funcionarios.txt");
		PrintWriter gravaArquivo = new PrintWriter(arquivo);
		
		gravaArquivo.printf("Registro de funcionarios\n");
		gravaArquivo.printf("Nome de Funcionarios \n");
		
		for (int contador = 0; contador <4; contador++) {
			gravaArquivo.print(nomes[contador]);
			
		}
		arquivo.close();
		System.out.println("O arquivo está sendo gravado em /Users/tonysilva/Desktop/Funcionarios.txt");

	}

}
