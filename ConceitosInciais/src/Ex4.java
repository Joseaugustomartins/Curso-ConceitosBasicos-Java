import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, notaFinal;
		
		System.out.print("Qual sua primeira nota? ");
		nota1 = sc.nextDouble();
		
		System.out.print("Qual sua segunda nota? ");
		nota2 = sc.nextDouble();
		
		notaFinal = nota1 + nota2; 
		
		System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
		
		if(notaFinal < 60.0) {
			System.out.println("REPROVADO");
		}
		
		sc.close();
	}

}
