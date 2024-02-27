package URF;

import java.util.Locale;
import java.util.Scanner;

public class Ex1009 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, vendasEfe, comicao, salarioFi;
		
		String nome = sc.next();
		salario = sc.nextDouble();
		vendasEfe = sc.nextDouble();
		
		comicao = 0.15 * vendasEfe;
		salarioFi = comicao + salario;
		
		System.out.printf("TOTAL = R$ %.2f%n", salarioFi);
		
		sc.close();
	}

}
