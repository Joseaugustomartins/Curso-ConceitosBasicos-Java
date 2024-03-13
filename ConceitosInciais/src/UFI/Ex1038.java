package URF;

import java.util.Locale;
import java.util.Scanner;

public class Ex1038 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo, quantidade;

		codigo = sc.nextInt();
		quantidade = sc.nextInt();

		if (codigo == 1) {
			double soma = (double) quantidade * 4.00;
			System.out.printf("Total: R$ %.2f%n", soma);
		} else if (codigo == 2) {
			double soma = (double) quantidade * 4.50;
			System.out.printf("Total: R$ %.2f%n", soma);
		} else if (codigo == 3) {
			double soma = (double) quantidade * 5.00;
			System.out.printf("Total: R$ %.2f%n", soma);
		}else if(codigo == 4) {
			double soma = (double)quantidade * 2.00;
			System.out.printf("Total: R$ %.2f%n", soma);
		}else {
			double soma = (double) quantidade * 1.50;
			System.out.printf("Total: R$ %.2f%n", soma);
			
		}

		sc.close();
	}

}
