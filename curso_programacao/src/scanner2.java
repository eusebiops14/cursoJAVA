
// crtl + shift + f = auto identa��o do c�digo
import java.util.Scanner;

public class scanner2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		String s1, s2, s3;
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine(); //le um texto at� a quebra de linha
		s2 = sc.nextLine(); //se usar apenas o sc.next ele vai ler apenas at� o fim da primeira palavra
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	
	}
}