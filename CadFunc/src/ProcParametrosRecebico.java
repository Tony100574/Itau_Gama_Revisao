
public class ProcParametrosRecebico {
	
	
	//criando metodo dentro desta classe
	public void mensagem(String nome, String email, int idade) {
		
		System.out.println("O nome do funcionario é " + nome +", tem a idade de " + idade +" anos e  o email fornecido é " + email);
		
	}
	
	public void anonasc(String nome,int idade) {
		System.out.println("O nome do funcionario é "+ nome+ ", o ano de nascimento é " + (2022 - idade));
	}

}
