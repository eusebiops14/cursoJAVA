import java.util.Locale;
public class Main { //classe main - inicio da classe

	public static void main(String[] args) { //declaração de função- inicio da função - define o enter point do programa (igual em C)
		//declaração de variaveis
		int idade = 32;
		double x = 10.35784;
		String nome = "Maria";
		
		double renda = 4000.0;

		
		System.out.print("Olá Mundo !");
		System.out.println(" Good Morning !!!!");
		System.out.println(idade);
		System.out.println(x);
		System.out.printf("%.2f%n", x); //define numero casas decimais
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f%n", x);
		
		//concatenar elementos de escrita
		System.out.println("RESULTADO = " + x + " METROS");
	
		//concatenar com printf (vários elementos) - %n é quebra de linha
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
	}

}
