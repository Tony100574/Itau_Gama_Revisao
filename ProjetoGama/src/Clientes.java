
public class Clientes {
	
	
	private String ag;
	private String conta;
	private String nome;
	private String email;
	private String telefone;

	public Clientes ( String ag, String conta, String nome, String email, String telefone) {
		this.ag = ag;
		this.conta = conta;
		this.email = email;
		this.nome = nome;
		this.telefone = telefone;
		
		
		
}

	public Clientes(String ag, String conta, String nome, String email, String telefone, String saldo) {
		// TODO Auto-generated constructor stub
	}

	public String getAg() {
		return ag;
	}

	public void setAg(String ag) {
		this.ag = ag;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome + " - " + ag + " - " + conta + " - "+ telefone +" - "+ email;
	}

	public static void add(Clientes cliente) {
		// TODO Auto-generated method stub
		
	}


}
