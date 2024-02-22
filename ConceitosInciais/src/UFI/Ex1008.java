package URF;

import java.util.Locale;
import java.util.Scanner;

public class Ex1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int num, horatraba;
		double valorHora,salario;
		
		num = sc.nextInt();
		horatraba = sc.nextInt();
		valorHora = sc.nextDouble();
		
		salario = horatraba * valorHora;
		
		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = U$ %.2f\n", salario);
		
		sc.close();
	}

}
