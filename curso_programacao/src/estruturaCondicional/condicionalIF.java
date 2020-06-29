package estruturaCondicional;

import java.util.Scanner;

public class condicionalIF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if ( x >= 7 && x < 12) {
			System.out.println("Bom Dia");
		}
		else if (x >= 12 && x < 18) { 
			System.out.println("Boa Tarde");
		}
		else if (x > 18) {
			System.out.println("Boa Noite");
		}
		sc.close();
		
	}
}
