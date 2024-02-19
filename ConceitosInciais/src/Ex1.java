
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Qual largura do terreno? (m) ");
		double x = sc.nextDouble();
		
		System.out.print("Qual comprimento do terreno? (m) ");
		double y = sc.nextDouble();
		
		System.out.print("Qual valor do metro quadrado do terreno? R$");
		double p = sc.nextDouble();
		
		System.out.println();
		
		System.out.printf("A largura e de: %.1f%n", x);
		System.out.printf("O comprimento e de: %.1f%n", y);
		System.out.printf("O metro quadrado custa: %.2f%n", p);
		
		double area = y * x;
		double valor = area * p;
		
		System.out.println();
		
		System.out.printf("O valor da area e: %.2f%n", area);
		System.out.printf("O preço do terreno e: %.2f%n", valor);

				
		sc.close();
	}

}
