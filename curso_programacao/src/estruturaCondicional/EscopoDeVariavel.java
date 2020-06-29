package estruturaCondicional;
import java.util.Scanner;

public class EscopoDeVariavel {

	public static void main(String[] args) {
		// n�o � possivel utilizar uma varuavel que n�o foi inicializada
		// estruturas de repeti��o tem seu proprio escopo. Se voce declarar uma variavel
		// dentro de um bloco if, s� podera
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
