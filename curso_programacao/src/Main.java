import java.util.Locale;
public class Main { //classe main - inicio da classe

	public static void main(String[] args) { //declara��o de fun��o- inicio da fun��o - define o enter point do programa (igual em C)
		//declara��o de variaveis
		int idade = 32;
		double x = 10.35784;
		String nome = "Maria";
		
		double renda = 4000.0;

		
		System.out.print("Ol� Mundo !");
		System.out.println(" Good Morning !!!!");
		System.out.println(idade);
		System.out.println(x);
		System.out.printf("%.2f%n", x); //define numero casas decimais
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f%n", x);
		
		//concatenar elementos de escrita
		System.out.println("RESULTADO = " + x + " METROS");
	
		//concatenar com printf (v�rios elementos) - %n � quebra de linha
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
	}

}
