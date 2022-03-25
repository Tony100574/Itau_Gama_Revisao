import java.util.ArrayList;

public class Dados {
	
	
	ArrayList<Clientes> cliente = new ArrayList<>();
	
	
	public void cadastrarCliente(Clientes cliente) {
		Clientes.add(cliente);
	}
	
	public String numeroDeContas() {
		return cliente.size() + "";
	}

}
anivaol*