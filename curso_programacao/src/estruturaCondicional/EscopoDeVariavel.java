package estruturaCondicional;
import java.util.Scanner;

public class EscopoDeVariavel {

	public static void main(String[] args) {
		// não é possivel utilizar uma varuavel que não foi inicializada
		// estruturas de repetição tem seu proprio escopo. Se voce declarar uma variavel
		// dentro de um bloco if, só podera
		// usar essa variavel dentro daquele bloco.
		
		Scanner sc = new Scanner(System.in);
		
		double price = sc.nextDouble();
		double discount = 0; // assim a variavel nao fica visivel apenas dentro do bloco if
		
		if (price > 100.0) {
			discount = price * 0.1;
		}
		
		System.out.println(discount); // discount existe apenas dentro do bloco if
		sc.close();
	}

}
