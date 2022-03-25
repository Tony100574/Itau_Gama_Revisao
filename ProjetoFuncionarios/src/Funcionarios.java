import java.util.Scanner;

public class Funcionarios extends CadastroFuncionarioNovo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		CadastroFuncionarioNovo f01 = new CadastroFuncionarioNovo();
		System.out.println("Entre com o nome do funcionario");
		f01.setNome_Funcionario(teclado.next());
		

		
		System.out.println("Entre com o idade do funcionario");
		f01.setIdade_Funcionario(teclado.next());
		
		System.out.println("Entre com o email do funcionario");
		f01.setEmail_Funcionario(teclado.next());
		
		System.out.println(f01.getNome_Funcionario());
		System.out.println(f01.getIdade_Funcionario());
		System.out.println(f01.getEmail_Funcionario());

		/*CadastroFuncionario f02 = new CadastroFuncionario();
		f01.setEmail_Funcionario("Maira Lopes");
		f01.setIdade_Funcionario(34);
		f01.setEmail_Funcionario("mairalopes@email.com");

		CadastroFuncionario f03 = new CadastroFuncionario();
		f01.setEmail_Funcionario("Paulo Santos");
		f01.setIdade_Funcionario(32);
		f01.setEmail_Funcionario("paulosantos@email.com");

		CadastroFuncionario f04 = new CadastroFuncionario();
		f01.setEmail_Funcionario("Paulo Santos");
		f01.setIdade_Funcionario(32);
		f01.setEmail_Funcionario("paulosantos@email.com");*/
	}

}
