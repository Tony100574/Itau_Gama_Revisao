import java.util.Scanner;

public class ObtendoTmanhoVariavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String senha;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Entre com senha");
		senha = teclado.next();
		System.out.println("A quantidade da senha e:  " + senha.length());
		
		if (senha.length() <= 4) {
			System.out.println("SENHA INVALIDA, a senha deve conter no minimo 6 digitos");
			
		}else if (senha.equals("gama@2022")){
			
			
			System.out.println("SENHA VALIDA!!");
		}else {
			System.out.println("SENHA INVALIDA!!");
		}
		}
			
	}


