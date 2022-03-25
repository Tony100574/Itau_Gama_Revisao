import java.util.Scanner;

public class ExecutaCadFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		String email;
		int idade;
		
		Scanner teclado = new  Scanner(System.in);
		System.out.println("Digite um nome");
		nome  =teclado.nextLine();
		
		System.out.println("Digite um email");
		email  =teclado.nextLine();
		
		System.out.println("Digite a idade");
		idade  =teclado.nextInt();
		
		System.out.println(nome);
		
		//executando a chamada da classe e fazendo a passagem de parametro ao seu metodo
		ProcParametrosRecebico executar = new ProcParametrosRecebico();
		executar.mensagem(nome, email, idade);
		
		// executando a chamada da classe com metodo para saber o anor de nascimento
		
		ProcParametrosRecebico processa = new ProcParametrosRecebico();
		processa.anonasc(nome, idade);

	}

}
