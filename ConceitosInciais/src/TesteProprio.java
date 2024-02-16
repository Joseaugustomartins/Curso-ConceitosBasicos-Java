import java.util.Scanner;

public class TesteProprio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String x = sc.nextLine();
		
		System.out.print("Digite sua idade: ");
		int y = sc.nextInt();
		
		System.out.print("Qual seu sálario: ");
		double z = sc.nextDouble();
		
		System.out.print("Qual seu genero: (M/F/I)");
		char w = sc.next().charAt(0);
		
		System.out.printf("Olá, seja bem vindo Sr %s, do sexo %c atualmente você possui %d anos, correto? %nConsta no nosso sistema que você recebe um salario de R$ %.4f",
				x, w, y, z);
		
		sc.close();
	}

}
