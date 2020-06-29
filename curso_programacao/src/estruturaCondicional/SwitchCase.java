package estruturaCondicional;

import java.util.Scanner; //necessario para ler dados de entrada

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String dia;
		switch (x) {//baseado no valor de x
		case 1:
		dia = "domingo";
		break; //usar break no final de cada caso
		case 2:
		dia = "segunda";
		break;
		case 3:
		dia = "terca";
		break;
		case 4:
		dia = "quarta";
		break;
		case 5:
		dia = "quinta";
		break;
		case 6:
		dia = "sexta";
		break;
		case 7:
		dia = "sabado";
		break;
		default: //valor padrão
		dia = "valor invalido";
		break;
		}
		System.out.println("Dia da semana: " + dia);
		sc.close();

	}

}

//expressao condicional ternaria
/*
 * ( condição ) ? valor_se_verdadeiro : valor_se_falso
double preco = 34.5;
double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
*/

