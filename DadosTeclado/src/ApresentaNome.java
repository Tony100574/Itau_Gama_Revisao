import java.util.Scanner;

public class ApresentaNome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		// String nome , sobrenome;
		// System.out.println("Entre com nome desejado");
		// nome = teclado.next();
		// System.out.println("Entre com seu sobrenome ");
		// sobrenome = teclado.next();

		// System.out.println("O Nome do usuario é : "+ nome +" " + sobrenome);

		// double valor, total, quantidade;
		// String produto;

		// System.out.println("Entre com quantidade de produto");
		// produto = teclado.next();

		// System.out.println("Entre com valor do produto");
		// valor = teclado.nextFloat();

		// System.out.println("Entre com a quantidade");
		// quantidade = teclado.nextFloat();

		// total = valor * quantidade;

		// System.out.println("O " + produto +" valor do estoque é: " + total);

		double nota1, nota2, media;
		String nome;

		System.out.println("Entre com seu nome ");
		nome = teclado.next();

		System.out.println("Entre com a nota 1 ");
		nota1 = teclado.nextFloat();

		System.out.println("Entre com a nota 2 ");
		nota2 = teclado.nextFloat();

		media = (nota1 + nota2) / 2;

		System.out.println("Aluno " + nome + " obteve a  media de nota é : " + media);

		// Criando processo de avaliação

		if (media < 5) {
			System.out.println("O aluno esta REPOVADO :(");

		} else if (media == 5) {
			System.out.println("Aluno esta de RECUPERAÇÃO");

		} else {
			System.out.println("O aluno esta APROVADO !!!! PARABENS :)");
		}

	}
}
