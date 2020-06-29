import java.util.Locale;
import java.util.Scanner; //precisa importar isso antes de usar a funcao scanner

public class scanner {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		char w;
		
		x = sc.next(); //para string
		y = sc.nextInt(); //para numeros inteiros
		z = sc.nextDouble(); //para numeros reais (com virgula)- float
		w = sc.next().charAt(0); //para entradas de caracteres
		
		
		System.out.println("Você digitou a string : " + x);
		System.out.println("Você digitou o número inteiro : " + y);
		System.out.printf("Você digitou o número double: %.2f%n" , z);
		System.out.println("Você digitou o caracter: " + w);
		
		sc.close();
		
		
	}

	
}