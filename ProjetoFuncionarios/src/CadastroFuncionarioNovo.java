import java.io.Serializable;
import java.util.Scanner;

public class CadastroFuncionarioNovo {

	
	private String nome_Funcionario;
	private String Idade_Funcionario;
	private String email_Funcionario;
	
	
	public void Funcionario (String nome_Funcionario, String Idade_Funcionario, String email_Funcionario) {
		this.nome_Funcionario = nome_Funcionario;
		this.Idade_Funcionario = Idade_Funcionario;
		this.email_Funcionario = email_Funcionario;
		
	}
	
	public String getNome_Funcionario() {
		return nome_Funcionario;
	}
	
	public String setNome_Funcionario(String string) {
		return this.nome_Funcionario = string;
	}
	
	public String getIdade_Funcionario() {
		return Idade_Funcionario;
	}
	
	public String setIdade_Funcionario(String string) {
		return Idade_Funcionario = string;
	}
	
	public String getEmail_Funcionario() {
		return email_Funcionario;
	}
	
	public String setEmail_Funcionario(String teclado) {
		return this.email_Funcionario = toString();
	}
	
}
