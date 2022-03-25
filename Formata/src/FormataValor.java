import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.*;

public class FormataValor {
	
	public static void main(String[] args) {
		
		double dval = 20.2561;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Entre com valor desejado");
		dval = teclado.nextDouble();
	
		
		System.out.println("Valor da variavel" + dval);
		String format = "0.00";
		DecimalFormat formatter = new DecimalFormat(format);
		String newDval = formatter.format(dval);
		System.out.println("Novo valor formatado " + newDval);
	}

}
