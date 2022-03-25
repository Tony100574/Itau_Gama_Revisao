
public class Contato {
	
	
	//Declaração das vaiaveis privadas
	private String nome;
	private String email;

	
	//Criaçaõ do metodo de captura das vaiaveis
	
	public Contato(String nome, String email) {
		this.nome = nome;
		this.email = email;
		
	}

	//Inserindo Gettes e setters
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
