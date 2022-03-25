import java.util.ArrayList;

public class ExecutaLista {

	public static void main(String[] args) {
		
		
		//Criando um Array simples
		
		/*ArrayList contatos = new ArrayList();
		
		contatos.add("Ricardo");
		contatos.add("Marcos");
		contatos.add("Tony");
		contatos.add("Guga");
		contatos.add("Lisa");
		
		
		for(Object nome:contatos) {
			System.out.println(nome);*/
		
		
		
		ArrayList<Contato> contatos = new ArrayList<>();
		
		Contato contato1 = new Contato("Tony Silva", "tony@email.com");
		Contato contato2 = new Contato("Lisa Silva", "lisa@email.com");
		Contato contato3 = new Contato("Guga Silva", "guga@email.com");
		Contato contato4 = new Contato("Mara Silva", "mara@email.com");
		Contato contato5 = new Contato("Ana Silva", "ana@email.com");
		
		
		contatos.add(contato1);
		contatos.add(contato2);
		contatos.add(contato3);
		contatos.add(contato4);
		contatos.add(contato5);
		
		for(Contato c:contatos) {
			
			System.out.println(c.getNome()+"- " + c.getEmail());
			
		}
		//Quantidade de registro dentro do List
		System.out.println("Total de itens  "+ contatos.size());
		//Mostra o conteudo esta dentro do Array
		System.out.println(contatos.contains(contato3));
		// Mostra  o registro na posição
		System.out.println(contatos.get(2).getNome());

	}

}
