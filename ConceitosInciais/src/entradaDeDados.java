import java.util.Locale;
import java.util.Scanner;

public class entradaDeDados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ok");
		
		String x;
		
		x = sc.next();
		System.out.println("seu nome: " + x);
		
		int y;
		y = sc.nextInt();
		System.out.println("sua idade: " + y);
		
		double z;
		z = sc.nextDouble();
		System.out.println("seu salario: " + z);
		
		/*double z1;
		z1 = sc.nextDouble();
		System.out.printf("Você digitou: %.2f%n", z1);*/
		
		char w;
		w = sc.next().charAt(0);
		System.out.println("Seu sexo: " + w);
		
		String a;
		int b;
		double c;
		
		a = sc.next();
		b = sc.nextInt();
		c = sc.nextDouble();
		System.out.println("Seu sexo: " + a);
		System.out.println("Seu sexo: " + b);
		System.out.println("Seu sexo: " + c);
		
		sc.close();
	}

}
