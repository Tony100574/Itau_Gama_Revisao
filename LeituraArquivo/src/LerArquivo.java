import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.Buffer;

import javax.swing.JOptionPane;

public class LerArquivo {

	public static void main(String[] args) {
		
		String mostra = "";
		String nomeArq = "/Users/tonysilva/Desktop/Funcionarios.txt";
		String linha = "";
		File arq = new File (nomeArq);
		
		
		// Uma analise para verificar se arquivo existe
		
		if (arq.exists()) {
			mostra = ("Arquivo - "+ nomeArq+", Aberto com sucesso");
			//System.out.println(mostra);
			//System.out.println("Arquivo - "+ nomeArq+", Aberto com sucesso");
			
			
			mostra = "tamanho do arquivo"+ Long.toString(arq.length())+"\n";
			//System.out.println(mostra);
			
		//Processo de tentativa de leitura das informações contidas no arquivo
			
			try {
			
			FileReader reader = new FileReader(nomeArq);
			
			// Ler todo arquivo e armazenar no bufer da memoria
			
			BufferedReader leitor = new BufferedReader(reader);
			while(true) {
				linha = leitor.readLine();
			if(linha==null)
				
				break;
			mostra+=linha+ "\n";
			}
			}
		
			
			catch(Exception erro) {}
				//System.out.println("Conteudo Inexistente ");
				JOptionPane.showMessageDialog(null, mostra, "Arquivo" , 1);
				
			}
			else
				//System.out.println("Arquivo inexistente");
				JOptionPane.showMessageDialog(null, "Arquivo inexistente","Erro" , 0);
			
			
		}
	}

