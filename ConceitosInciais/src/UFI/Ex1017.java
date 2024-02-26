package URF;

import java.util.Locale;
import java.util.Scanner;

public class Ex1017 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new  Scanner(System.in);
		
		int tempoG, velocidade;
		double combustivel;
		
		tempoG = sc.nextInt();
		velocidade = sc.nextInt();

		combustivel = (double) tempoG * velocidade / 12;
		
		System.out.printf("%.3f%n", combustivel);
		
		sc.close();
	}

}
